package ChapterTwo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
(Divisible by 3) Write an application that reads an integer and determines and prints
whether it’s divisible by 3 or not. [Hint: Use the remainder operator. A number is divisible by 3 if
it’s divided by 3 with a remainder of 0.]
 */
public class DivisibleByThreeTest {
    DivisibleByThree divisibleByThree = new DivisibleByThree();
    @BeforeEach
    public void setUp(){
        divisibleByThree = new DivisibleByThree();
    }
    @Test
    public void promptUserForInputTest(){
        String userInput = divisibleByThree.getInput("Enter an integer :");
        assertEquals("Enter an integer :", userInput);
    }

    @Test
    public void checkDivisibilityTest(){
        boolean isDivisible = divisibleByThree.checkIfDivisible(18);
        assertEquals(true,isDivisible);
    }
}
