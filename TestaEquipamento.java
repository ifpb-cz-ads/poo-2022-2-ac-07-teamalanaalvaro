public class TestaEquipamento {

    public static void main(String[] args) {
        Equipamento microondas = new Equipamento("7008ab", "Microondas", "Brastemp");
        Computador computador = new Computador("3659nw", "Samsung");
        computador.setRam(16);
        computador.setOs("Windows");

        System.out.println("\n" + microondas.getInfo());
        System.out.println("\n" + computador.getInfoComp());
    }
}
