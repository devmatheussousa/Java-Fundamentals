package dev.matheus.$11_Heranca_Interface_e_Polimorfismo.$4_Polimorfismo;

public class Techear extends User {
    private String department;
    private String salary;

    public Techear(){
        super();
    }

    public Techear(String department, String salary){
        super();
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String GetAddressLabel() {
        return "Department: " + department + "\nSalary: " + salary + "\n" + super.GetAddressLabel();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

     @Override
    public String toString() {
        return "Techear{" +
                "department='" + department + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
