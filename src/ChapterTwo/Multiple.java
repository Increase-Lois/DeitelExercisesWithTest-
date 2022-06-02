package ChapterTwo;
/*
(Multiples) Write an application that reads two integers, determines whether the first
number tripled is a multiple of the second number doubled, and prints the result. [Hint: Use the
remainder operator.]
 */
public class Multiple {
    public String getUserInput(String message) {
        return message;
    }

    public int tripleFirstInput(int i) {
        return i * 3;
    }

    public int doubleSecondInput(int j) {
        return  j * 2;
    }

    public int checkMultiple(int i, int j) {
        return (tripleFirstInput(i) % doubleSecondInput(j));
    }
}
