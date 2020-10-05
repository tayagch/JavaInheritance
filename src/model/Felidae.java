package model;

public class Felidae extends Animal{

    String behavior;

    public Felidae(int age, int weight, String running, String eating) {
        super(age, weight, running, eating);
        this.behavior = "Produce Meowing meowing sound";
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }
}
