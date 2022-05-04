import java.io.UTFDataFormatException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioExceptions
{
    public static void errorAritmetico(int a, int b) throws ArithmeticException{
        int r = b/a ;
    }
    public static void bucle(){
        System.out.println("Introduce 6 numeros enteros seguidos");
        Scanner sc = new Scanner(System.in);
        int var = 0;
        for (int i = 0; i < 6 ; i++) {
            System.out.println("Introduce un numero entero: ");
            var = sc.nextInt();
        }
        System.out.println("Enorabuena todos los números introducidos son enteros");
    }
    public static void main(String[] args){
        int a = 0, b = 300 ;
        //ejercicio1
            try{
                 errorAritmetico(a,b);
             }catch(ArithmeticException e){
                 System.out.println("Se ha producido un error" +e);
             }
        //ejercicio3
            try{
                bucle();
            }catch(InputMismatchException e2){
                System.out.println("el numero introducido no es entero");
            }
    }
}
