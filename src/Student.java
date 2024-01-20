public class Student extends Person{
    private double gpa;
    double getGpa()
    {
        return gpa;
    }
    void setGpa(double gpaInput)
    {
        gpa = gpaInput;
    }
    String toStr()
    {
        return "Student: " + getId() + ". " + getName() + " " + getSurname();
    }
    Student()
    {

    }
    Student(String nameC, String surnameC, double gpaC)
    {
        setName(nameC);
        setSurname(surnameC);
        setGpa(gpaC);
    }
    public double getPaymentAmount()
    {
        if (gpa > 2.67)
        {
            return 36660;
        }
        return 0;
    }

}