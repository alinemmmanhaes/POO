import java.util.List;
import java.util.LinkedList;

public class Departamento {
    private String nome;
    private List<Funcionario> funcionarios;
    private Empresa empresa;

    public Departamento(String nome, Empresa empresa) {
        this.nome = nome;
        this.funcionarios = new LinkedList<Funcionario>();
        this.empresa = empresa;
    }

    public void addFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public List<Funcionario> getFuncionarios() {
        return this.funcionarios;
    }

    public String getNome() {
        return this.nome;
    }

    public Empresa getEmpresa(){
        return this.empresa;
    }

    public float getMediaSalarial() {
        if (this.funcionarios.size() == 0)
            return 0;
        float media = 0.0f;
        for (Funcionario f : this.funcionarios) {
            media += f.getSalario();
        }
        return media / this.funcionarios.size();
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
