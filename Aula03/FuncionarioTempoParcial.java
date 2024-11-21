public class FuncionarioTempoParcial extends Funcionario {
    private int horas;

    public FuncionarioTempoParcial(String nome, float salario, Departamento departamento) {
        super(nome, salario, departamento);
        this.horas = 0;
    }

    public void setNumeroHorasSemanais(int horasSemanais) {
        this.horas = horasSemanais;
    }
}