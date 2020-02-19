package lesson04.c_interfaces.a_main_usage.climate;

/**
 * Created by Vladimir Trandafilov on 19.02.2020.
 */
public class AirCondition implements Climatable {
	@Override
	public void climateControl(int targetTemp) {
		System.out.printf("Air conditioner was turned on with t=%d%n", targetTemp);
	}

	@Override
	public void stopClimate() {
		System.out.println("Air conditioner was turned off");
	}

	@Override
	public String toString() {
		return "AirCondition{}";
	}
}
