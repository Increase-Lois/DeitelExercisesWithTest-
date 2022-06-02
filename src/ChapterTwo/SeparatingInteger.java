package ChapterTwo;

public class SeparatingInteger {
    private int userInput;
    private int firstDigit;
    private int secondDigit;
    private int thirdDigit;
    private int fourthDigit;
    private int fifthDigit;


    public String displayPrompt(String message) {
        return  message;
    }

    public int getUserInput() {
        return userInput;
    }

    public void setUserInput(int userInput) {
        this.userInput = userInput;
    }

    public void separateInput(int userInput ) {
         firstDigit = userInput / 10000;
        int remainderFirstDigit = userInput % 10000;
         secondDigit= remainderFirstDigit / 1000;
        int remainderSecondDigit = remainderFirstDigit % 1000;
         thirdDigit = remainderSecondDigit / 100;
        int remainderThirdDigit= remainderSecondDigit % 100;
         fourthDigit = remainderThirdDigit / 10;
         fifthDigit = remainderThirdDigit % 10;
//        return firstDigit +" "+ secondDigit +" "+ thirdDigit + " "+ fourthDigit + " "+ fifthDigit;
    }

    public int getFirstNumber() {
        separateInput(userInput);
        return firstDigit;
    }

    public int getSecondNumber() {
        separateInput(userInput);
        return secondDigit;
    }

    public int getThirdNumber() {
        separateInput(userInput);
        return thirdDigit;
    }

    public int getFourthNumber() {
        separateInput(userInput);
        return fourthDigit;
    }

    public int getFifthNumber() {
        separateInput(userInput);
        return fifthDigit;
    }
}
