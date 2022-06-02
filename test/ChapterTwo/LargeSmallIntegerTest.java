package ChapterTwo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
/*
(Largest and Smallest Integers) Write an application that reads five integers and determines
and prints the largest and smallest integers in the group.
 */
public class LargeSmallIntegerTest {

        LargeSmallInteger largeSmallInteger = new LargeSmallInteger();
        @BeforeEach
        public void setUp() {
            largeSmallInteger = new LargeSmallInteger();
        }

        @Test
        public void promptUserForInputTest(){
            String input = largeSmallInteger.getInput("Enter five integers: ");
            assertEquals("Enter five integers: ", input);
        }

        @Test
        public void displayLargestNumberTest(){
        int largerInput = largeSmallInteger.displayLargestNumber(1,8,3,4,5);
        assertEquals(8,largerInput);
        }

        @Test
        public void displaySmallestNumberTest(){
        int smallerInput = largeSmallInteger.displaySmallestNumber(1,6,9,8,6);
        assertEquals(1,smallerInput);
        }
    }

