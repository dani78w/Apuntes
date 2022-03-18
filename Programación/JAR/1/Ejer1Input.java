import java.util.Date;
/* el asterisco indica que importa todas las clases de la libreria
    import java.io.*;*/ 
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
/*
 * Ejercicio1---------- 
 * @Daniel Arribas Sorando 
 * @10-marzo-2022
 */
public class Ejer1Input{
    
  
    public static void main  (String[] args) throws java.io.IOException{
        int numero = 0, numero2 =0;
        String nombre="benzema";
        numero=7;numero2=8;
        
        //ouput----------------------------------------------
        System.out.printf("--------------OUTPUT-----------\n");
        System.out.println("suma:" +(numero+numero));
        System.out.println(numero+numero+":suma" );
        
        System.out.printf("nombre: %S \n",nombre);
        System.out.printf("nombre: %15S \n",nombre);
        System.out.printf("nombre: %1$S %1$s %1$S \n",nombre);
        
        System.out.printf("Numero real : %.2f \n",2.356);
        System.out.printf("Numero real : %5.2f \n",2.356);//espacio
        System.out.printf("Numero real : %05.2f \n",2.356);
        
        System.out.printf("%TF \n",new Date());
        System.out.printf("%TA \n",new Date());
        //input-----------------------------------------------
        System.out.printf("---------------INPUTS----------\n");
        
        String nombrein ="";
        //input forma tradicional 1
            //constructor
            InputStreamReader flujo;
            BufferedReader teclado;
            
            flujo = new InputStreamReader(System.in);
            teclado = new BufferedReader(flujo);
            //similar a scanf + fflush
            System.out.println("nombre:");
            nombrein=teclado.readLine();
            System.out.println(nombrein);
        //input forma tradicional 2
            InputStreamReader flujo2 = new InputStreamReader(System.in);
            BufferedReader teclado2 = new BufferedReader(flujo);
            System.out.println("nombre:");
            nombrein=teclado.readLine();
            System.out.println(nombrein);
        //input en una unica linea
            int numeroin = 0;
            BufferedReader teclado3 = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("nombre:");
            nombrein=teclado.readLine();
            System.out.println(nombrein);
        //numeros
            System.out.println("numero:");
            numeroin = Integer.parseInt(teclado.readLine());
            System.out.println(numeroin);
        
        
        
        
    }
    
}
