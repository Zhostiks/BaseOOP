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
        //������ ��������� ������� �� ������������
        if (this == otherObject) return true;

        //���� ����� �������� ����� ������ �������� null,
        //������ ���� ���������� ���������� �������� false

        if (otherObject == null)
            return false;

        //���� ������ �� ��������� ��� �� �����

        if (getClass() != otherObject.getClass())
            return false;

        //������ ��������, ��� otherObject - ���
        //�������� ������ ���� Employee

        var other = (Employee) otherObject;

        //���������, �������� �� ���� ���������� ��������

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