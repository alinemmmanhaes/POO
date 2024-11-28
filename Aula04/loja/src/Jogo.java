public class Jogo extends Produto{
    private int idade;

    public Jogo(String nome, float preco, int idade){
        super(nome, preco);
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Jogo " + this.getNome() + " R$ " + this.getPreco() + " - recomendado para crianças a partir da idade " + this.idade;
    }
   
}
