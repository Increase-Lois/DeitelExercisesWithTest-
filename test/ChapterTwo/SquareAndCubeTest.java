package ChapterTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareAndCubeTest {
    SquareAndCube squareAndCube = new SquareAndCube();

    @Test
    public void getSeparationBarTest(){
       String separate = squareAndCube.getSpace();
       assertEquals("number\tsquare\tcube", separate);

    }
    @Test
    public void getNumberTest(){
        int num =squareAndCube.getNumber(12);
        assertEquals(12,num);
    }
    @Test
    public void getSquareTest(){
        int square = squareAndCube.getSquare(12);
        assertEquals(144,square);
    }

    @Test
    public void getCubeTest(){
        int cube = squareAndCube.getCube(5);
        assertEquals(125,cube);
    }

    @Test
    public void getNumberSquareCubeTest(){
        String add = squareAndCube.addAll(1, 4,5);
        assertEquals("1\t16\t125", add);
    }

//    @Test
//    public void runLoopForAllNumbersTest(){
//        String view = squareAndCube.runLoop();
//        assertEquals("0\t0\t0",view);
//    }


}
