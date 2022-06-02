package ChapterTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
(World Population Growth Calculator) Search the Internet to determine the current world
population and the annual world population growth rate. Write an application that inputs these val-
ues, then displays the estimated world population after one, two, three, four and five years.
 */
public class WorldPopulationGrowthCalcTest {
    @Test
    public void checkWorldPopulationTest() {
        WorldPopulationGrowthCalc.setWorldPopulation(4.3);
        assertEquals(4.3, WorldPopulationGrowthCalc.getWorldPopulation());
    }

    @Test
    public void checkWorldPopulationGrowthRateTest(){
        WorldPopulationGrowthCalc.setAnnualWorldPopulation(1.0);
        assertEquals(1.0, WorldPopulationGrowthCalc.getAnnualWorldPopulation());
    }

    @Test
    public void checkEstimatedWorldPopulationGrowthRateWithinFiveYearsTest(){
        WorldPopulationGrowthCalc.setWorldPopulation(4.3);
        WorldPopulationGrowthCalc.setAnnualWorldPopulation(1.0);
        assertEquals(4.343,WorldPopulationGrowthCalc.getEstimatedWorldPopulationAfterAYear());
        assertEquals(4.38643,WorldPopulationGrowthCalc.getEstimatedWorldPopulationAfterYearTwo());
        assertEquals(4.430294300000001,WorldPopulationGrowthCalc.getEstimatedWorldPopulationAfterAYearThree());
        assertEquals(4.474597243,WorldPopulationGrowthCalc.getEstimatedWorldPopulationAfterAYearFour());
        assertEquals(4.51934321543,WorldPopulationGrowthCalc.getEstimatedWorldPopulationAfterAYearFive());

    }
}
