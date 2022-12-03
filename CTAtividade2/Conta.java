public class Conta{
    private int numero;
    private String nome_titular;
    public Conta(int numero,String nome_titular) {
        this.numero = numero;
        this.nome_titular = nome_titular;
    }
    public void imprimirTipoConta(){
        System.out.println("Conta Comum");
    }
}
