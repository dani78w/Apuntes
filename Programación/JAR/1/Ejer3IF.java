import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
/*
 * Ejercicio1---------- 
 * @Daniel Arribas Sorando 
 * @10-marzo-2022
 */
public class Ejer3IF{
    
  
    public static void main  (String[] args) throws java.io.IOException{
        int year = 0;
        int mes = 0;
        int dia = 0;
        int acum = 0;
            InputStreamReader flujo;
            BufferedReader teclado;
            flujo = new InputStreamReader(System.in, "UTF-8");
            teclado = new BufferedReader(flujo);
        
        System.out.println("Año:");
        year = Integer.parseInt(teclado.readLine());
        
        System.out.println("Mes:");
        mes = Integer.parseInt(teclado.readLine());
        
        System.out.println("Día:");
        dia = Integer.parseInt(teclado.readLine());
        
        System.out.println("----------RESULTADOS----------");
        System.out.printf("Fecha introducida %d %d %d \n",year,mes,dia);
        
        acum=mes-1;
        acum=acum*30;
        acum=acum+dia;
        
        //correciones
        //enero
        if (mes>1){acum=acum+1;}
        //febrero
        if (mes>2){acum=acum-2;}
        //marzo
        if (mes>3){acum=acum+1;}
        //mayo
        if (mes>5){acum=acum+1;}
        //julio
        if (mes>7){acum=acum+1;}
        //agosto
        if (mes>8){acum=acum+1;}
        //octubre
        if (mes>10){acum=acum+1;}
        //bisiesto
        if ((year%4)==0 && mes>2){
            acum=acum+1;
            System.out.printf("El año %d es bisiesto !!!",acum);}

        
        System.out.printf("la fecha es %d",acum);
        
        
        
        
        
        
    }
    
}
