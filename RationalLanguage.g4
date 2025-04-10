grammar RationalLanguage;

@header {
    import java.util.HashMap;
}

@members {
    HashMap<String, Info> t = new HashMap<>();
    int sp = 0;
    int label = 0;
    int opCounter = 0;

class Info {
    Integer add;
    String type;
    Integer adds;

    public Info(Integer add, Integer adds, String type) {
        this.add = add;
        this.type = type;
        this.adds = adds;
    }
}

    public String P;
}

calcul returns [String code]
    @init{ $code = new String(); }
    @after{ System.out.println($code); }
    : (declaration { $code += $declaration.code; })* (SEMICOLON | NEWLINE)* (instruction { $code += $instruction.code;})* { $code += " HALT\n"; }
    ;

finInstruction
    : (SEMICOLON)+ (NEWLINE)*
    ;

//DECLARATION

declaration returns [String code]
    : a = TYPE b = ID finInstruction 
    {
        $code = "PUSHI 0\n"; // Default initialization
        if ($a.text.equals("float"))
        {
            $code += "PUSHI 0\n";
            Info obj = new Info(sp++,sp++,$a.text);
            t.put($b.text, obj);
        }
        else 
        {
            Info obj = new Info(sp++,-1, $a.text);
            t.put($b.text, obj);    
        }
        opCounter = sp;
    }
;

//INSTRUCTION

instruction returns [String code]
    : affectation finInstruction { $code = $affectation.code; }
    | operations finInstruction { $code = $operations.code; }
    | afficher finInstruction { $code = $afficher.code;}
    | terinary finInstruction { $code = $terinary.code; }
    | boucle finInstruction { $code = $boucle.code; }
    | exprC { $code = $exprC.code; }
    | function finInstruction { $code = $function.code; } 
;

expression returns [Integer num, Integer denum, String type, Boolean declared]
    : a = rationnel { $num = $a.num; $denum = $a.denum; $type = $a.type; $declared = $a.declared;}
    | b = integer { $num = $b.num; $denum = $b.denum; $type = $b.type; $declared = $b.declared;}
    | c = variable { $num = $c.num; $denum = $c.denum; $type = $c.type; $declared = $c.declared;}
;

integer returns [Integer num, Integer denum, String type, Boolean declared]
    : a = INT
    {
        $num = $a.int;
        $denum = 1;
        $type = "int";
        $declared = false;
    }
;

rationnel returns [Integer num, Integer denum, String type, Boolean declared]
    : a = integer '/' b = integer
    {
        $num = $a.num;
        $denum = $b.num;
        $type = "float";
        $declared = false;
    }
;

booleen returns [String code]
    : a = BOOL
    {
        $code = ($a.text.equals("1")) ?"PUSHI 1\n" : "PUSHI 0\n";
    }
;

variable returns [Integer num, Integer denum, String type, Boolean declared]
    : a = ID
    {
        if (t.containsKey($a.text)){
            if (t.get($a.text).type.equals("float"))
            {
                $num = t.get($a.text).adds;
                $denum = t.get($a.text).add;
                $type = "float";
                $declared = true;
            }
            else
            { 
                $num = t.get($a.text).add;
                $denum = 1;
                $type = "int";
                $declared = true;
            }
        }
        else
            System.out.println("Variable non declares");
    }
;


//CONDITION

exprC returns [String code]
    : a = condition 
    {
        $code = $a.value == 1 ? "PUSHI 1\n" : "PUSHI 0\n"; 
    }
;

condition returns [Integer value]
    : 'not' a= condition {$value = $a.value == 0 ? 1 : 0;} 
    | a= condition ' and ' b= condition {$value = $a.value != 0 && $b.value != 0 ? 1 : 0;}
    | a= condition ' or ' b= condition {$value = $a.value != 0 || $b.value != 0 ? 1 : 0;}
    | 'true' {$value = 1;}
    | 'false' {$value = 0;}
    | '(' a= condition ')' {$value = $a.value;}
;

//TERINARY OPERATOR

expT returns [String code]
    : b = affectation { $code = $b.code; }
    | c = operations { $code = $c.code; }
    | d = afficher {$code = $d.code; }
    | e = terinary { $code = $e.code; }
    | f = boucle { $code = $f.code; }
;

terinary returns [String code]
    : a = exprC '?' b = expT ':' c = expT
    {
        $code = $a.code;
        $code += "JUMPF " + (label + 1) + "\n";
        $code += "LABEL " + label++ + "\n";
        $code += $b.code;
        $code += "JUMP " + (label + 1) + "\n";
        $code += "LABEL " + label++ + "\n";
        $code += $c.code;
        $code += "LABEL " + label++ + "\n";
    }
;


// BOUCLE
boucle returns [String code]
    : 'repeter' a= blocInstructions 'jusque' b= finboucle
    {
        $code = "LABEL " + label++ + "\n";
        $code += $a.code;    
        $code += $b.code;
        $code += "JUMPF " + (label) + "\n";
        $code += "JUMP " + (label - 1) + "\n";
        $code += "LABEL " + (label++) + "\n";
    }
;


blocInstructions returns [String code]
    : '{\n'  (a = instruction { $code += "# haaadi lbdya dl instruction \n" + $a.code + "# haaadi lmsalia instruction \n"; })* '\n}'{}
    ;


finboucle returns [String code]
    : exprC
    {
        $code = $exprC.code;
    }
    | 'false' { $code = "PUSHI 0\n";}
    | operations { $code = $operations.code; }
;
// OPERATIONS

operations returns [String code, Integer num, Integer denum, Boolean declared, String type]
    : a = operations MD = (':' | '*') b = operations // A VOIR
    {
            $code = "";
            if (!$a.code.isEmpty())
                $code += $a.code;
            if (!$b.code.isEmpty())
                $code += $b.code;
            
            P =  (!$a.declared || $a.type.equals("int")) ? "I" : "G" ;
            $code += "PUSH"+ P +" "+ $a.num + "\n";
            if ($MD.text.equals("*")){
                P = !$b.declared || $b.type.equals("int") ? "I" : "G";
                $code += "PUSH"+ P +" "+ $b.num + "\n";
            }
            else{
                P = !$b.declared ? "I" : "G";
                $code += "PUSH"+ P +" "+ $b.denum + "\n";
            }
            $code += "MUL\n";
            
            P = !$a.declared ? "I" : "G";
            $code += "PUSH"+ P +" "+ $a.denum + "\n";
            if ($MD.text.equals("*")){
                P = !$b.declared ? "I" : "G";
                $code += "PUSH"+ P +" "+ $b.denum + "\n";
            }
            else{
                P = !$b.declared || $b.type.equals("int") ? "I" : "G";
                $code += "PUSH"+ P +" "+ $b.num + "\n";
            }
            $code += "MUL\n";
            

            $denum = opCounter++;
            $num = opCounter++;
            $type = "float";
            $declared = true;
            if (opCounter > sp + 3)
                opCounter = sp + 1;
    }
    | a = operations AS b = operations
    {
            $code = "";
            if (!$a.code.isEmpty())
                $code += $a.code;
            if (!$b.code.isEmpty())
                $code += $b.code;
    
            P = (!$b.declared || $b.type.equals("int")) ? "I" : "G";
            $code += "PUSH"+ P +" "+ $b.denum + "\n";
            P = !$a.declared ? "I" : "G";
            $code += "PUSH"+ P +" "+ $a.num + "\n";
            $code += "MUL\n";
            P = !$b.declared ? "I" : "G";
            $code += "PUSH"+ P +" "+ $b.num + "\n";
            P = (!$a.declared || $a.type.equals("int")) ? "I" : "G";
            $code += "PUSH"+ P +" "+ $a.denum + "\n";
            $code += "MUL\n";
            if ($AS.text.equals("+"))
                $code += "ADD\n";
            else
                $code += "SUB\n";

            P = (!$a.declared || $a.type.equals("int")) ? "I" : "G";
            $code += "PUSH"+ P +" "+ $a.denum + "\n";
            P = (!$b.declared || $b.type.equals("int")) ? "I" : "G";
            $code += "PUSH"+ P +" "+ $b.denum + "\n";
            $code += "MUL\n";
            
            $denum = opCounter++;
            $num = opCounter++;
            $type = "float";
            $declared = true;
            if (opCounter > sp + 3)
                opCounter = sp + 1;
    }
    | '(' a = operations ')'
    {
        $code = $a.code;
        $denum = $a.denum;
        $num = $a.num;
        $type = $a.type;
        $declared = $a.declared;
    }
    | c = expression
    {
        $code = "";
        $denum = $c.denum;
        $num = $c.num;
        $type = $c.type;
        $declared = $c.declared;    
    }
    | '['a = operations ']'
    {
        $code = "";
        if (!$a.code.isEmpty())
            $code += $a.code;
        P = !$a.declared ? "I" : "G";
        $code += "PUSH"+ P +" "+ $a.num + "\n";
        $code += "PUSHI 100\n";
        $code += "MUL\n";
        $code += "PUSH"+ P +" "+ $a.denum + "\n";
        $code += "DIV\n";
        $code += "PUSHI 50\n";
        $code += "ADD\n";
        $code += "PUSHI 100\n";
        $code += "DIV\n";
        $denum = $a.denum; 
        $num = $a.num;
        $type = $a.type;
        $declared = $a.declared;
    }
    | a = operations '**' b = operations
    {
        $code = "";
        if ($b.type.equals("int")){
            if (!$a.code.isEmpty())
                $code += $a.code;
            P = !$b.declared ? "I" : "G";
            $code += "PUSH"+ P +" "+ $b.num + "\n";
            P = !$a.declared ? "I" : "G";
            $code += "PUSH"+ P +" "+ $a.num + "\n";
            $code += "PUSH"+ P +" "+ $a.denum + "\n";
            $code += "PUSH"+ P +" "+ $b.num + "\n";
            $code += "PUSHI 0\n";
            $code += "NEQ\n";
            $code += "JUMPF " + (label + 1) + "\n"; 
            $code += "JUMP " + ( label ) + "\n";
            $code += "LABEL " + label++ + "\n";
            $code += "PUSHG " + (sp + 1) + "\n" ;
            $code += "PUSHG " + (sp + 1) + "\n" ;
            $code += "MUL\n";
            $code += "STOREG " + (sp + 1) + "\n" ;
            $code += "PUSHG" +" "+ (sp + 2) + "\n" ;
            $code += "PUSHG"+" "+ (sp + 2) + "\n" ;
            $code += "MUL\n";
            $code += "STOREG " + (sp + 2) + "\n" ;
            $code += "PUSHG " + (sp) + "\n" ;
            $code += "PUSHI 1\n";
            $code += "SUB\n";
            $code += "STOREG " + (sp) + "\n" ;
            $code += "PUSHG " + (sp) + "\n" ;
            $code += "PUSHI 1\n";
            $code += "INFEQ\n";
            $code += "JUMPF " + (label - 1) + "\n"; 
            $code += "LABEL " + label++ + "\n";
            $code += "STOREG " + (sp) + "\n";
            $denum = $a.denum; 
            $num = $a.num;
            $type = $a.type;
            $declared = $a.declared;
        }
        else 
        {
            System.out.println("Invalid Type!!!");
        }
    }
    | '[+'a = operations '+]'
    {
        $code = "";
        if (!$a.code.isEmpty())
            $code += $a.code;
        P = !$a.declared ? "I" : "G";
        $code += "PUSH"+ P +" "+ $a.num + "\n";
        $code += "PUSHI 100\n";
        $code += "MUL\n";
        $code += "PUSH"+ P +" "+ $a.denum + "\n";
        $code += "DIV\n";
        $code += "PUSHI 99\n";
        $code += "ADD\n";
        $code += "PUSHI 100\n";
        $code += "DIV\n";
        $denum = $a.denum; 
        $num = $a.num;
        $type = $a.type;
        $declared = $a.declared;
    }
    | '[-'a = operations '-]'
    {
        $code = "";
        if (!$a.code.isEmpty())
            $code += $a.code;
        P = !$a.declared ? "I" : "G";
        $code += "PUSH"+ P +" "+ $a.num + "\n";
        $code += "PUSH"+ P +" "+ $a.denum + "\n";
        $code += "DIV\n";
    }
    | a = operations '%'
    {
        $code = "";
        if (!$a.code.isEmpty())
            $code += $a.code;
        P = !$a.declared ? "I" : "G";
        $code += "PUSH"+ P +" "+ $a.num + "\n";
        $code += "PUSHI 10000\n";
        $code += "MUL\n";
        $code += "PUSH"+ P +" "+ $a.denum + "\n";
        $code += "DIV\n";
        $code += "PUSHI 99\n";
        $code += "ADD\n";
        $code += "PUSHI 100\n";
        $code += "DIV\n";
        $denum = $a.denum; 
        $num = $a.num;
        $type = $a.type;
        $declared = $a.declared;
    }
    | a = operations OP =('==' | '>' | '<' | '<>' | '<=' | '>=') b = operations
    {
        $code = "";
            if (!$a.code.isEmpty())
                $code += $a.code;
            if (!$b.code.isEmpty())
                $code += $b.code;
    
            P = (!$b.declared || $b.type.equals("int")) ? "I" : "G";
            $code += "PUSH"+ P +" "+ $b.denum + "\n";
            P = !$a.declared ? "I" : "G";
            $code += "PUSH"+ P +" "+ $a.num + "\n";
            $code += "MUL\n";
            P = !$b.declared ? "I" : "G";
            $code += "PUSH"+ P +" "+ $b.num + "\n";
            P = (!$a.declared || $a.type.equals("int")) ? "I" : "G";
            $code += "PUSH"+ P +" "+ $a.denum + "\n";
            $code += "MUL\n";
            if($OP.text.equals("=="))
            $code += "EQUAL\n";
            if($OP.text.equals("<>"))
            $code += "NEQ\n";
            if($OP.text.equals("<"))
            $code += "INF\n";
            if($OP.text.equals(">"))
            $code += "SUP\n";
            if($OP.text.equals("<="))
            $code += "INFEQ\n";
            if($OP.text.equals(">="))
            $code += "SUPEQ\n";
            $denum = opCounter++;
            $num = opCounter++;
            $type = "float";
            $declared = true;
            if (opCounter > sp + 3)
                opCounter = sp + 1;
    }
;

expI returns [String code]
    : integer {$code = "PUSHI " + $integer.num + "\n";}
    | variable 
    {   
        if($variable.type.equals("int"))
            $code = "PUSHG " + $variable.num + "\n";
        else 
            System.out.println("Invalid Type!!!");
    }
;

function returns [String code]
    : 'pgcd(' a = expI ',' b = expI ')' 
    {
        $code = $a.code + $b.code;
        $code += "LABEL " + label++ + "\n";
        $code += "PUSHG "+ (sp) +"\n";
        $code += "PUSHG "+ (sp + 1) +"\n";
        $code += "SUP\n";

        $code += "JUMPF "+ (label + 1) +"\n";
        
        $code += "LABEL " + (label++) +"\n";
        $code += "PUSHG "+ (sp) +"\n";
        $code += "PUSHG "+ (sp + 1) +"\n";
        $code += "SUB\n";
        $code += "STOREG " + (sp) +"\n";
        $code += "JUMP " + (label + 1) +"\n";

        
        $code += "LABEL " + (label++) +"\n";
        $code += "PUSHG "+ (sp + 1) +"\n";
        $code += "PUSHG "+ (sp) +"\n";
        $code += "SUB\n";
        $code += "STOREG " + (sp + 1) +"\n";
        
        $code += "LABEL " + (label++) +"\n";
        $code += "PUSHG "+ (sp) +"\n";
        $code += "PUSHG "+ (sp + 1) +"\n";
        $code += "NEQ\n";
        $code += "JUMPF " + (label) +"\n";
        $code += "JUMP " + (label - 4) + "\n";
        $code += "LABEL " + (label++) + "\n";
    }
    | 'ppcm(' a = expI ',' b = expI ')' 
    {
        $code = $a.code + $b.code;
        $code += "LABEL " + label++ + "\n";
        $code += "PUSHG "+ (sp) +"\n";
        $code += "PUSHG "+ (sp + 1) +"\n";
        $code += "SUP\n";

        $code += "JUMPF "+ (label + 1) +"\n";
        
        $code += "LABEL " + (label++) +"\n";
        $code += "PUSHG "+ (sp) +"\n";
        $code += "PUSHG "+ (sp + 1) +"\n";
        $code += "SUB\n";
        $code += "STOREG " + (sp) +"\n";
        $code += "JUMP " + (label + 1) +"\n";

        
        $code += "LABEL " + (label++) +"\n";
        $code += "PUSHG "+ (sp + 1) +"\n";
        $code += "PUSHG "+ (sp) +"\n";
        $code += "SUB\n";
        $code += "STOREG " + (sp + 1) +"\n";
        
        $code += "LABEL " + (label++) +"\n";
        $code += "PUSHG "+ (sp) +"\n";
        $code += "PUSHG "+ (sp + 1) +"\n";
        $code += "NEQ\n";
        $code += "JUMPF " + (label) +"\n";
        $code += "JUMP " + (label - 4) + "\n";
        $code += "LABEL " + (label++) + "\n";
        $code += "POP\n";
        $code += $a.code;
        $code += "PUSHG "+ (sp) +"\n";
        $code +="DIV\n";
        $code += $b.code;
        $code += "MUL\n";
        $code += "DUP\n";
        $code += "PUSHI 0\n";
        $code += "INF\n";
        $code += "JUMPF "+ (label + 1) +"\n";
        $code += "LABEL " + label++ + "\n";
        $code += "POP\n";
        $code += "PUSHI -1\n";
        $code += "MUL\n";
        $code += "LABEL " + label++ + "\n";
    }
;

//AFFECTATION

affectation returns [String code]
    : a = expression '=' b = expression
    {
        if ($a.type.equals($b.type)){
            if ($a.type.equals("float"))
            {
                P = $b.declared ? "G" : "I";
                $code = "PUSH"+ P +" "+ $b.denum + "\n";
                P = $b.declared ? "G" : "I";
                $code += "PUSH"+ P +" "+ $b.num + "\n";
                $code += "STOREG " + $a.num + "\n";
                $code += "STOREG " + $a.denum + "\n";
            }
            else
            {
                P = $b.declared ? "G" : "I";
                $code = "PUSH"+ P +" "+ $b.num + "\n";
                $code += "STOREG " + $a.num + "\n";
            }
        }
        else 
        {
            System.out.println("Invalid Type!");
        }
    }
    | a = expression '=' e = operations
    {
        $code = $e.code;
        $code += "STOREG " + $a.denum + "\n";
        $code += "STOREG " + $a.num + "\n";
    }
;

// AFFICHAGE

exprA returns [String code]
    : a = expression 
    {
        P = $a.declared ? "G" : "I";
        $code = "PUSH"+ P +" "+ $a.num + "\n";
        P = $a.declared ? "G" : "I";
        $code += "PUSH"+ P +" "+ $a.denum + "\n";
    }
    | b = operations { $code = $b.code; } 
;

afficher returns [String code]
    : 'afficher(' a = exprA')' 
    {
        $code = $a.code;
        $code += "WRITE \n";
        $code += "POP\n";
        $code += "WRITE \n";
        $code += "POP\n";
    }
;



// Lexer rules
WS : (' '|'\t')+ -> skip;
SEMICOLON : ';';
AS : '-' | '+';
MD : (':' | '*');
NEWLINE : '\r'? '\n';
TYPE : 'int' | 'float' | 'bool';
ID : [a-z][a-zA-Z0-9_]*;    
BOOL : ('true'|'false');
INT : ('-')? ('0'..'9')+;
UNMATCH : . -> skip;