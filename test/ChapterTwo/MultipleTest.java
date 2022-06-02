package ChapterTwo;
/*
(Multiples) Write an application that reads two integers, determines whether the first
number tripled is a multiple of the second number doubled, and prints the result. [Hint: Use the
remainder operator.]
 */
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultipleTest {
    Multiple multiple = new Multiple();

    @BeforeEach
    public void setUp(){
        multiple = new Multiple();
    }

    @Test
    public void getInputFromUserTest(){
         String request =multiple.getUserInput("Enter an integer: ");
        assertEquals("Enter an integer: ", request);
    }

    @Test
    public void tripleFirstNumberTest(){
        int result = multiple.tripleFirstInput(10);
        assertEquals(30, result);
    }

    @Test
    public void doubleSecondNumberTest(){
        int result = multiple.doubleSecondInput(10);
        assertEquals(20, result);
    }

    @Test
    public void checkIfMultipleTest(){
        int result = multiple.checkMultiple(15,5);
        assertEquals(5,result);
    }
}
