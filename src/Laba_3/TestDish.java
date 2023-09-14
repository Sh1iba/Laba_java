package Laba_3;

class TestDish {
    public static void main(String[] args) {
        Tarelka dish = new Tarelka ("Тарелка","Керамика","Белый","Круглая");
        Vilka vilk = new Vilka("Вилка","Железо","Серебристый",10);

        String name = dish.get_name();
        String material = dish.get_material();
        String color = dish.get_color();
        String form  = dish.get_form();
        System.out.println("Имя: " + name + "\n" + "Материал: " + material + "\n" +  "Цвет: " + color + "\n" + "Форма: " + form + "\n");

        name = vilk.get_name();
        material = vilk.get_material();
        color = vilk.get_color();
        int count  = vilk.get_count();
        System.out.println("Имя: " + name + "\n" + "Материал: " + material + "\n" +  "Цвет: " + color + "\n" + "Количество штук: " + count + "\n");

        vilk.set_count(20);
        count  = vilk.get_count();
        System.out.println("Имя: " + name + "\n" + "Материал: " + material + "\n" +  "Цвет: " + color + "\n" + "Количество штук: " + count + "\n");




    }
}
