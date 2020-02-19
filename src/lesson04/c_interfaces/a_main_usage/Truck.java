package lesson04.c_interfaces.a_main_usage;

import lesson04.c_interfaces.a_main_usage.climate.Climatable;

public class Truck extends Car {

    public Truck(String manufacturer, int produceYear, Color color) {
        super(manufacturer, produceYear, color);
    }

    public Truck(String manufacturer, int produceYear, Color color, Engine engine) {
        super(manufacturer, produceYear, color, engine);
    }

    public Truck(String manufacturer, int produceYear, Color color, Engine engine, Climatable climate) {
        super(manufacturer, produceYear, color, engine, climate);
    }

    @Override
    String getType() {
        return "Truck";
    }

    @Override
    public String toString() {
        return "Truck{} extends + " + super.toString();
    }
}
