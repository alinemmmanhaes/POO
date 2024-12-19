package q1;

import java.util.Set;

abstract class UnidadeOrganizacional {
    public double getSalarioMedio(){
        double soma = 0;
        Set<Funcionario> funcionarios = getFuncionarios();
        if(funcionarios.size() == 0) return 0.0;
        for (Funcionario func : funcionarios) {
            soma += func.getSalario();
        }
        return soma/funcionarios.size();
    }

    abstract Set<Funcionario> getFuncionarios();
}
