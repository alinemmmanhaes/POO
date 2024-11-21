import java.util.LinkedList;
import java.util.List;

public class Empresa {
    private String nome;
    private List<Departamento> departamentos;

    public Empresa(String nome) {
        this.nome = nome;
        this.departamentos = new LinkedList<Departamento>();
    }

    public void addDepartamento(Departamento departamento) {
        this.departamentos.add(departamento);
    }

    public List<Departamento> getDepartamentos() {
        return this.departamentos;
    }

    @Override
    public String toString() {
        return this.nome;
    }

}