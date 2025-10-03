public class Zoo {
    private final int nbrCages = 25;
    Animal[] animals ;
    String name;
    String city;
    int nbrAnimals;

    public Zoo(String name, String city) {
        this.animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrAnimals = 0;

    }

    public boolean addAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].name.equals(animal.name)) {
                System.out.println("Impossible : l’animal " + animal.name + " est déjà dans le zoo.");
                return false;
            }
        }

        if (nbrAnimals >= animals.length) {
            System.out.println("Impossible : le zoo est plein.");
            return false;
        }

        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }

    public void ShowAnimals() {
        System.out.println("Animaux du  " + name + " :");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println( animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].name.equals(animal.name)) {

                for (int j = i; j < nbrAnimals - 1; j++) {
                    animals[j] = animals[j + 1];
                }
                animals[nbrAnimals - 1] = null;
                nbrAnimals--;
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Zoo { " +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                " }";
    }

    public boolean isZooFull() {
        return nbrAnimals >= nbrCages;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals) {
            return z1;
        } else if (z2.nbrAnimals > z1.nbrAnimals) {
            return z2;
        } else {
            return null;
        }
    }

}


