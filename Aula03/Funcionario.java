public class Funcionario {
    private String nome;
    private float salario;
    private Departamento departamento;

    public Funcionario(String nome, float salario, Departamento departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNome() {
        return this.nome;
    }

    public Departamento getDepartamento() {
        return this.departamento;
    }

    public float getSalario() {
        return this.salario;
    }

    @Override
    public String toString() {
        return this.nome + " - " + this.departamento;
    }
}