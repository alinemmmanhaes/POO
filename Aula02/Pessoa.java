public class Pessoa {
    private Pessoa pai, mae;
    private String nome;

    public Pessoa(Pessoa pai, Pessoa mae, String nome) {
        this.pai = pai;
        this.mae = mae;
        this.nome = nome;
    }
    public Pessoa getPai() {
        return pai;
    }
    public void setPai(Pessoa pai) {
        this.pai = pai;
    }
    public Pessoa getMae() {
        return mae;
    }
    public void setMae(Pessoa mae) {
        this.mae = mae;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNomeAvoFMae() {
        if(this.mae != null){
            if(this.mae.getMae() != null){
                return this.mae.getMae().getNome();
            }
        }
        return "Desconhecida";
    }
    public String getNomeAvoMMae() {
        if(this.mae != null){
            if(this.mae.getPai() != null){
                return this.mae.getPai().getNome();
            }
        }
        return "Desconhecido";
    }
    public String getNomeAvoFPai() {
        if(this.pai != null){
            if(this.pai.getMae() != null){
                return this.pai.getMae().getNome();
            }
        }
        return "Desconhecida";
    }
    public String getNomeAvoMPai() {
        if(this.pai != null){
            if(this.pai.getPai() != null){
                return this.pai.getPai().getNome();
            }
        }
        return "Desconhecido";
    }

    public void geraArvore() {
        if(this.mae != null){
            System.out.print(" ( " + this.mae.getNome());
            this.mae.geraArvore();
        }
        else{
            System.out.print(" ( ?");
        }
        System.out.print(" +");
        if(this.pai != null){
            System.out.print(" " + this.pai.getNome());
            this.pai.geraArvore();
            System.out.print(" ) ");
        }
        else{
            System.out.print(" ? ) ");
        }
    }

    public void familia() {
        System.out.println("\nFamília de " + this.getNome() + ":");
        if(this.mae != null){
            System.out.print("mãe " + this.getMae().getNome());
        }else{
            System.out.print("mãe Desconhecida");
        }
        if(this.pai != null){
            System.out.println(" e pai " + this.getPai().getNome());
        }else{
            System.out.println(" e pai Desconhecido");
        }
        //System.out.println("mãe " + this.getMae().getNome() + " e pai " + this.getPai().getNome());
        System.out.println("avó materna " + this.getNomeAvoFMae() + " e avô materno " + this.getNomeAvoMMae());
        System.out.println("avó paterna " + this.getNomeAvoFPai() + " e avô paterno " + this.getNomeAvoMPai());
    }

    public String toString() {
        return this.getNome();
    }
}