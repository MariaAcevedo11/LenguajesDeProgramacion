public class Persona {

    //Encapsulamiento
    //Atributos
    private String nombre;
    private String apellido;
    private String profesion;
    private int edad;
    private double estatura;

    //Constructor
    public Persona(String nombre, String apellido, int edad, double estatura, String profesion){

        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.estatura = estatura;
        this.profesion = profesion;

    }

    //Getter´s
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public String getProfesion() {
        return profesion;
    }

    //Setter´s
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    //Métodos aparte
    public void saludar(){
        System.out.println("Hola! soy persona");
    }
    public void caminar(){
        System.out.println("Persona está caminando");
    }
    public void gritar(){
        System.out.println("Persona está gritando");
    }
}
