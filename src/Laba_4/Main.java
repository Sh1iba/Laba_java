package Laba_4;

public class Main {
    public static void main(String[] args) {
        Planet planet = new Planet("Нептун");
        Car car = new Car("BMW");
        Human human = new Human("Сергей");

        String planet_name = planet.getName();
        String car_name = car.getName();
        String human_name = human.getName();

        System.out.println("\n"+"Имя планеты: " + planet_name);
        System.out.println("Название машины: " + car_name);
        System.out.println("Имя человека: " + human_name);

    }
}
