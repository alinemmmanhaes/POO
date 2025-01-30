
import java.util.Comparator;

public class ComparaAluno implements Comparator<Aluno>{

    //ORDENANDO POR ORDEM ALFABETICA
    /*@Override
    public int compare(Aluno a1, Aluno a2) {
        int resp = a1.getNome().compareTo(a2.getNome());
        if(resp == 0){
            resp = -1*(int)(a1.getNota() - a2.getNota());
        }
        return resp;
    }*/

    //ORDENANDO POR NOTA
    @Override
    public int compare(Aluno a1, Aluno a2) {
        int resp = -1*(int)(a1.getNota() - a2.getNota());
        if(resp == 0){
            resp = a1.getNome().compareTo(a2.getNome());
        }
        return resp;
    }
}