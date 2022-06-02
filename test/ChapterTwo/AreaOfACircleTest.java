package ChapterTwo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaOfACircleTest {
    AreaOfACircle areaOfACircle = new AreaOfACircle();

    @BeforeEach
    public void setUp(){
        areaOfACircle = new AreaOfACircle();
    }

    @Test
    public void promptUserForInputTest(){
        String result = areaOfACircle.displayPrompt("Enter the radius of a circle: ");
        assertEquals("Enter the radius of a circle: ",result);
    }

    @Test
    public void getDiameterOfACircleTest(){
        double radius = areaOfACircle.getDiameter(2.4);
        assertEquals(4.8,radius);
    }

    @Test
    public void getCircumferenceOfACircleTest(){
        double circumference = areaOfACircle.getCircumference(3.5);
        assertEquals(21.991148575128552,circumference);
    }

    @Test
    public void getAreaOfACircleTest(){
        double area = areaOfACircle.getArea(8);
        assertEquals(201.06192982974676, area);
    }

}
