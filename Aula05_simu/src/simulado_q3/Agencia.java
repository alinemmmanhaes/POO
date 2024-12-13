package simulado_q3;

import java.util.HashSet;
import java.util.Set;

public class Agencia {
    private String nome;
    private Set<Conta> contas;

    public Agencia(String nome) {
        this.nome = nome;
        this.contas = new HashSet<>();
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Agencia: " + this.nome + ", saldo médio: " + this.saldoMedioContas();
    }

    public void adicionaConta(Conta c){
        this.contas.add(c);
    }

    public double saldoMedioContas(){
        double soma = 0;
        for (Conta conta : this.contas) {
            soma += conta.getSaldo();
        }
        return soma/this.contas.size();
    }
}
