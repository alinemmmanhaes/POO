package simulado_q3;

public class Banco {
    private String nome;
    private Agencia agencia;

    public Banco(String nome) {
        this.nome = nome;
    }

    public Agencia criaAgencia(String nome){
        Agencia a = new Agencia(nome);
        this.agencia = a;
        return a;
    }

    @Override
    public String toString() {
        return "Nome do Banco: " + nome + "\n" + agencia;
    }
}
