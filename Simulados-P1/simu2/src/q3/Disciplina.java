package q3;

import java.util.LinkedList;
import java.util.List;

public class Disciplina {
    private String nome;
    private String id;
    private List<Disciplina> prereq;

    public Disciplina(String nome, String id) {
        this.nome = nome;
        this.id = id;
        this.prereq = new LinkedList<>();
    }

    public void adicionaPreReq(Disciplina disciplina){
        this.prereq.add(disciplina);
    }

    @Override
    public String toString() {
        String output = this.nome;
        if(prereq.size() == 0){
            output += ", sem pré-requisitos";
        }else{
            int flag = 0;
            output += ", pré-requisitos: ";
            for (Disciplina d : prereq) {
                if(flag == 1){
                    output += ", ";
                }
                output += d.getNome();
                flag = 1;
            }
        }
        output += "\n";
        return output;
    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    public List<Disciplina> getPrereq() {
        return prereq;
    }
}
