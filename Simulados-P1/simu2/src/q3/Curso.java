package q3;

import java.util.LinkedHashMap;
import java.util.Map;

public class Curso {
    private String nome;
    private Map<String, Disciplina> disciplinas;

    public Curso(String nome) {
        this.nome = nome;
        this.disciplinas = new LinkedHashMap();
    }

    public Disciplina criaDisciplina(String id, String nome){
        Disciplina d = new Disciplina(nome, id);
        disciplinas.put(id, d);
        return d;
    }

    public void estabelecePreReq(Disciplina d, String id){
        Disciplina prereq = disciplinas.get(id);
        d.adicionaPreReq(prereq);
    }

    @Override
    public String toString() {
        String output = "Curso: " + this.getNome() + "\n";
        output += "Disciplinas:\n";
        for (Disciplina disciplina : disciplinas.values()) {
            output += disciplina.toString();
        }
        return output;
    }

    public String getNome() {
        return nome;
    }

    public Map<String, Disciplina> getDisciplinas() {
        return disciplinas;
    }
}
