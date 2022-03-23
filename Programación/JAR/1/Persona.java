
public class Persona
{
   String nif; //private acceso privado
   String nombre = "pepe";
   short edad;
   
   //CONSTRUCTOR:metodo que le da valores a los atributos de un objeto
   
   //constructor por defecto
   Persona(){}
   //constructor perso
   Persona(String n,String nom ,short ed){
       nif=n;
       nombre=nom;
       edad=ed;
   }
   //constructor para sobrecarga
   Persona(String n,String nom){
       nif=n;
       nombre=nom;
   }
}
