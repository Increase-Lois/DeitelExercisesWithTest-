package ChapterFour;

public class Grade {
    public String collectInput(String message) {
        return message;
    }

    public String getGradeAPlus(float userInput) {
        if (userInput >= 96 && userInput <= 100){
            return "A+";
        }
        else {
            return "No input";
        }
    }

    public String getGradeA(float userInput) {
        if (userInput >= 90 && userInput <= 95){
            return "A";
        }
        else {
            return "No input";
        }
    }

    public String getGradeBPlus(float userInput) {
        if (userInput >= 86 && userInput <= 89){
            return "B+";
        }
        else {
            return "No input";
        }
    }

    public String getGradeB(float userInput) {
        if (userInput >= 80 && userInput <= 85){
            return "B";
        }
        else {
            return "No input";
        }
    }

    public String getGradeCPlus(float userInput) {
        if (userInput >= 76 && userInput <= 79){
            return "C+";
        }
        else {
            return "No input";
        }
    }

    public String getGradeC(float userInput) {
        if (userInput >= 70 && userInput <= 75){
            return "C";
        }
        else {
            return "No input";
        }
    }

    public String getGradeD(float userInput) {
        if (userInput >= 60 && userInput <= 69){
            return "D";
        }
        else {
            return "No input";
        }
    }

    public String getGradeE(float userInput) {
        if (userInput >= 40 && userInput <= 59){
            return "E";
        }
        else {
            return "No input";
        }
    }


    public String getAllGrade(float userInput) {
        if (userInput >= 96 && userInput <= 100)
            return "A+";
        else if (userInput >= 90 && userInput <= 95)
            return "A";
        else if (userInput >= 86 && userInput <= 89)
            return "B+";
        else if (userInput >= 80 && userInput <= 85)
            return "B";
        else if (userInput >= 70 && userInput <= 75)
            return "C";
        else if (userInput >= 60 && userInput <= 69)
            return "D";
        else if (userInput >= 40 && userInput <= 59)
            return "E";
        else return "Wrong Input";

    }
}
