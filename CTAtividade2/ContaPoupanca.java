 
public class ContaPoupanca extends Conta{
    public ContaPoupanca(int numero,String nome_titular) {
        super(numero, nome_titular);
    }
    public void imprimirTipoConta(){
        System.out.println("Conta Poupança");
    }
}