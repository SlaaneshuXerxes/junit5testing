import java.util.Scanner;

public class ProgramTest { // something new to write tests towards

    public static void main(String[] args) {

        ProgramTest programTest = new ProgramTest();
        programTest.startProgram();
    }

    public void startProgram() {

        Scanner input = new Scanner(System.in);

        String words;

        System.out.println("Enter a two words in the following format: 'Word1 Word2'.");
        words = input.nextLine();

        System.out.println("The first word is: " + firstWord(words));
        System.out.println("The second word is: " + secondWord(words));
    }

    public String firstWord(String words) {
        return words.substring( 0, words.indexOf( " " ));
    }

    public String secondWord(String words) {
        return words.substring( words.indexOf( " " ) + 2 ); // wrongly written again, should be +1 instead
    }
}