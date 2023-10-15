package tn.esprit.gestionzoo.entities;

class Terrestrial extends Animal    {
    int nbrLegs;

    public Terrestrial(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return "Number of Legs: " + nbrLegs;
    }
}
