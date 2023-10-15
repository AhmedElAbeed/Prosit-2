package tn.esprit.gestionzoo.entities;

class Lion extends Terrestrial {
    public Lion(int nbrLegs) {
        super(nbrLegs);
    }

    @Override
    public String toString() {
        return "Lion [Number of Legs: " + nbrLegs + "]";
    }
}