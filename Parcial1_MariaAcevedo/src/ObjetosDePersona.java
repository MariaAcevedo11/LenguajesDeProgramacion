
public class ObjetosDePersona {

    public static void main(String[] args) {
        Persona estudiante = new Persona("María", "Acevedo", 17, 1.64, "Estudiante");

        System.out.println("\nCarácteristicas del estudiante: ");
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Apellido: " + estudiante.getApellido());
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("Estatura: " + estudiante.getEstatura());
        System.out.println("Profesion: " + estudiante.getProfesion());
        estudiante.saludar();
        estudiante.caminar();
        estudiante.gritar();


        Persona docente = new Persona("Angela", "Martínez", 43, 1.72, "Docente");

        System.out.println("\nCarácteristicas del Docente: ");
        System.out.println("Nombre: " + docente.getNombre());
        System.out.println("Apellido: " + docente.getApellido());
        System.out.println("Edad: " + docente.getEdad());
        System.out.println("Estatura: " + docente.getEstatura());
        System.out.println("Profesion: " + docente.getProfesion());
        docente.saludar();
        docente.caminar();
        docente.gritar();


        Administrativo administrativo = new Administrativo("Gaby", "Sanabria", 29, 1.62, "Administrativa"); //Herencia de la clase Administrativo

        System.out.println("\nCarácteristicas del Administrativ@: ");

        System.out.println("Nombre: " + administrativo.getNombre());
        System.out.println("Apellido: " + administrativo.getApellido());
        System.out.println("Edad: " + administrativo.getApellido());
        System.out.println("Estatura: " + administrativo.getEstatura());
        System.out.println("Profesion: " + administrativo.getProfesion());

        //Polimorfismo
        administrativo.saludar();
        administrativo.caminar();
        //Sin polimorfismo
        administrativo.gritar();
    }
}
