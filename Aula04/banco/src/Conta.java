public class Conta {
    private float saldo;

    public Conta(float saldo){
        this.saldo = saldo;
    }

    public float obterSaldo() {
        return saldo;
    }

    public void depositar(float quantia) {
        this.saldo += quantia;
    }

    public void sacar(float quantia) {
        this.saldo -= (getTaxa())*quantia;
    }

    public float getTaxa(){
        return (float)1.05;
    }
}