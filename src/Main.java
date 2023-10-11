public class Main {
    public static void main(String[] args) {
        Alumno a; //objeto de la clase alumno
        a = new Alumno(); //instanciar linea de clase
        a.setNombre("adrian");
        a.setMatricula("00001");
        a.setCalif1(100);
        a.setCalif2(100);
        a.setCalif3(80);

        System.out.println(a.getNombre() + "\t" + a.getMatricula());
        System.out.println(a.calcularPromedio());
    }
}