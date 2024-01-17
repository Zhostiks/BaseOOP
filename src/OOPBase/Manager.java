package OOPBase;

class Manager extends Employee
{

    private double bonus;

    public Manager(String n, double s, int year, int month, int day)
    {
        super(n,s,year,month,day);
        bonus = 0;
    }

    public double getSalary()
    {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double b)
    {
        bonus = b;
    }

    public boolean equals(Object otherObject)
    {
        if(!super.equals(otherObject)) return false;
        var other = (Manager) otherObject;
        // in the super.equals() method it is checked
        // whether objects accessible by
        // links this and other, to the same class
        return bonus == other.bonus;
    }

    public int hashCode()
    {
        return java.util.Objects.hash(super.hashCode(), bonus);
    }

    public String toString()
    {
        return super.toString() + "[bonus=" + bonus +"]";
    }
}