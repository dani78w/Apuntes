import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
/*
 * Ejercicio1---------- 
 * @Daniel Arribas Sorando 
 * @10-marzo-2022
 */
public class Ejer2Casting{
    
  
    public static void main  (String[] args) throws java.io.IOException{
        int capital = 0;
        float interes = 0;
        float totalInteres = 0,totalPagar=0;
        
            InputStreamReader flujo;
            BufferedReader teclado;
            flujo = new InputStreamReader(System.in, "UTF-8");
            teclado = new BufferedReader(flujo);
        
        System.out.println("Capital:");
        capital = Integer.parseInt(teclado.readLine());
        
        System.out.println("Interés:");
        interes = Float.parseFloat(teclado.readLine());
        
        totalInteres = interes*capital/100;
        totalPagar = capital + totalInteres ;
        
        System.out.println("----------RESULTADOS----------");
        System.out.printf("El total de intereses es de %.2f \n",totalInteres);
        System.out.println("El total a pagar es de "+ totalPagar);
        
        
        
        
        
        
    }
    
}
