/**
 * Abstract class Abstracta - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Abstracta extends Mates
{
    //metodos abstractos necesitan ser redefinidos en la clase derivada
    public int resultado =0;
    public abstract void operacion(int num1,int num2);
    public void mostrar() {
        System.out.println(resultado + ": resultado");
    }
    
    
}
