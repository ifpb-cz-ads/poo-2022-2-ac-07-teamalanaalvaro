
public class ContaEspecial extends Conta{
    private double limite;
    public ContaEspecial(int numero,String nome_titular, double limite) {
        super(numero, nome_titular);
        this.limite = limite;
    }
    public void imprimirTipoConta(){
        System.out.println("Conta Especial");
    }
}