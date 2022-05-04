import java.util.Scanner;

public class EjercicioExceptions
{
    
    public static void errorAritmetico(int a, int b){
        int r = b/a ;
    }


    public static void main(){
    int a = 0, b = 300 ;
    try{
         errorAritmetico(a,b);
     }catch(ArithmeticException e){
         System.out.println("Se ha producido un error" +e);
     }      
    }
}
