import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        List<Aluno> alunos = new LinkedList<>();

        InputStream is = new FileInputStream("enem.csv");
        InputStreamReader isr = new InputStreamReader(is, "UTF-8");
        BufferedReader br = new BufferedReader(isr);
        br.readLine();
        String linha = br.readLine();

        while (linha != null) {
            Scanner s = new Scanner(linha).useDelimiter(";");
            Aluno a = new Aluno(s.next(), s.next(), s.nextFloat());
            s.close();
            alunos.add(a);
            linha = br.readLine();
        }

        ComparaAluno comparador = new ComparaAluno();
        Collections.sort(alunos, comparador);

        System.out.print("\n");
        for (Aluno a : alunos) {
            System.out.println(a);
        }
        br.close();
    }
}
