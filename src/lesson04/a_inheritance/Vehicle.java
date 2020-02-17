package lesson04.a_inheritance;

public abstract class Vehicle {

    private String model;
    private int produceYear;

    public Vehicle(String model, int produceYear) {
        this.model = model;
        this.produceYear = produceYear;
    }

    public void gas() {
        System.out.println(this.getClass().getSimpleName() + " Started to move");
        System.out.println(this.getClass().getSimpleName() + " Driving");
    }

    public void stop() {
        System.out.println(this.getClass().getSimpleName() + " Started to stop");
        System.out.println(this.getClass().getSimpleName() + " Stopped");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProduceYear() {
        return produceYear;
    }

    public void setProduceYear(int produceYear) {
        this.produceYear = produceYear;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", produceYear=" + produceYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehicle vehicle = (Vehicle) o;

        if (produceYear != vehicle.produceYear) return false;
        return model != null ? model.equals(vehicle.model) : vehicle.model == null;
    }

    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + produceYear;
        return result;
    }
}
