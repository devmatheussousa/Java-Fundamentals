package dev.matheus.$11_Heranca_Interface_e_Polimorfismo.$3_Modificadores_de_Acesso_Protected;

public class Techear extends User{
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
}
