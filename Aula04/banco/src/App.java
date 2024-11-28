public class App {
    public static void main(String[] args) throws Exception {
        Conta c = new Conta(100);
        c.depositar(10);
        c.sacar(10);
        System.out.println(c.obterSaldo());

        Conta c_esp = new ContaEspecial(100);
        c_esp.depositar(10);
        c_esp.sacar(10);
        System.out.println(c_esp.obterSaldo());
    }
}
