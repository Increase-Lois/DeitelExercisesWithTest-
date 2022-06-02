package ChapterTwo;

/*
(Arithmetic) Write an application that asks the user to enter two integers, obtains them from
the user and prints the square of each, the sum of their squares, and the difference of the squares (first
number squared minus the second number squared).
 */

public class Arithmetic {
    public String displayPrompt(String message) {
        return message;
    }

    public int getFirstInput(int firstInput) {
        return firstInput * firstInput;
    }

    public int getSecondInput(int secondInput) {
        return secondInput * secondInput;
    }

    public int getTotal(int firstInput, int secondInput) {
        return (firstInput * firstInput) + (secondInput * secondInput);
    }

    public int getDifference(int firstInput, int secondInput) {
        return (firstInput * firstInput) - (secondInput * secondInput);
    }
}
