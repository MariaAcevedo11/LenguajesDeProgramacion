class Administrativo extends Persona { //Se crea clase heredada

    public Administrativo(String nombre, String apellido, int edad, double estatura, String profesion){ //Constructor heredado de la clase Persona
        super (nombre, apellido, edad, estatura, profesion);
    }

    //Para polimorfismo en la clase ObjetosDePersona
    @Override
    public void saludar(){
        System.out.println("Hola! Soy administrativo");
    }

    //Para polimorfismo en la clase ObjetosDePersona
    @Override
    public void caminar(){
        System.out.println("Administrativo está caminando");
    }
}
