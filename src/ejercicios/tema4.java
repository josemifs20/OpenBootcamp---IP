package ejercicios;

public class tema4 {
    public static void main(String[] args) {

        // Estructura condicional if
        int numeroIf = 2;

        if (numeroIf > 0) {
            System.out.println("Es positivo");
        } else if (numeroIf == 0) {
            System.out.println("Es igual a 0");
        } else {
            System.out.println("Es negativo");
        }

        // Bucle While
        System.out.println(" ");
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println("El contador es: " + numeroWhile);
            numeroWhile++;
        }

        // Bucle Do-While
        System.out.println(" ");
        do {
            System.out.println("El contador es: " + numeroWhile);
            numeroWhile++;

        } while (numeroWhile < 3);


        // Bucle For
        System.out.println(" ");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("El resultado es: " + numeroFor);
        }

        // Switch
        System.out.println(" ");
        String estacion = "primavera";
        switch (estacion) {
            case "primavera":
                System.out.println(estacion);
                break;
            case "verano":
                System.out.println(estacion);
                break;
            case "otoño":
                System.out.println(estacion);
                break;
            case "invierno":
                System.out.println(estacion);
            default:
                System.out.println("No es una estación.");
        }
    }
}
