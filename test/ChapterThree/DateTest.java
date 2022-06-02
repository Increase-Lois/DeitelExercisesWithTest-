package ChapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateTest {
    DateApp dateApp;
    DateApp date;
    @BeforeEach
    void setUp(){
         dateApp = new DateApp(11,4,1995);
    }

    @Test
    void checkCurrentDateClassTest(){
        dateApp.setMonth(5);
        dateApp.setDay(8);
        dateApp.setYear(2018);
        assertEquals(5,dateApp.getMonth());
        assertEquals(8, dateApp.getDay());
        assertEquals(2018, dateApp.getYear());
    }

    @Test
    void dateClassCanBeCreatedTest(){
        date = new DateApp(9,14,1998);
        assertEquals(9,date.getMonth());
        assertEquals(14, date.getDay());
        assertEquals(1998,date.getYear());
    }

    @Test
    void wrongInputForMonthAndDayReturnsZeroTest(){
        dateApp.setMonth(51);
        dateApp.setDay(80);
        assertEquals(0,dateApp.getMonth());
        assertEquals(0, dateApp.getDay());
    }

    @Test
    void displayDateTest(){
        String message = dateApp.displayDate();
        assertEquals("11/4/1995", message);
    }
}
