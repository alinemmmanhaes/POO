public class Aluno {
    private String cpf;
    private String nome;
    private Float nota;

    public Aluno(String cpf, String nome, Float nota) {
        this.cpf = cpf;
        this.nome = nome;
        this.nota = nota;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public Float getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return nome + ", nota: " + nota + ", cpf " + cpf;
    }    
}
