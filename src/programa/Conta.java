package programa;

import programa.utlitarios.Utils;

public class Conta {

    private static int contadorDeContas = 1;

    private int numeroConta;
    private Pessoa pessoa;
    private Double saldo = 0.0;

    // Método Construtor

    public Conta(Pessoa pessoa) {
        this.numeroConta = contadorDeContas;
        this.pessoa = pessoa;
        contadorDeContas += 1;
    }

    // Criação dos Getters e Setters
    public int getNumeroConta(){
        return this.numeroConta;
    }

    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }

    public Pessoa getPessoa(){
        return this.pessoa;
    }

    public void setPessoa(Pessoa pessoa){
        this.pessoa = pessoa;
    }

    public Double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }

    // Método toString()
    public String toString(){
        return "\nNúmero da conta: " + this.getNumeroConta() +
                "\nNome: " + this.pessoa.getNome() +
                "\nCPF: " + this.pessoa.getCPF() +
                "\nEmail: " + this.pessoa.getEmail() +
                "\nSaldo: " + Utils.doubleToString(this.getSaldo()) +
                "\n";
    }

    public void depositar(Double valor){
        if(valor > 0) {
            setSaldo(this.getSaldo() + valor);
            System.out.println("Seu depósito foi realizado com sucesso!");
        }else {
            System.out.println("Não foi possível realizar o depósito!");
        }
    }

    public void sacar(Double valor){
        if(valor > 0 && this.getSaldo() >= valor){
            setSaldo(this.getSaldo() - valor);
            System.out.println("Saque foi realizado com sucesso!");
        }else {
            System.out.println("Não foi possível realizar o depósito!");
        }
    }

    public void transferir(Conta contaParaDeposito, Double valor){
        if(valor > 0 && this.getSaldo() >= valor) {
            setSaldo(this.getSaldo() - valor);

            contaParaDeposito.saldo = contaParaDeposito.getSaldo() + valor;
            System.out.println("Transferência realizada com sucesso!");
        }else {
            System.out.println("Não foi possível realizar a transferência!");
        }
    }

}
