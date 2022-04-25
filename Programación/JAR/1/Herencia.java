public class Herencia {
    public static void main(String[] args) {
        Trabajador Pepe = new Trabajador("dani","pobre","2231232G", (float) 23213.3);
        System.out.println(Pepe.toString());
        Pepe.setDni("INDIGENA");
        System.out.println(Pepe.toString());
    }
}
