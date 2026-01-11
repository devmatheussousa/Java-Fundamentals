package dev.matheus.$11_Heranca_Interface_e_Polimorfismo.$3_Modificadores_de_Acesso_Protected;

public class User {

    /**
     * Modificadore de Acesso
     * protected: Acesso dentro da classe, subclasses e pacote.
     * private: Acesso apenas dentro da classe.
     * Public: Acesso dentro da classe, subclasses, pacote e qualquer lugar.
     * default: Acesso dentro da classe e pacote.
     */

    private String name; //And the username
    private String address; //And address name
    private String phone; //And phone name
    private String SSN; //

    public User() {
        super();
    }

    public User(String name,
                String address,
                String phone,
                String SSN) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.SSN = SSN;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }
}
