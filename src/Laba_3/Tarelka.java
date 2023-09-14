package Laba_3;

public class Tarelka extends Dish {
    private String form;

    public Tarelka(String name, String material, String color, String form) {
        super(name, material, color);
        this.form = form;

    }

    public String get_form() {
        return form;
    }


    public void set_form(String form) {
        this.form = form;
    }

}
