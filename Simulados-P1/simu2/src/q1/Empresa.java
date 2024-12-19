package q1;

import java.util.HashSet;
import java.util.Set;

public class Empresa {
    private Set<Departamento> departamentos;

    public Empresa() {
        this.departamentos = new HashSet<>();
    }

    public void adicionaDepartamento(Departamento departamento){
        this.departamentos.add(departamento);
    }

    public Set<Departamento> getDepartamentos() {
        return departamentos;
    }
}
