package simulado_q3;

public class Conta {
    private String nome;
    private double saldo;
    
    public double getSaldo() {
        return saldo;
    }
    
    public String getNome() {
        return nome;
    }

    public Conta(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }
}
