package q1;

import java.util.HashSet;
import java.util.Set;

public class Setor extends UnidadeOrganizacional{
    private Set<Funcionario> funcionarios;

    public Setor(){
        this.funcionarios = new HashSet<>();
    }

    public Set<Funcionario> getFuncionarios() {
        return this.funcionarios;
    }

    public void adicionaFuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }

    public void removeFuncionario(Funcionario funcionario){
        this.funcionarios.remove(funcionario);
    }
}
