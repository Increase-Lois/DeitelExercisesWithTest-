package ChapterTwo;

public class ComparingInteger {
    public String getInput(String message) {
        return message;
    }

    public int squareNumber(int i) {
        return  i * i;
    }

    public String greaterThan( int number) {
        if (squareNumber(number) > 100){
            return "number is greater than 100";
        }
        return "100 is greater than number";
    }
}
