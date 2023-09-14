package Laba_4;

class Planet implements Nameable {
    private String name;

    Planet(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
}
