import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioExceptions {

    public static boolean bucle() throws Exception {

        System.out.println("Introduce 6 numeros enteros seguidos");
        Scanner sc = new Scanner(System.in);
        int var;
        for (int i = 0; i < 6; i++) {
            System.out.println("Introduce un numero entero: ");
            var = sc.nextInt();
            if (var < 0) {
                throw new Exception("Número no puede ser negativo");
            }
        }
        System.out.println("Enorabuena todos los números introducidos son enteros: ");
        return true;
    }

    public static void main(String[] args) {


        /*
                //ejercicio1
                public static void errorAritmetico(int a, int b) throws ArithmeticException{
                    int r = b/a ;
                }
                public static void main(String[] args){
                    int a = 0, b = 300 ;
                    try{
                         errorAritmetico(a,b);
                     }catch(ArithmeticException e){
                         System.out.println("Se ha producido un error" +e);
                     }
                }
        */

        //ejercicio2
        boolean flag = false;
        do {
            try {
                flag = bucle();
            } catch (InputMismatchException e2) {
                System.out.println("el numero introducido no es entero");
            } catch (Exception e1) {
                System.out.println("el numero introducido no es positivo");
            }
        } while (!flag);

    }
}
