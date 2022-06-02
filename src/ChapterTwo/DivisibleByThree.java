package ChapterTwo;

public class DivisibleByThree {
    public String getInput(String message) {
        return message;
    }

    public  boolean checkIfDivisible(int number) {
        if(number % 3 == 0){
            return true;
        }
        return false;
    }
}
