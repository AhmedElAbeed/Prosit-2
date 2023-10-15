package tn.esprit.gestionzoo.entities;

class Aquatic  extends Animal{
    String habitat;

    public Aquatic(String habitat) {
        super();
        this.habitat = habitat;
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

    @Override
    public String toString() {
        return "Habitat: " + habitat;
    }
}