package tn.esprit.gestionzoo.entities;

public class Main {
    public static void main(String[] args) {

        Animal lion = new Animal("Félin", 5);
        Animal eagle = new Animal("bird",  17);

        Zoo myZoo = new Zoo("Mon Zoo", 10);
        Zoo zooz = new Zoo("Pas Mon Zoo", 10);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(eagle);
        myZoo.displayZoo();

        System.out.println("Animals in the Zoo:");
        myZoo.displayAnimals();
        String searchName = "Lion";
        int animalIndex = myZoo.searchAnimal(searchName);
        if (animalIndex != -1) {
            System.out.println("Found at index: " + animalIndex);
        } else {
            System.out.println("Animal not found.");
        }


        myZoo.removeAnimal(lion);
        System.out.println("Animal removed from the zoo.");


        System.out.println("##########################");
        myZoo.displayAnimals();

        System.out.println(Zoo.comparerZoo(myZoo, zooz));
        System.out.println(myZoo.isZooFull());

    }
}
