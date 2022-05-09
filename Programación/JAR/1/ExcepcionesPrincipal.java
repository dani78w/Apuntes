import java.util.Scanner;

public class ExcepcionesPrincipal {

    public static void main(String[] args) {
        /*  control de errores con try catch finally solo
            las cosas que se ven afectadas cuando ocurre
            una excepcion */
        boolean flag = false;
        do {

            try {
                pedir();
                flag = true;
            } catch (NumberFormatException e2) {
                System.out.println("El caracter introducido no es un entero");
            }

        } while (!flag);

        //recuerda usar EXCEPTION para el resto de excepciones no controladas


    }

    public static void pedir() {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Número: ");
        numero = Integer.parseInt(sc.nextLine());
        System.out.println("El número es: " + numero);
    }

}
