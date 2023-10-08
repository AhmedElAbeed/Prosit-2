package tn.esprit.gestionzoo.entities;

class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    public Animal(String name, int age) {
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