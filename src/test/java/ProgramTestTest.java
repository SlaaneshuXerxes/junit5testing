import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTestTest { // just a few new varied tests

    @BeforeAll
    static void beforeAll() {
        System.out.println("Varming up for the tests");
    }

    @BeforeEach
    void beforeEach(TestInfo testInfo) {
        System.out.println("Performing a sweet frontflip to perform " + testInfo.getDisplayName());
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Performing a rad frontflip to indicate the end of all the tests");
    }

    @Test
    @DisplayName("The first word should be Shoe")
    void firstWordTest() {
        ProgramTest programTest = new ProgramTest();

        String words = "Shoe Monkey";

        assertEquals("Shoe", programTest.firstWord(words));
    }

    @ParameterizedTest
    @DisplayName("Testing several first words")
    @CsvSource(value= { "Monkey Shoe, Monkey", "Fish Boat, Fish", "123 456, 123" } )
    void parameterizedFirstWordTest(String words, String expectedResult) {
        ProgramTest programTest = new ProgramTest();

        assertEquals(expectedResult, programTest.firstWord(words));
    }

    @Test
    @DisplayName("The second word should be Car") // this one should fail as the method uses +2 instead of +1
    void secondWordTest() {
        ProgramTest programTest = new ProgramTest();

        String words = "Whale Car";

        assertEquals("Car", programTest.secondWord(words));
    }

    @Test
    @DisplayName("The second word should be Fruit") // should still pass even with the fault in the method because of
    void secondWordTestWithTypo() {                 // the intentional typo in the assertEquals expected result
        ProgramTest programTest = new ProgramTest();

        String words = "Bowl Fruit";

        assertEquals("ruit", programTest.secondWord(words));
    }

//    @Test
//    @DisplayName("B should be the first letter in Banana")
//    void firstLetterTest() { // this one should fail
//        ProgramTest programTest = new ProgramTest();
//
//        String word = "Banana";
//        char expectedResult = 'B';
//
//        assertEquals(expectedResult, programTest.firstLetter(word));
//    }
//
//    @Test
//    @DisplayName("'e' being the last letter in ''Apple'' should be true")
//    void lastLetterTest() {
//        ProgramTest programTest = new ProgramTest();
//
//        String word = "Apple";
//        char expectedResult = 'e';
//
//        assertTrue(expectedResult == programTest.lastLetter(word));
//    }
//
//    @Test
//    @DisplayName("Assert exception when 0 length String")
//    void lastLetterExceptionTest() {
//        ProgramTest programTest = new ProgramTest();
//
//        String word = "";
//
//        assertThrows(StringIndexOutOfBoundsException.class,
//                () -> programTest.lastLetter(word)
//        );
//    }
//
//
//    @Test
//    @DisplayName("6 + 4 should be 10")
//    void addingNumbersTest() {
//        ProgramTest programTest = new ProgramTest();
//
//        int firstNumber = 6;
//        int secondNumber = 4;
//        int expectedResult = 10;
//
//        assertEquals( expectedResult, programTest.addingNumbers(firstNumber, secondNumber) );
//    }
//
//    @Test
//    @DisplayName("7 - 4 should be 3")
//    void subtractingNumbersTest() {
//        ProgramTest programTest = new ProgramTest();
//
//        int firstNumber = 7;
//        int secondNumber = 4;
//        int expectedResult = 3;
//
//        assertEquals(expectedResult, programTest.subtractingNumbers(firstNumber, secondNumber));
//    }
//
//    @ParameterizedTest
//    @DisplayName("Testing several subtractions")
//    @CsvSource(value= {"4, 2, 2", "20, 7, 13", "5, 5, 0", "25, 19, 6" } )
//        void severalSubtractingNumbersTest(int firstNumber, int secondNumber, int expectedResult) {
//        ProgramTest pt = new ProgramTest();
//
//        assertEquals(expectedResult, pt.subtractingNumbers(firstNumber, secondNumber));
//    }
}