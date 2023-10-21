package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    float swimmingDepth;

    public Penguin(String habitat, float swimmingDepth) {
        super(habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public void swim() {
        System.out.println("This penguin is swimming.");
    }

    @Override
    public String toString() {
        return "Penguin [" + super.toString() + ", Swimming Depth: " + swimmingDepth + "]";
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }
}
