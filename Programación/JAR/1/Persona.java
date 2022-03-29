

public class Persona
{   
    //Atributos del objeto Persona 
    //Al crear el objeto por defecto se inicializan a null
        String nif; //private acceso privado
        String nombre = "pepe";
        int edad;
   
    //CONSTRUCTOR:metodo que le da valores a los atributos de un objeto
   
       //constructor por defecto
       Persona(){}
       //constructor perso
       Persona(String n,String nom ,int ed){
           nif=n;
           nombre=nom;
           edad=ed;
       }
       //constructor para sobrecarga
       Persona(String n,String nom){
           nif=n;
           nombre=nom;
       }
   
    //get y set
   
       //metodos para el atributo NIF
       public String getNif(){
           return nif;
       }
       public void setNif(String nif){
           this.nif = nif;
       }
       //metodos para el atributo  NOMBRE
       public String getNombre(){
           return nombre;
       }
       public void setNombre(String nombre){
           this.nombre = nombre;
       }
       //metodos para el atributo  EDAD
       public int getEdad(){
           return edad;
       }
       public void setEdad(int edad){
      
           this.edad = edad;
       }
       
    //metodos de batalla
       public String toString(){
            return nif+" "+nombre+" "+edad;
       }
}

