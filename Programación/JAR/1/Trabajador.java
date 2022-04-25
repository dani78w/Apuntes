public class Trabajador {
    String nombre="";
    String ss = "";
    String dni="";
    float salario =0;
    Trabajador(){}
    Trabajador(String nombre,String ss ,String dni,float salario){
        this.nombre=nombre;
        this.ss=ss;
        this.dni=dni;
        this.salario=salario;
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getSs() {return ss;}
    public void setSs(String salario) {this.ss = salario;}

    public String getDni() {return dni;}
    public void setDni(String dni) {this.dni = dni;}

    public float getSalario() {return salario;}
    public void setSalario(float salario) {this.salario = salario;}


    public String toString() {
        return "Trabajador{" +
                "nombre='" + nombre + '\'' +
                ", ss='" + ss + '\'' +
                ", dni='" + dni + '\'' +
                ", salario=" + salario +
                '}';
    }
}

