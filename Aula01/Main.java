public class Main{
    public static void main(String[] args) {

        java.util.LinkedList<Partida> partidas = new java.util.LinkedList<Partida>();
        
        Time flamengo = new Time("Flamengo");
        Time vascoco = new Time("Vasco");
        Time fluminense = new Time("Fluminense");
        Time bostafogo = new Time("Botafogo");
        Partida p1 = new Partida(flamengo, vascoco);
        partidas.add(p1);
        Partida p2 = new Partida(fluminense, bostafogo);
        partidas.add(p2);
        System.out.println("numero de partidas: " + partidas.size());

        for (Partida p: partidas){
            System.out.print(p.getTimeA().getNome());
            System.out.print(" x ");
            System.out.println(p.getTimeB().getNome());
        }
        // flamengo.incNMundiais();
        // System.out.println(flamengo.getNome() + ": " + flamengo.getNMundiais() + " mundial(is)");
    }
}