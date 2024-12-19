package q1;

import java.util.HashSet;
import java.util.Set;

public class Departamento extends UnidadeOrganizacional{
    private Set<Setor> setores;

    public Departamento() {
        this.setores = new HashSet<>();
    }

    public void adicionaSetor(Setor setor){
        this.setores.add(setor);
    }

    public Set<Setor> getSetores() {
        return setores;
    }

    @Override
    public Set<Funcionario> getFuncionarios() {
        Set<Funcionario> funcionarios = new HashSet<>();
        for (Setor s : this.setores) {
            funcionarios.addAll(s.getFuncionarios());
        }
        return funcionarios;
    }
}
