package programa;

public class Pessoa {

    private static int counter = 1;

    private String nome;
    private String CPF;
    private String email;

    // Método Construtor
    public Pessoa(String nome, String CPF, String email){
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
        counter+= 1;
    }

    // Criação dos Getters e Setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCPF(){
        return this.CPF;
    }

    public void setCPF(String CPF){
        this.CPF = CPF;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    // Método toString()
    public String toString(){
        return  "\nNome: " + this.getNome() +
                "\nCPF: " + this.getCPF() +
                "\nEmail: " + this.getEmail();
    }

}
