public class App {
    public static void main(String[] args) {
        Pessoa aline = new Pessoa(null, null, "Aline");
        Pessoa tales = new Pessoa(null, null, "Tales");
        Pessoa caio = new Pessoa(tales, aline, "Caio Henrique");
        Pessoa raony = new Pessoa(tales, aline, "Ranone");
        Pessoa barbara = new Pessoa(caio, raony, "Bárbara");
        Pessoa marcela = new Pessoa(caio, raony, "Marcela");
        
        System.out.println(caio.getNome() + ": mãe " + caio.getMae().getNome() + " e pai " + caio.getPai().getNome());
        System.out.println(raony.getNome() + ": mãe " + raony.getMae().getNome() + " e pai " + raony.getPai().getNome());

        marcela.familia();

        System.out.println("\nÁrvore de " + barbara.getNome() + ":");
        barbara.geraArvore();
        System.out.println();

        System.out.println("\nÁrvore de " + raony.getNome() + ":");
        raony.geraArvore();
        System.out.println();

        System.out.println("\nÁrvore de " + aline.getNome() + ":");
        aline.geraArvore();
        System.out.println();

        System.out.println(aline);
    }
}
