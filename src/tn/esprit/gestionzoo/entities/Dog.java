package tn.esprit.gestionzoo.entities;

class Dog extends Terrestrial {
    public Dog(int nbrLegs) {
        super(nbrLegs);
    }

    @Override
    public String toString() {
        return "Dog [Number of Legs: " + nbrLegs + "]";
    }
}