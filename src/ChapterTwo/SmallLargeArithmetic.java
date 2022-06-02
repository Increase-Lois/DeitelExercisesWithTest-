package ChapterTwo;

public class SmallLargeArithmetic {
    private int firstInput;
    private int secondInput;
    private int thirdInput;

    public int getFirstInput(int i) {
        return i;
    }

    public int getSecondInput(int j) {
        return j;
    }

    public int getThirdInput(int k) {
        return k;
    }

    public String displayPrompt(String message) {
        return message;
    }

    public int getTotal(int i, int j, int k) {
        return i + j + k;
    }

    public int getAverage(int i, int j, int k) {
        return (i + j + k)/3;
    }

    public int getProduct(int i, int j, int k) {
        return i * j * k;
    }

    public int displaySmallestInputTest(int i, int j, int k){
        return Math.min(i,Math.min(j,k));

    }

    public int displayLargestInputTest(int i, int j, int k) {
        return Math.max(i,Math.max(j,k)) ;
    }

}
