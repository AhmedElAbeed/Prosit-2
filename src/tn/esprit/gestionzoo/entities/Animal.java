package tn.esprit.gestionzoo.entities;

public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    public Animal() {
        if (age >= 0) {
            this.name = name;
            this.age = age;
        } else {
            System.out.println("L'âge ne peut pas être négatif.");
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal [Name: " + name + ", Family: " + family + ", Age: " + age + ", Is Mammal: " + isMammal + "]";
    }
}