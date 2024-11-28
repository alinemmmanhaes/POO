public class ContaEspecial extends Conta{
    public ContaEspecial(float saldo){
        super(saldo);
    }

    @Override
    public float getTaxa(){
        return 1.01f;
    }
}
