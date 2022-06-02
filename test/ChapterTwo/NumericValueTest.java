package ChapterTwo;

import org.junit.jupiter.api.Test;

import static ChapterTwo.NumericValue.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
(Negative, Positive and Zero Values) Write a program that inputs five numbers and deter-
mines and prints the number of negative numbers input, the number of positive numbers input and
the number of zeros input.
 */
public class NumericValueTest {

    @Test
    public void collectUserInputTest(){
        assertEquals(234, NumericValue.getInput(234));
    }

    @Test
    public void positiveInputTest(){
        assertTrue(NumericValue.isAPositiveNumber(12));
    }

    @Test
    public void NegativeInputTest(){
        assertTrue( NumericValue.isANegativeNumber(-12));
    }

    @Test
    public void zeroInputTest(){
        assertTrue(NumericValue.isEqualToZero(0));
    }

    @Test
    public void checkForPositiveNegativeZeroValueTest(){
        NumericValue.countNumberValues(-6,5,-9,0,-8);
        assertEquals(1,getPositiveNumber());
        assertEquals(3,getNegativeNumber());
        assertEquals(1,getZeroNumber());
    }




}
