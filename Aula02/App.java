public class App {
    public static void main(String[] args) {
        //cria familia
        Pessoa aline = new Pessoa(null, null, "Aline");
        Pessoa tales = new Pessoa(null, null, "Tales");
        Pessoa caio = new Pessoa(tales, aline, "Caio Henrique");
        Pessoa raony = new Pessoa(tales, aline, "Ranone");
        Pessoa barbara = new Pessoa(caio, raony, "Bárbara");
        Pessoa marcela = new Pessoa(caio, raony, "Marcela");
        
        //testa getnome
        System.out.println(caio.getNome() + ": mãe " + caio.getMae().getNome() + " e pai " + caio.getPai().getNome());
        System.out.println(raony.getNome() + ": mãe " + raony.getMae().getNome() + " e pai " + raony.getPai().getNome());

        //testa funcao familia 
        marcela.familia();

        //testa funcao de arvore genealogica
        System.out.println("\nÁrvore de " + barbara.getNome() + ":");
        barbara.geraArvore();
        System.out.println();
        System.out.println();

        //testa funcao de lista de antepassados com print
        System.out.println(barbara.getAntepassados());
        System.out.println();

        //testa print de pessoa
        System.out.println(aline);
    }
}
