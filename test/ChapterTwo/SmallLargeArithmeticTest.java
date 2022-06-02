package ChapterTwo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
(Arithmetic, Smallest and Largest) Write an application that inputs three integers from the
user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
representation of the average. So, if the sum of the values is 7, the average should be 2, not
2.3333....]
 */
public class SmallLargeArithmeticTest{

    SmallLargeArithmetic smallLargeArithmetic = new SmallLargeArithmetic();

    @BeforeEach
    public void setUp(){
        smallLargeArithmetic = new SmallLargeArithmetic();
    }

    @Test
    public void promptUserForInputTest(){
        String userInput = smallLargeArithmetic.displayPrompt("Enter three integers: ");
        assertEquals("Enter three integers: ", userInput);
    }

    @Test
    public void getUserFirstInputTest(){
        int userFirstInput = smallLargeArithmetic.getFirstInput(14);
        assertEquals(14, userFirstInput);
    }

    @Test
    public void getUserSecondInputTest(){
        int userSecondInput = smallLargeArithmetic.getSecondInput(10);
        assertEquals(10, userSecondInput);
    }

    @Test
    public void getUserThirdInputTest(){
        int userThirdInput = smallLargeArithmetic.getThirdInput(18);
        assertEquals(18,userThirdInput);
    }

    @Test
    public void displaySumOfUserInputTest(){
        int totalInput = smallLargeArithmetic.getTotal(12,11,15);
        assertEquals(38,totalInput);
    }

    @Test
    public void displayAverageOfUserInputTest(){
        int averageInput = smallLargeArithmetic.getAverage(100,9,10);
        assertEquals(39, averageInput);
    }
    @Test
    public void displayProductOfUserInputTest(){
        int product = smallLargeArithmetic.getProduct(10,10,10);
        assertEquals(1000, product);
    }
    @Test
    public void checkSmallestOfNumbersTest(){
        int smallestNumber = smallLargeArithmetic.displaySmallestInputTest(11,1,13);
        assertEquals(1,smallestNumber);
    }

    @Test
    public void checkLargestOfNumbersTest(){
        int largestNumber = smallLargeArithmetic.displayLargestInputTest(100,25,9);
        assertEquals(100,largestNumber);
    }
}
