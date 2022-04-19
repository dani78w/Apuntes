import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Calendar;

import java.util.GregorianCalendar;

public class GregorianCalendario
{
     public static void main  (String[] args) throws java.io.IOException{
        GregorianCalendar gc = null;
        gc = new GregorianCalendar();
        System.out.println(gc.getTime());
        //para los meses restar uno empieza por 0
        GregorianCalendar gc2 = new GregorianCalendar(2024,3,3);
        System.out.println(gc2.getTime());
        System.out.println(gc.get(gc.getFirstDayOfWeek()));
        System.out.println(gc2.get(Calendar.DAY_OF_YEAR));
        }
        /* si la proxima pandemia a ser el 23 de marzo de de 2025 Cuantos dias nos quedan
        * y  cuntos dias han transcurrido desde que empezo la pandemia anterior en 2020*/
         /* en 250 dias putin invade espana que fecha será esa?*/
}
