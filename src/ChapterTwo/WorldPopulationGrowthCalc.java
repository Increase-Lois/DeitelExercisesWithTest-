package ChapterTwo;

public class WorldPopulationGrowthCalc {
    private static double worldPopulation = 4.3;
    private static double annualWorldPopulation = 1.0;

    public static void setWorldPopulation(double worldPopulation) {
        WorldPopulationGrowthCalc.worldPopulation = worldPopulation;
    }

    public static double getWorldPopulation() {
        return worldPopulation;
    }

    public static void setAnnualWorldPopulation(double annualWorldPopulation){
        WorldPopulationGrowthCalc.annualWorldPopulation = annualWorldPopulation;
    }

    public static double getAnnualWorldPopulation(){
        return annualWorldPopulation;
    }

    public static double getEstimatedWorldPopulationAfterAYear() {
        return worldPopulation *(1 + annualWorldPopulation/100);
    }

    public static double getEstimatedWorldPopulationAfterYearTwo() {
        return worldPopulation *Math.pow(1 + annualWorldPopulation/100, 2);
    }

    public static double getEstimatedWorldPopulationAfterAYearThree() {
        return worldPopulation *Math.pow(1 + annualWorldPopulation/100, 3);

    }

    public static double getEstimatedWorldPopulationAfterAYearFour() {
        return worldPopulation *Math.pow(1 + annualWorldPopulation/100, 4);

    }

    public static double getEstimatedWorldPopulationAfterAYearFive() {
        return worldPopulation *Math.pow(1 + annualWorldPopulation/100, 5);

    }
}
