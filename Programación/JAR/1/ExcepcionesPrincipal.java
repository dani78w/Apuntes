import java.util.Scanner;

public class ExcepcionesPrincipal {
    public static void pedir(){
        int numero=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Número: ");
        numero=Integer.parseInt(sc.nextLine());
        System.out.println("El número es: "+numero);
    }
    public static void main(String[] args) {
    //control de errores con try catch finally
        try {
                pedir();
        }catch(NumberFormatException e){
                System.out.println("Mete un numero entero :C ");
                //recuerda usar EXCEPTION para el resto de excepciones no controladas
        } finally {
                System.out.println("Programa finalizado");
        }




    }
}
