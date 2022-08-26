package ejercicios;

public class Tema8y9 {
    public static void main(String[] args) {
        // Tema 8

        // Se muestran todas las formas de print, print no realiza salto, println incluye salto de linea, printf añade formato.
        Persona persona1 = new Persona();
        persona1.setEdad(20);
        System.out.print("La edad es: " + persona1.getEdad() + "\n");

        Persona persona2 = new Persona();
        persona2.setNombre("Pepe");
        System.out.printf("El nombre de la persona es: %s%n", persona2.getNombre());

        // Printf, %s string, %d integer, %f float, %n salto de linea.
        Persona persona3 = new Persona();
        persona3.setTelefono(696765457);
        System.out.println("El número de teléfono es: " + persona3.getTelefono());

        // Tema 9
        System.out.println();
        Cliente cliente = new Cliente();
        cliente.setEdad(11);
        cliente.setNombre("Antonio");
        cliente.setTelefono(95456748);
        cliente.setCredito(200);
        System.out.printf("El nombre del cliente es %s y tiene %d años, su número de telefono es %d. Tiene un credito de %d", cliente.getNombre(), cliente.getEdad(), cliente.getTelefono(), cliente.getCredito());

        System.out.println();
        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(20);
        trabajador.setNombre("Luis");
        trabajador.setTelefono(78456748);
        trabajador.setSalario(1000);
        System.out.printf("El nombre del trabajador es %s y tiene %d años, su número de telefono es %d. Su salario es de %d%n", trabajador.getNombre(), trabajador.getEdad(), trabajador.getTelefono(), trabajador.getSalario());

        // Prueba enovoltorio, llamamos a función envoltorio y le pasamos una instancia que implementa la interfaz.
        Coche coche = new Coche();
        EjecutaAcelerar(coche);
        Moto moto = new Moto();
        EjecutaAcelerar(moto);
    }
    // Prueba función envoltorio que recibe interfaz por parámetro.
    public static void EjecutaAcelerar(Vehiculo vehiculo) {
        vehiculo.Acelerar(15);
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

class Cliente extends Persona {
    private int credito;

    public Cliente() {
    }

    public int getCredito() {
        return this.credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    private int salario;

    public Trabajador() {

    }

    public int getSalario() {
        return this.salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}

// Interface y clases que implementan la interfaz. Código pruebra.
interface Vehiculo {
    void Acelerar(int velocidad);

    void Frenar(int velocidad);
}

class Coche implements Vehiculo {
    @Override
    public void Acelerar(int velocidad) {
        System.out.println("Coche - Acelerar");
    }

    @Override
    public void Frenar(int velocidad) {
        System.out.println("Coche - Frenar");
    }
}

class Moto implements Vehiculo {
    @Override
    public void Acelerar(int velocidad) {
        System.out.println("Moto - Acelerar");
    }

    @Override
    public void Frenar(int velocidad) {
        System.out.println("Moto - Frenar");
    }
}
