package dev.matheus.$11_Heranca_Interface_e_Polimorfismo.$6_Palavra_chave_final;

//A class Abstract é uma classe que não pode ser instanciada,
// ou seja, não pode ser usada para criar objetos.
// Ela serve como uma classe base para outras classes,
// fornecendo um modelo comum para elas.
//Ela e extendida por outras classes,
// como Student e Teacher.
//E qualquer méto-do abstrato deve ser implementado nas subclasses.
//Qual a diferenca de classe Abstract e interface ?
//A classe Abstract é usada para fornecer uma implementação comum para várias subclasses.
// Ela pode conter métodos abstratos (sem implementação) e métodos concretos (com implementação).
//As interfaces, por outro lado, são usadas para definir um contrato que as classes devem seguir.
// Elas contêm apenas métodos abstratos, sem implementação.
public abstract class User {

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
    //criando atributo final
    //Constantes são variáveis que não podem ser alteradas após a inicialização.
    // Elas são declaradas com a palavra-chave final.
    //Eles são usados para armazenar valores que não devem ser alterados,
    // como constantes matemáticas ou valores de configuração.
    private final String type = "User";

    public User() {
        super();
    }

    public User(String name,
                String address,
                String phone,
                String SSN
                ) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.SSN = SSN;

    }

    //Assinatura do método GetAddressLabel()
    // o método GetAddressLabel() é abstrato,
    // o que significa que ele deve ser implementado nas subclasses.
    //todos que implementar a classe User, deverão fornecer uma implementação
    // para o método GetAddressLabel().
    public abstract String GetAddressLabel();

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

     @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", SSN='" + SSN + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
