package lesson04.a_inheritance;

public class Program {

    public static void main(String[] args) {
        Truck truck = new Truck("Renault", 2005);
        PassengerCar car = new PassengerCar("Daewoo", 2003);

        System.out.println(truck);
        System.out.println(car);

        truck.gas();
        car.gas();
        truck.stop();
        car.stop();
    }
}
