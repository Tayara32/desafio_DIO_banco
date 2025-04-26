public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco();

        Cliente cliente = new Cliente();
        cliente.setNome("Maria");

        Conta cc = new ContaCorrente(cliente);
        banco.adicionaConta(cc);
        Conta cp = new ContaPoupanca(cliente);
        banco.adicionaConta(cp);

        banco.imprimirContas();

        cc.depositar(100);
        cc.transferir(50, cp);
        cc.imprimirExtrato();

        cp.imprimirExtrato();





    }
}