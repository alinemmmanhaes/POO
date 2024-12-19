package q3;

import java.util.HashSet;
import java.util.Set;

public class Universidade {
    private String nome;
    private Set<Curso> cursos;

    public Universidade(String nome) {
        this.nome = nome;
        this.cursos = new HashSet<>();
    }

    public Curso criaCurso(String nome){
        Curso c = new Curso(nome);
        cursos.add(c);
        return c;
    }

    @Override
    public String toString() {
        String output = "Universidade: " + this.nome + "\n";
        for (Curso curso : cursos) {
            output += curso.toString();
        }
        return output;
    }    
}
