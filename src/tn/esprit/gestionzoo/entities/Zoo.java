package tn.esprit.gestionzoo.entities;

import java.util.ArrayList;
import java.util.List;
class Zoo {
    static final int nbrCages = 25;

    Animal[] animals;
    String name;
    String city;
    int nbrAnimals;
    private List<Animal> animalsList = new ArrayList<>();

    public Zoo(String name, int nbrAnimals) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Le nom du zoo ne peut pas être vide.");
        }
        this.nbrAnimals = nbrAnimals;
        this.animals = new Animal[nbrAnimals];
    }

    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + nbrCages);
    }

    public void displayAnimals() {
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println(animal.toString());
                System.out.println("--------------");
            }
        }
    }

    public boolean addAnimal(Animal animal) {
        if (!animalsList.contains(animal)) {
            for (int i = 0; i < animals.length; i++) {
                if (animals[i] == null) {
                    animals[i] = animal;
                    animalsList.add(animal);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].equals(animal)) {
                animals[i] = null;
                animalsList.remove(animal);
                return true; // La suppression a été effectuée avec succès.
            }
        }
        return false; // L'animal n'a pas été trouvé dans le zoo, ou le zoo est vide.
    }

    public int searchAnimal(String animalName) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].name.equals(animalName)) {
                return i; // Retourne l'indice de l'animal si trouvé.
            }
        }
        return -1; // L'animal n'a pas été trouvé.
    }
    boolean isZooFull() {
        return nbrAnimals == nbrCages;
    }

    static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages: " + nbrCages + " N° animals: " + nbrAnimals;
    }



}
