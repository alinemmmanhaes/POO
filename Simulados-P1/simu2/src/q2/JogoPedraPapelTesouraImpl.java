package q2;

import java.util.Random;

public class JogoPedraPapelTesouraImpl implements JogoPedraPapelTesoura{
    private Jogada jog1;
    private Jogada jog2;

    public JogoPedraPapelTesouraImpl() {
        Random r = new Random();
        int n = r.nextInt(3);
        if(n == Jogada.PAPEL.ordinal()) jog1 = Jogada.PAPEL;
        else if(n == Jogada.PEDRA.ordinal()) jog1 = Jogada.PEDRA;
        else if(n == Jogada.TESOURA.ordinal()) jog1 = Jogada.TESOURA;

        n = r.nextInt(3);
        if(n == Jogada.PAPEL.ordinal()) jog2 = Jogada.PAPEL;
        else if(n == Jogada.PEDRA.ordinal()) jog2 = Jogada.PEDRA;
        else if(n == Jogada.TESOURA.ordinal()) jog2 = Jogada.TESOURA;
    }

    @Override
    public int getJogadorVencedor() {
        if(jog1 == Jogada.PAPEL){
            if(jog2 == Jogada.TESOURA) return 2;
            else return 1;
        }
        else if(jog1 == Jogada.PEDRA){
            if(jog2 == Jogada.TESOURA) return 1;
            else return 2;
        }
        else if(jog1 == Jogada.TESOURA){
            if(jog2 == Jogada.PAPEL) return 1;
            else return 2;
        }
        return 0;
    }

    @Override
    public boolean haVencedor() {
        return jog1 != jog2;
    }

    @Override
    public Jogada jogadaJogador1() {
        return jog1;
        
    }

    @Override
    public Jogada jogadaJogador2() {
        return jog2;
    }
    
}
