package q1;

public class Funcionario {
    private double salario;
    private Setor setor;

    public Funcionario(double salario, Setor setor) {
        this.salario = salario;
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public Setor getSetor() {
        return setor;
    }

    public void alteraSetor(Setor setor){
        this.setor.removeFuncionario(this);
        this.setor = setor;
        this.setor.adicionaFuncionario(this);
    }

    @Override
    public String toString() {
        return "Funcionario [salario=" + salario + "]";
    }
}
