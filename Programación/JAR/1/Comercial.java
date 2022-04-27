
/**
 * Write a description of class Comercial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comercial extends Trabajador{
    String dietas=" ";

    Comercial(String nombre,String ss ,String dni,float salario,String dietas){
        super(nombre,ss,dni,salario);
        this.dietas=dietas;
    }

    public void setDietas(String dietas) {this.dietas = dietas;}
    public String getDietas() {return dietas;}

    public final String toString() {
        return "" +
                super.toString()+
                "{Comercial: dietas='" + dietas + '\'' +
                '}';
    }

    public void masDietas(String extra){dietas= dietas+extra;}

}
