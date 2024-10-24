public class Time{
    private String nome;
    private int nMundiais;

    public Time(String nome){ //setter
        this.nome = nome;
    }
    public void incNMundiais(){
        this.nMundiais++;
    }
    public String getNome(){  //getter
        return nome;
    }
    public int getNMundiais(){
        return nMundiais;
    }
}