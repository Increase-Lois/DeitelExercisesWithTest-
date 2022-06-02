package ChapterTwo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
(Comparing Integers) Write an application that asks the user to enter one integer, obtains
it from the user and displays whether the number and its square are greater than, equal to, not equal
to, or less than the number 100.
 */
public class ComparingIntegerTest {
    ComparingInteger comparingInteger = new ComparingInteger();

    @BeforeEach
    public void setUp(){
        comparingInteger = new ComparingInteger();
    }

    @Test
    public void obtainUserInputTest(){
        String input = comparingInteger.getInput("Enter an Integer: ");
        assertEquals("Enter an Integer: ", input);
    }

    @Test
    public void getSquareOfUserInput(){
         int square = comparingInteger.squareNumber(12);
        assertEquals(144 ,square);
    }

    @Test
    public void greaterThanHundredTest(){
        String result = comparingInteger.greaterThan(15);
        assertEquals("15 is greater than 100",result);
    }
}
