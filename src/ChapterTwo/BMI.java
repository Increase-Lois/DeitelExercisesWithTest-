package ChapterTwo;

public class BMI {
    private static int weight;
    private static double height;
    private static int bmi;

    public static String displayPrompt() {
        return "Enter your weight in kilograms";
    }

    public static String displayPromptForHeight() {
        return "Enter your height in meters";
    }

    public static void setWeight(int weight) {
        BMI.weight = weight;
    }

    public static int getWeight() {
        return weight;
    }

    public static double getHeight() {
        return height;
    }

    public static void setHeight(double height) {
        BMI.height = height;
    }

    public static int checkBMI() {
        bmi =  (int) (weight/(height * height));
        return bmi;
    }

    public static String checkUserBMI() {
        if(bmi < 18.5){
            return  "You are UNDERWEIGHT";
        }

        if (bmi >= 18.5 && bmi <=24.9){
            return  "You are NORMAL weight";
        }

        if (bmi >= 25 && bmi <=29.9){
            return  "You are OVERWEIGHT";
        }

        if (bmi > 30){
            return  "You are OBESE";
        }
        return null;
    }
}



















































































































































































































































































































































































































































