package ChapterTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeparatingIntegerTest{
    SeparatingInteger separatingInteger = new SeparatingInteger();

    @Test
    public void promptUserForInputTest(){
        String prompt = separatingInteger.displayPrompt("Enter an integer");
        assertEquals("Enter an integer",prompt );
    }

    @Test
    public void userCanInputFiveDigitTest() {

        separatingInteger.setUserInput(23567);
        assertEquals(23567,separatingInteger.getUserInput());
        assertEquals(2,separatingInteger.getFirstNumber());
        assertEquals(3, separatingInteger.getSecondNumber());
        assertEquals(5, separatingInteger.getThirdNumber());
        assertEquals(6, separatingInteger.getFourthNumber());
        assertEquals(7,separatingInteger.getFifthNumber());

    }

}
