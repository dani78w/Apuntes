import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Aula1{
    
  
    public static void main  (String[] args) throws java.io.IOException{
        char car =0;
        char dif =32;
        String entrada ="";
        //System.out.println
        InputStreamReader flujo;
        BufferedReader teclado;
        flujo = new InputStreamReader(System.in, "UTF-8");
        teclado = new BufferedReader(flujo);
        //proceso
        System.out.println("Introduce un caráracter");
        entrada = teclado.readLine();
        car = entrada.charAt(0);
        switch(car){
            //vocales mayúsculas
            case 65:System.out.println("El caracter es la vocal mayúscula A");break;
            case 69:System.out.println("El caracter es la vocal mayúscula B");break;
            case 73:System.out.println("El caracter es la vocal mayúscula C");break;
            case 79:System.out.println("El caracter es la vocal mayúscula D");break;
            case 85:System.out.println("El caracter es la vocal mayúscula E");break;
            //vocales minúsculas
            case 97: System.out.println("El caracter es la vocal minúscula a");break;
            case 101:System.out.println("El caracter es la vocal minúscula b");break;
            case 105:System.out.println("El caracter es la vocal minúscula c");break;
            case 111:System.out.println("El caracter es la vocal minúscula d");break;
            case 117:System.out.println("El caracter es la vocal minúscula e");break;
            //numeros
            case 49:System.out.println("El caracter es el numero uno");        break;
            case 50:System.out.println("El caracter es el numero dos");        break;
            case 51:System.out.println("El caracter es el numero tres");       break;
            case 52:System.out.println("El caracter es el numero cuatro");     break;
            case 53:System.out.println("El caracter es el numero cinco");     break;
            case 54:System.out.println("El caracter es el numero seis");     break;
            case 55:System.out.println("El caracter es el numero siete");     break;
            case 56:System.out.println("El caracter es el numero ocho");     break;
            case 57:System.out.println("El caracter es el numero nueve");     break;
            //resto de carácteres
            default:System.out.println("Carácter no contemplado");
        }
        if(car>=97 && car>=117){
           
        }
    }
}