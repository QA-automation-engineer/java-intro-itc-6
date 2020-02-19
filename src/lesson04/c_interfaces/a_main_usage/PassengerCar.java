package lesson04.c_interfaces.a_main_usage;

import lesson04.c_interfaces.a_main_usage.climate.Climatable;

public class PassengerCar extends Car {

    public PassengerCar(String manufacturer, int produceYear, Color color) {
        super(manufacturer, produceYear, color);
    }

    public PassengerCar(String manufacturer, int produceYear, Color color, Engine engine) {
        super(manufacturer, produceYear, color, engine);
    }

    public PassengerCar(String manufacturer, int produceYear, Color color, Engine engine, Climatable climate) {
        super(manufacturer, produceYear, color, engine, climate);
    }

    @Override
    String getType() {
        return "Passenger car";
    }

    @Override
    public String toString() {
        return "PassengerCar{} extends " + super.toString();
    }
}
