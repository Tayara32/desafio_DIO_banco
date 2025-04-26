import java.util.ArrayList;
import java.util.List;

public class Banco {

    private static  String NOME_BANCO = "Banco DIO";
    private String nome;
    private List<Conta> contas;

    public Banco() {
        this.nome = NOME_BANCO;
        this.contas = new ArrayList<Conta>();
    }

    public void adicionaConta(Conta conta) {
        this.contas.add(conta);
    }

    public void imprimirContas(){
        System.out.println("=== Contas DIO ===");
        for(Conta conta : contas){
            System.out.println(conta);
        }
    }
}
