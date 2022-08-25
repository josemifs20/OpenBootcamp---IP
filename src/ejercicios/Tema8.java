package ejercicios;

public class Tema8 {
    public static void main(String[] args) {
        // Se muestran todas las formas de print, print no realiza salto, println incluye salto de linea, printf añade formato.
        Persona persona1 = new Persona();
        persona1.setEdad(20);
        System.out.print("La edad es: " + persona1.getEdad() + "\n" );

        Persona persona2 = new Persona();
        persona2.setNombre("Pepe");
        System.out.printf ("El nombre de la persona es: %s%n", persona2.getNombre());

        // Printf, %s string, %d integer, %f float, %n salto de linea.
        Persona persona3 = new Persona();
        persona3.setTelefono(696765457);
        System.out.println("El número de teléfono es: " + persona3.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private long telefono;

    public Persona() {
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTelefono() {
        return this.telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
}
