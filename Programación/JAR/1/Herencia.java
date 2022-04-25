public class Herencia {
    public static void main(String[] args) {
        Trabajador Pepe = new Trabajador("dani","pobre","2231232G", (float) 23213.3);
        System.out.println(Pepe);

        Pepe.setDni("INDIGENA");
        System.out.println(Pepe);

        Comercial Comercial = new Comercial("Paco","pobre","2231232G", (float) 23213.3,"SI");
        System.out.println(Comercial);
    }
}
