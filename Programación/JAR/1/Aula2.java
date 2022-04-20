import java.nio.charset.StandardCharsets;
import java.util.Scanner;
public class Aula2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);
        Pelicula p1 = new Pelicula();
        Pelicula p2 = new Pelicula("Iron Man","Matt Holloway");
        Pelicula p3 = new Pelicula("The Avengers",323232,"Comedia","Art Marcum", new String[]{"Actor1", "Actor2", "Actor3", "Actor4", "Actor5"},321);
        //proceso
        System.out.println("Introduce un titulo para la peli");
            p1.setTitle(sc.nextLine());
        System.out.println("Introduce un escritor para la peli");
            p1.setWriter(sc.nextLine());
        System.out.println("Introduce un numero de capitulos para la peli");
            p1.setCapNum(Integer.parseInt(sc.nextLine()));
        System.out.println("Introduce un Genero para la peli");
            String aux = "";
            boolean flag = false;
            while (!flag) {
                aux = sc.nextLine();
                if (aux.equalsIgnoreCase("D") || aux.equalsIgnoreCase("S") || aux.equalsIgnoreCase("C") || aux.equalsIgnoreCase("T")) {
                    flag=true;
                }else {System.out.println("has introducido un género no valido");}
            }
            p1.setGenre(aux);

        System.out.println("Introduce 5 actores de la peli");
            String[] actors = new String[5];
            for (int i = 0; i < actors.length; i++) {
                actors[i]=sc.nextLine();
            }
            p1.setActors(actors);
        System.out.println("Introduce el precio de la peli");
            p1.setPrice(Integer.parseInt(sc.nextLine()));
        //proceso de impresión de los objetos

        System.out.print("\n--------OBJETOS--------\n");
        imprimir(p1);
        imprimir(p2);
        imprimir(p3);


    }

    private static void imprimir(Pelicula p0) {
        System.out.println(p0.toString());
    }


}
