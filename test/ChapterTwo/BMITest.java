package ChapterTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    2.33 (Body Mass Index Calculator) We introduced the body mass index (BMI) calculator in Exercise 1.10.
    The formulas for calculating BMI are

    weightInPounds  ×   703
    BMI = -------------------------------------
    heightInInches × heightInInches

            or
    weightInKilograms
            BMI = -------------------------------------
            heightInMetres x heightInMetres

    Create a BMI calculator that reads the user’s weight in pounds and height in inches
            (or, if you prefer, the user’s weight in kilograms and height in meters),
    then calculates and displays the user’s body mass index.
    Also, display the following information from the Department of Health and Human Services/National Institutes of Health
    so the user can evaluate his/her BMI:

    BMI VALUES
    Underweight: less than 18.5
    Normal:      between 18.5 and 24.9
    Overweight:  between 25 and 29.9
    Obese:       30 or greater

[Note: In this chapter, you learned to use the int type to represent whole numbers.
    The BMI calculations when done with int values will both produce whole-number results.
    In Chapter 3 you’ll learn to use the double type to represent numbers with decimal points.
    When the BMI calculations are performed with doubles,
    they’ll both produce numbers with decimal points—these are called “floating-point” numbers.]
*/
public class BMITest {

    @Test
    public void promptUserForWeightInPoundsTest(){
        assertEquals("Enter your weight in kilograms", BMI.displayPrompt());
    }

    @Test
    public void promptUserForHeightInInchesTest(){
        assertEquals("Enter your height in meters", BMI.displayPromptForHeight());
    }

    @Test
    public void setUserWeightTest(){
        BMI.setWeight(23);
        assertEquals(23, BMI.getWeight());
    }

    @Test
    public void setUserHeightTest(){
        BMI.setHeight(50);
        assertEquals(50, BMI.getHeight());
    }

    @Test
    public void checkUserBMITest(){
        BMI.setHeight(1.2);
        BMI.setWeight(65);
        assertEquals(1.2,BMI.getHeight());
        assertEquals(65,BMI.getWeight());
        assertEquals(45, BMI.checkBMI());
        assertEquals("You are OBESE", BMI.checkUserBMI());
    }

}
