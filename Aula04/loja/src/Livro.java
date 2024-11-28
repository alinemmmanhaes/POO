public class Livro extends Produto{
    private String autor;

    public Livro(String nome, float preco, String autor){
        super(nome, preco);
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro " + this.getNome() + " - Autor " + this.autor + " R$ " + this.getPreco();
    }
   
}