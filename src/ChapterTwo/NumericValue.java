package ChapterTwo;

public class NumericValue {
    private static int positiveNumber;
    private static int negativeNumber;
    private static int zeroNumber;

    public static int getPositiveNumber() {
        return positiveNumber;
    }

    public static int getNegativeNumber() {
        return negativeNumber;
    }

    public static int getZeroNumber() {
        return zeroNumber;
    }

    public static int getInput(int userInput) {
        return userInput;
    }

    public static boolean isAPositiveNumber(int number) {
        return number > 0;
    }

    public static boolean isANegativeNumber(int number) {
        return  number < 0;
    }

    public static boolean isEqualToZero(int number) {
        return number == 0;
    }


    public static void countNumberValues( int firstNumber, int secondNumber, int thirdNumber, int fourthNumber, int fifthNumber) {
        if(firstNumber > 0) {
            positiveNumber++;
        }
        if(firstNumber < 0){
            negativeNumber++;

        }
        if(firstNumber == 0){
            zeroNumber++;

        }
        if(secondNumber > 0) {
            positiveNumber++;

        }
        if(secondNumber < 0){
            negativeNumber++;
        }
        if(secondNumber == 0){
            zeroNumber++;
        }

        if(thirdNumber > 0) {
            positiveNumber++;
        }
        if(thirdNumber < 0){
            negativeNumber++;
        }
        if(thirdNumber == 0){
            zeroNumber++;
        }
        if(fourthNumber > 0) {
            positiveNumber++;
        }
        if(fourthNumber < 0){
            negativeNumber++;
        }
        if(fourthNumber == 0){
            zeroNumber++;
        }
        if(fifthNumber > 0) {
            positiveNumber++;
        }
        if(fifthNumber < 0){
            negativeNumber++;
        }
        if(fifthNumber == 0){
            zeroNumber++;
        }
    }
}
