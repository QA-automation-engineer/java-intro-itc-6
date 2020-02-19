package lesson04.c_interfaces.a_main_usage;

import lesson04.c_interfaces.a_main_usage.climate.AirCondition;
import lesson04.c_interfaces.a_main_usage.climate.ClimateControl;

public class Program {

    public static void main(String[] args) {
        Engine truckEngine = new Engine(5.6);
        Engine passEngine = new Engine(1.5);
        PassengerCar car = new PassengerCar("Daewoo", 2005, Color.RED, passEngine, new ClimateControl());
        Truck truck = new Truck("Renault", 2016, Color.GREEN, truckEngine, new AirCondition());

        System.out.println(truck);
        System.out.println(car);

        truck.gas();
        truck.startClimate(24);
        car.gas();
        car.startClimate(22);
        car.stop();
        car.stopClimate();
        truck.stop();
        truck.stopClimate();

        System.out.println("----------TRUCK HAS GOT CLIMATE SYSTEM----------");
        truck.mountClimateSystem(new ClimateControl());
        System.out.println(truck);
        truck.startClimate(24);
        truck.stopClimate();
    }
}
