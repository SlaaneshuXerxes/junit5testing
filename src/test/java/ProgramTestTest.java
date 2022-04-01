import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTestTest { // just a few varied tests

    @Test
    @DisplayName("B should be the first letter in Banana")
    void firstLetterTest() { // this one should fail
        ProgramTest programTest = new ProgramTest();

        String word = "Banana";
        char expectedResult = 'B';

        assertEquals(expectedResult, programTest.firstLetter(word));
    }

    @Test
    @DisplayName("'e' being the last letter in ''Apple'' should be true")
    void lastLetterTest() {
        ProgramTest programTest = new ProgramTest();

        String word = "Apple";
        char expectedResult = 'e';

        assertTrue(expectedResult == programTest.lastLetter(word));
    }

    @Test
    @DisplayName("Assert exception when 0 length String")
    void lastLetterExceptionTest() {
        ProgramTest programTest = new ProgramTest();

        String word = "";

        assertThrows(StringIndexOutOfBoundsException.class,
                () -> programTest.lastLetter(word)
        );
    }


    @Test
    @DisplayName("6 + 4 should be 10")
    void addingNumbersTest() {
        ProgramTest programTest = new ProgramTest();

        int firstNumber = 6;
        int secondNumber = 4;
        int expectedResult = 10;

        assertEquals( expectedResult, programTest.addingNumbers(firstNumber, secondNumber) );
    }

    @Test
    @DisplayName("7 - 4 should be 3")
    void subtractingNumbersTest() {
        ProgramTest programTest = new ProgramTest();

        int firstNumber = 7;
        int secondNumber = 4;
        int expectedResult = 3;

        assertEquals(expectedResult, programTest.subtractingNumbers(firstNumber, secondNumber));
    }

    @ParameterizedTest
    @DisplayName("Testing several subtractions")
    @CsvSource(value= {"4, 2, 2", "20, 7, 13", "5, 5, 0", "25, 19, 6" } )
        void severalSubtractingNumbersTest(int firstNumber, int secondNumber, int expectedResult) {
        ProgramTest pt = new ProgramTest();

        assertEquals(expectedResult, pt.subtractingNumbers(firstNumber, secondNumber));
    }
}