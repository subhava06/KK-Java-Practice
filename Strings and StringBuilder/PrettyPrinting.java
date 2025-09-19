import java.text.Format;

public class PrettyPrinting {

    public static void main(String[] args) {
        
        float a = 453.127834f;
        //System.out.printf("Formatted number is %.2f",a);

        System.out.println(Math.PI);
        // System.out.printf("Pie : %.3f",Math.PI);

        System.out.printf("Hi my name is %s and i am %s", "Subhava", "cool");

        

        //list of all format specifiers in string
        
// %%	Inserts a literal %	%
// %n	Inserts a newline	(new line)
// %s / %S	String (lowercase/uppercase)	hello / HELLO
// %c / %C	Character (lowercase/uppercase)	a / A
// %b / %B	Boolean (lowercase/uppercase)	true / TRUE
// %h / %H	Hash code of the argument	7f54c0f

//        Numeric Format Specifiers
// Placeholder	Description	Example Output
// %d	Decimal integer	42
// %f	Floating-point (decimal)	3.141593
// %e / %E	Scientific notation	3.141593e+00
// %g / %G	Shorter of %f or %e	3.14159
// %a / %A	Hexadecimal floating-point	0x1.91eb86p1
// %o	Octal integer	52
// %x / %X	Hexadecimal integer	2a / 2A

// Date and Time Format Specifiers
// These use %t or %T followed by a suffix:

// Placeholder	Description	Example Output
// %tY	Year (4 digits)	2025
// %tm	Month (2 digits)	09
// %td	Day of month	19
// %tH	Hour (00–23)	07
// %tM	Minute	37
// %tS	Second	45
// %tB	Full month name	September
// %tA	Full weekday name	Friday
    }
    
}
