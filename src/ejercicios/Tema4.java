package ejercicios;

public class Tema4 {
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

        // Par o impar
        System.out.println(" ");
        int numero = 2;
        if (numero % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }

        // Bucle for each en Java con int y con string. Se envia directamente la posición en i.
        int[] arrayNumeros = {1, 2, 3, 4, 5};
        for (int i : arrayNumeros) {
            System.out.println(i);
        }

        String[] arrayString = {"uno", "dos", "tres", "cuatro", "cinco"};
        for (String i : arrayString) {
            System.out.println(i);
        }
    }
}
