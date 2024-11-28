public class App {
    public static void main(String[] args) throws Exception {
        Produto[] produtos = new Produto[5];
        produtos[0] = new Livro("Traços", 20, "Eduardo Cilto");
        produtos[1] = new Livro("A vida de Ranone", 100, "R Togneri");
        produtos[2] = new Livro("BarbBarb", 50, "Barbara");
        produtos[3] = new Jogo("Detetive", 150, 5);
        produtos[4] = new Jogo("LIFE", 80, 8);

        for (Produto p : produtos) {
            System.out.println(p);
        }
    }
}
