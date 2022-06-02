package ChapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {
    Employee employee;
    @BeforeEach
    void setUp(){
        employee = new Employee("Shola","Azeez",10000);
    }

    @Test
    public void employeeCanBeCreatedTest(){
        employee.setFirstName("Maleek");
        employee.setLastName("Amole");
        employee.setSalary(4_000_000);
        assertEquals("Maleek",employee.getFirstName());
        assertEquals("Amole", employee.getLastName());
        assertEquals(4_000_000,employee.getSalary());
    }
    @Test
    public void negativeSalaryValueThrowsExceptionTest(){
        assertThrows(InputMismatchException.class,()->employee.setSalary(-89000));
    }

    @Test
    public void addTenPercentRaiseTest(){
        assertEquals(employee.addRaise(), employee.getSalary());
        System.out.println(employee.getSalary());
    }
    @Test
    public void displayYearlySalaryTest(){
       assertEquals(50_000,employee.getYearlySalary(5));
    }
}
