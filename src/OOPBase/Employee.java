package OOPBase;

import java.util.ArrayList;
import java.util.Objects;
import java.time.*;
public class Employee extends Person {


    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day)
    {
        super(name);
        this.salary = salary;
        hireDay = LocalDate.of(year,month,day);
    }

    public double getSalary()
    {
        return salary;
    }

    public LocalDate getHireDay()
    {
        return hireDay;
    }

    public String getDescription()
    {
        return String.format("an employee with a salary of $%.2f", salary);
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public boolean equals(Object otherObject) {
        // quickly check objects for identity
        if (this == otherObject) return true;

        // if the explicit parameter is null,
        // must return a boolean value false

        if (otherObject == null)
            return false;

        // if the classes do not match they are not equal

        if (getClass() != otherObject.getClass())
            return false;

        // it is now known that otherObject is
        // non-empty object of type Employee

        var other = (Employee) otherObject;

        // check if fields contain the same values

        return Objects.equals(name, other.name)
                &&salary == other.salary
                && Objects.equals(hireDay, other.hireDay);
    }

    public int hashCode()
    {
        return Objects.hash(name,salary,hireDay);
    }

    public String toString()
    {
        return getClass().getName() + "[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay +"]";
    }





}