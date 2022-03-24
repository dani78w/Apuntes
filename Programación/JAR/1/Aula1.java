import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Aula1{
    public static void main  (String[] args) throws java.io.IOException{
        char car =0;
        char dif =32;
        int aux;
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
            case 69:System.out.println("El caracter es la vocal mayúscula E");break;
            case 73:System.out.println("El caracter es la vocal mayúscula I");break;
            case 79:System.out.println("El caracter es la vocal mayúscula O");break;
            case 85:System.out.println("El caracter es la vocal mayúscula U");break;
            //vocales minúsculas
            case 97: System.out.println("El caracter es la vocal minúscula a");break;
            case 101:System.out.println("El caracter es la vocal minúscula e");break;
            case 105:System.out.println("El caracter es la vocal minúscula i");break;
            case 111:System.out.println("El caracter es la vocal minúscula o");break;
            case 117:System.out.println("El caracter es la vocal minúscula u");break;
            //numeros
            case 49:System.out.println("El caracter es el numero uno");break;       
            case 50:System.out.println("El caracter es el numero dos");break;       
            case 51:System.out.println("El caracter es el numero tres");break;       
            case 52:System.out.println("El caracter es el numero cuatro");break;   
            case 53:System.out.println("El caracter es el numero cinco");break;     
            case 54:System.out.println("El caracter es el numero seis");break;    
            case 55:System.out.println("El caracter es el numero siete");break;    
            case 56:System.out.println("El caracter es el numero ocho");break;     
            //resto de carácteres
            default:System.out.println("Carácter no contemplado");break;
        }
        //transformacion de minusculas a mayusculas
        aux=(int)car;
        if(car>=97 && car<=117){
            System.out.println("    Carácter en minúscula de forma numerica: "+aux);
            aux=aux-32;
            System.out.println("    Carácter en mayúscula de forma numerica: "+aux);
            car=(char)aux; 
            System.out.println("Carácter transformado a "+car);
        }
        //rangos
        if(car >= 65 && car <= 74 )
        System.out.println("El caracter "+car+" se encuentra entre A-J");
        if(car >= 75 && car <= 82 )
        System.out.println("El caracter "+car+" se encuentra entre K-R");
        if(car >= 83 && car <= 90 )
        System.out.println("El caracter "+car+" se encuentra entre S-Z");
    }
}