package ChapterTwo;

public class SquareAndCube {
    public int getNumber(int number) {
        return number;
    }

    public int getSquare(int number) {
        return number * number;
    }

    public int getCube(int number) {
        return number * number * number;
    }

    public String getSpace() {
        return "number\tsquare\tcube";
    }

    public String addAll(int number, int square, int cube) {
        return getNumber(number) +"\t"+ getSquare(square) +"\t"+ getCube(cube);
    }


    public String runLoop() {
        int i = 0;
        for (; i < 10; i++) {
        }
        return getNumber(i) +"\t"+ getSquare(i) +"\t"+ getCube(i);
    }
}
