public class Main {
    public static void main(String[] args) {

        Cliente angela = new Cliente();
        angela.setNome("Angela");

        Conta cc = new ContaCorrente(angela);
        Conta poupanca = new ContaPoupanca(angela);

        cc.depositar(100);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
