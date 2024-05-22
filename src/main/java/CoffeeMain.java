public class CoffeeMain {
    public static void main(String[] args) {
        TurningOn on = new TurningOn(true);
        TurningOn off = new TurningOn(false);

        System.out.println("Coffee machine is turned on: " + on.isTurnOn());
    }
}
