public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco();

        Cliente cliente = new Cliente("Maria", "00044466614", "963258741", "email@email.com");


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