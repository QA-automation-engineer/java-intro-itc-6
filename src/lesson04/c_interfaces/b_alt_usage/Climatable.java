package lesson04.c_interfaces.b_alt_usage;

public interface Climatable {

    default void climateControl(int targetTemp) {
        System.out.println("AC works with temp: " + targetTemp);
    }

    default void stopClimate() {
        System.out.println("Climate control is turned off");
    }
}
