package Laba_3;

public abstract class Dish {
    private String material;
    private String color;
    private String name;

    public Dish(String name,String material, String color) {
        this.material = material;
        this.color = color;
        this.name = name;
    }
    public String get_material() {
        return material;
    }
    public String get_color() {
        return color;
    }
    public String get_name() {
        return name;
    }

    public void set_material(String material) {
        this.material = material;
    }

    public void set_color(String color) {
        this.color = color;
    }

    public void set_name(String name) {
        this.name = name;
    }

}
