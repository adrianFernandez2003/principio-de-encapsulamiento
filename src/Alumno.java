
public class Alumno {
    //atributos (variables globales para la clase)
    private String nombre="prueba1", matricula;
    private double calif1, calif2, calif3;

    //metodos
    public String getNombre(){
        return nombre;
    }
    public double calcularPromedio(){
        return (calif1+calif2+calif3)/3;
    }

    //setters
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCalif1(double calif1) {
        this.calif1 = calif1;
    }

    public void setCalif2(double calif2) {
        this.calif2 = calif2;
    }

    public void setCalif3(double calif3) {
        this.calif3 = calif3;
    }

    //getters
    public String getMatricula() {
        return matricula;
    }

    public double getCalif1() {
        return calif1;
    }

    public double getCalif2() {
        return calif2;
    }

    public double getCalif3() {
        return calif3;
    }
}
