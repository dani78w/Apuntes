import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.GregorianCalendar;
/**
 * Write a description of class GregorianCalendar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class GregorianCalendar
{
     public static void main  (String[] args) throws java.io.IOException{
        GregorianCalendar gc = null;
        gc = new GregorianCalendar();
        System.out.println(gc.getTime());
        }
     
}
