package Laba_3;

public class Vilka extends Dish {

    private int count;
    public Vilka(String name,String material, String color,int count) {
        super(name,material, color);
        this.count = count;
    }
    public int get_count() {
        return count;
    }
    public void set_count(int count) {
        this.count = count;
    }

}
