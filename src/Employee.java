public class Employee extends Person{
    private String position;
    private double salary;
    String toStr()
    {
        return "Employee: " + getId() + ". " + getName() + " " + getSurname();
    }
    String getPosition()
    {
        return position;
    }
    void setPosition(String positionInput)
    {
        position = positionInput;
    }
    double getSalary()
    {
        return salary;
    }
    void setSalary(double salaryInput)
    {
        salary = salaryInput;
    }
    Employee()
    {

    }
    Employee(String nameC, String surNameC, String positionC, double salaryC)
    {
        setName(nameC);
        setSurname(surNameC);
        setPosition(positionC);
        setSalary(salaryC);
    }
    public double getPaymentAmount()
    {
        return salary;
    }
}