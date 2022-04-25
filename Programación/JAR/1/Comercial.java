
/**
 * Write a description of class Comercial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comercial extends Trabajador{
    String dietas="";

    Comercial(String nombre,String ss ,String dni,float salario,String dietas){
        super(nombre,ss,dni,salario);
        this.dietas=dietas;
    }

}
