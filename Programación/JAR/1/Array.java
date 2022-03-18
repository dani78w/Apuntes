

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
/*
 * Ejercicio1---------- 
 * @Daniel Arribas Sorando 
 * @10-marzo-2022
 */
public class Array{
    
  
    public static void main  (String[] args) throws java.io.IOException{
        int year = 0;
        int mes = 0;
        int dia = 0;
        int acum = 0;
        int flag = 0 ;
        
            InputStreamReader flujo;
            BufferedReader teclado;
            flujo = new InputStreamReader(System.in, "UTF-8");
            teclado = new BufferedReader(flujo);
            
        do{
            System.out.println("Año:");
            year = Integer.parseInt(teclado.readLine());
        }while(year<1950 || year>2100);
        
        do{
        System.out.println("Mes:");
        mes = Integer.parseInt(teclado.readLine());
        }while(mes<1 || mes>12);
        
        if ((year%4)==0 && mes>2){
            acum=acum+1;    flag=flag+1;
            System.out.printf("El año %d es bisiesto !!!%d",acum);}

        int [] aMes = new int[]{31,28+flag,31,30,31,30,31,31,30,31,30,31};
        
        do{
        System.out.println("Día:");
        dia = Integer.parseInt(teclado.readLine());
        }while(dia<1 || dia>aMes[mes-1]);
        
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
        

        
        System.out.printf("la fecha es %d",acum);
        
        
        
        
        
        
    }
    
}