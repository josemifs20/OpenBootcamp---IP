package ejercicios;

public class tema3 {
    public static void main(String[] args) {
        // Firsts part
        int result;
        result = suma(1, 2, 3);
        System.out.println("Resultado de la suma: " + result);

        // Second part
        Car car1 = new Car();
        car1.plusDoor();
        System.out.println("Número de puertas: " + car1.door);
    }

    public static int suma(int num1, int num2, int num3) {
        return (num1 + num2 + num3);

    }

    /**
     * Class Car, implementa método para ampliar puertas.
     */
    public static class Car {
        private int door = 0;

        public Car() {
        }

        public void plusDoor() {
            this.door++;
        }
    }
}
