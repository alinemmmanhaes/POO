package simulado_q2;

import java.util.Random;

public class Pokemon implements PersonagemDeLuta<Pokemon> {
    private int vida, vida_atual;
    private int[] dano;

    public Pokemon(int vida, int dano1, int dano2) {
        this.vida = vida;
        this.vida_atual = vida;
        this.dano = new int[2];
        this.dano[0] = dano1;
        this.dano[1] = dano2;
    }

    @Override
    public boolean atacar(Pokemon personagemAtacado) {
        Random r = new Random();
        int ind;
        if(r.nextBoolean()) ind = 1;
        else ind = 0;

        int ataque = this.dano[ind];
        return personagemAtacado.recebeAtaque(ataque);
    }

    @Override
    public int getPontosVitalidade() {
        return this.vida_atual;
    }

    @Override
    public void regenera() {
        this.vida_atual = this.vida;
        
    }

    public boolean recebeAtaque(int ataque){
        this.vida_atual -= ataque;
        if(this.vida_atual <= 0) return true;
        return false;
    }
}
