import java.util.Scanner;

public class ProgramTest { // something thrown together to write tests towards

    public static void main(String[] args) {

        ProgramTest programTest = new ProgramTest();
        programTest.startProgram();
    }

    public void startProgram() {

        Scanner input = new Scanner(System.in);

        int nr1;
        int nr2;
        String word;

        System.out.println("Enter a word.");
        word = input.nextLine();

        System.out.println("Enter a number");
        nr1 = input.nextInt();

        System.out.println("Enter another number");
        nr2 = input.nextInt();

        System.out.println("The first letter in: " + word + " is " + firstLetter(word));
        System.out.println("The last letter in: " + word + " is " + lastLetter(word));
        System.out.println(nr1 + " + " + nr2 + " is: " + addingNumbers(nr1, nr2));
        System.out.println(nr1 + " - " + nr2 + " is: " + subtractingNumbers(nr1, nr2));
    }

    public char firstLetter(String word) {
        return word.charAt(1); // intentional mistake, should be index 0 for first the first letter
    }

    public char lastLetter(String word) {
        return word.charAt((word.length() - 1));
    }

    public static int addingNumbers(int nr1, int nr2) {
        return (nr1 + nr2);
    }

    public int subtractingNumbers(int nr1, int nr2) {
        return (nr1 - nr2);
    }
}
