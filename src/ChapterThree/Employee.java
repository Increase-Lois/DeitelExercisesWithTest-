package ChapterThree;

import java.util.InputMismatchException;

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0.0) {
            this.salary = salary;
        } else {
            throw new InputMismatchException("Negative amount inputed");
        }
    }

    public double addRaise() {
        salary = salary + (salary/10);
        return salary;
    }

    public double getYearlySalary(double year) {
        year = year * salary;
        return year;
    }
}
