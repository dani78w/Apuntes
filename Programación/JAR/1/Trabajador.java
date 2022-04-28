public class Trabajador {
    String nombre="", ss = "",dni="";
    float salario =0;
    Trabajador(){}
    Trabajador(String nombre,String ss ,String dni,float salario){
        this.nombre=nombre;
        this.ss=ss;
        this.dni=dni;
        this.salario=salario;
    }
    //getter y setter Nombre
        public String getNombre() {return nombre;}
        public void setNombre(String nombre) {this.nombre = nombre;}
    //getter y setter SeguridadSocial
        public String getSs() {return ss;}
        public void setSs(String salario) {this.ss = salario;}
    //getter y setter Dni
        public String getDni() {return dni;}
        public void setDni(String dni) {this.dni = dni;}
    //getter y setter Salario
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

