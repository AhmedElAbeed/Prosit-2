package tn.esprit.gestionzoo.entities;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private static final int MAX_ANIMALS = 25;
    private List<Animal> animals;
    private Aquatic[] aquaticAnimals;
    private String name;
    private String city;

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new ArrayList<>();
        this.aquaticAnimals = new Aquatic[10];
    }

    public boolean addAnimal(Animal animal) {
        if (animals.size() < MAX_ANIMALS && !animalExists(animal.getName())) {
            animals.add(animal);
            return true;
        } else {
            System.out.println("Zoo is full or the animal already exists. Cannot add more animals.");
            return false;
        }
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        for (int i = 0; i < aquaticAnimals.length; i++) {
            if (aquaticAnimals[i] == null) {
                aquaticAnimals[i] = aquatic;
                break;
            }
        }
    }

    public void displayAquaticAnimalsSwimming() {
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic != null) {
                aquatic.swim();
            }
        }
    }

    private boolean animalExists(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    public int searchAnimal(String animalName) {
        for (int i = 0; i < animals.size(); i++) {
            Animal animal = animals.get(i);
            if (animal != null && animal.getName().equalsIgnoreCase(animalName)) {
                return i;
            }
        }
        return -1;
    }

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    public void displayAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animals.size() > z2.animals.size()) {
            return z1;
        }
        return z2;
    }

    public boolean isZooFull() {
        return animals.size() == MAX_ANIMALS;
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Penguin) {
                Penguin penguin = (Penguin) aquatic;
                maxDepth = Math.max(maxDepth, penguin.getSwimmingDepth());
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Dolphin) {
                dolphinCount++;
            } else if (aquatic instanceof Penguin) {
                penguinCount++;
            }
        }
        System.out.println("Number of Dolphins: " + dolphinCount);
        System.out.println("Number of Penguins: " + penguinCount);
    }

}
