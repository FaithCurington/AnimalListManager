import java.util.ArrayList;
import java.util.List;

public class AnimalManager {
    private List<Animal> animals;

    public AnimalManager() {
        animals = new ArrayList<>();
    }

    public void addAnimal(String name, String species) {
        animals.add(new Animal(name, species));
    }

    public void listAnimals() {
        if (animals.isEmpty()) {
            System.out.println("No animals in the list!");
        } else {
            for (int i = 0; i < animals.size(); i++) {
                System.out.println((i + 1) + ". " + animals.get(i));
            }
        }
    }

    public void removeAnimal(int index) {
        if (index >= 0 && index < animals.size()) {
            animals.remove(index);
            System.out.println("Animal removed!");
        } else {
            System.out.println("Invalid animal number.");
        }
    }
}

