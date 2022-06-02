package ChapterTwo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
(Arithmetic) Write an application that asks the user to enter two integers, obtains them from
the user and prints the square of each, the sum of their squares, and the difference of the squares (first
number squared minus the second number squared).
 */
class ArithmeticTest {

    Arithmetic arithmetic = new Arithmetic();

    @BeforeEach
    public void setUp(){
         arithmetic = new Arithmetic();
    }

    @Test
    public void promptUserForInputTest(){
        String prompt = arithmetic.displayPrompt("Enter an integer");
        assertEquals("Enter an integer",prompt );
    }

    @Test
    public void gUserFirstInputTest(){
        int userFirstInput = arithmetic.getFirstInput(12);
        assertEquals(144, userFirstInput);
    }

    @Test
    public void getUserSecondInputTest(){
        int userSecondInput = arithmetic.getSecondInput(10);
        assertEquals(100, userSecondInput);
    }

    @Test
    public void getTotalOfUserInputTest(){
        int totalInput = arithmetic.getTotal(10,12);
        assertEquals(244,totalInput);
        }

    @Test
    public void getDifferenceBetweenUserInputTest(){
        int difference = arithmetic.getDifference(12,10);
        assertEquals(44,difference);
    }
    }
