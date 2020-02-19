package lesson04.c_interfaces.a_main_usage;

public enum Color {
    RED("red"),
    GREEN("green"),
    BLUE("blue");

    private String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
