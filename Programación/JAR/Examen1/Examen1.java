import java.util.Scanner;

/**         ------------------------------ENUNCIADO DEL EXAMEN------------------------------

             CLASE ELECTRODOMESTICO      CLASE FRIGORIFICO           CLASE PRINCIPAL
atributo
             consumo(real)            hereda de electrodomestico     1Generar un objeto frigorifico
             modelo(alfanumerico)     temperatura(real)GradosºC      2Solicitando datos por pantalla
constuctores                                                         3Controlar con excepciones (de forma repetitiva):
             por defecto              no tiene por defecto              -Controlar que los datos son numericos
             todos los atributos      todos los atributos               -Que el modelo no tenga ningun digito
metodos                                                              4Mostrar por pantalla el objeto
             getter seter toString    getter seter toString          5Mostrar por pantalla la conversion al farenheit;
             "modelo  sdasd222+       "modelo  sdasd222  +
              consumo 23123123"       consumo 23123123   +
                                      temperatura 213123Cº"
                                      
                                      pasoFarenheit(real)
                                      (ºC*9/5)+32
 */

public class Examen1
{
    public static void main(String[] args) {
        boolean flag=true;
        do {
            try {
                //generar objeto
                    Frigorifico f = generarObjeto();
                //Imprimir objeto
                    imprimirObjeto(f);
                //Convertir temperaturas e imprimir objeto
                    System.out.println(f.getGradosC()+"ºC son: "+f.pasoFarenheit(f)+" ºF");
                flag=true;
            }catch (NumberFormatException e){
                System.out.println("Debe introducir numeros tanto en el consumo como en la temperatura");
                flag=false;
            }catch (Exception i){
                System.out.println("El modelo no puede contener numeros");
                flag=false;
            }
        }while(!flag);
    }
    private static Frigorifico generarObjeto() throws Exception {
        //Crear pedir los atributos

        Scanner sc = new Scanner(System.in,"UTF-8");

        System.out.println("Introduce el modelo:");
            String modelo= sc.nextLine();
        for (int i = 0; i < modelo.length(); i++) {
            if (modelo.indexOf(String.valueOf(i))>0){
                throw new Exception("Número no puede ser negativo");
            }
        }

        System.out.println("Introduce el consumo:");
            float consumo= Float.parseFloat(sc.nextLine());

        System.out.println("Introduce la temperatura:");
            float temperatura= Float.parseFloat(sc.nextLine());
        //Crear objeto
        Frigorifico f = new Frigorifico(modelo,consumo,temperatura);






        return f;
    }
    private static void imprimirObjeto(Frigorifico f){
        System.out.println("------IMPRESIÓN DE OBJETO------");
        System.out.println(f.toString());
    }
}
