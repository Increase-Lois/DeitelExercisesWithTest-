package ChapterTwo;

public class AreaOfACircle {
    public String displayPrompt(String message) {
        return message;
    }

    public double getDiameter(double radius) {
        return  2 * radius;
    }

    public double getCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public double getArea(double radius) {
        return Math.PI * radius * radius;
    }
}
