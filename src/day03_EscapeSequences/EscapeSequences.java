package day03_EscapeSequences;
/*
Escape sequences: MUST be given with double quote
\n:Starts a new line
\t: Gives a tab
\\: Causes a backslash to be printed
\" : Double quatiton mark to be printed
 */

public class EscapeSequences {

    public static void main(String[] args) {
        System.out.println("Java\nPython\nC#");

        System.out.println("---------------------------------");
        System.out.println("Hello Cydeo\nHow are you all today?\nIt's nice to see you all!\nWhat class do we next week?");

        System.out.println("-----------------------------");

        System.out.println("\tJava is Cool Programming Language");

        System.out.println("==============================");
        System.out.println("\\\\\\");   //In order to print one back slash we need to give two back slashes.


        System.out.println("\"Java is cool.\"");
        System.out.println("My favorite TV show is \"Game of Thrones\""); //In order to print double quote, we need to do \"  \"
    }
}
