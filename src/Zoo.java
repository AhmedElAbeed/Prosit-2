import java.util.ArrayList;
import java.util.List;
class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    private List<Animal> animalsList = new ArrayList<>();

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages];
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
                    return true; // L'ajout a été effectué avec succès.
                }
            }
        }
        return false; // Le zoo est plein ou l'animal est déjà présent, impossible d'ajouter l'animal.
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
}
