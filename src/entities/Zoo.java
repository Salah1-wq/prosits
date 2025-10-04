package entities;

public class Zoo {
    private final int nbrCages = 25;
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrAnimals;

    public Zoo(String name, String city) {
        setName(name); // Vérifie que le nom n'est pas vide
        this.city = city;
        this.animals = new Animal[nbrCages];
        this.nbrAnimals = 0;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Erreur : le nom du zoo ne peut pas être vide. Valeur mise par défaut : 'Inconnu'");
            this.name = "Inconnu";
        } else {
            this.name = name;
        }
    }

    public String getCity() {
        return city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Impossible : le zoo est plein. (" + nbrAnimals + "/" + nbrCages + ")");
            return false;
        }

        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                System.out.println("Impossible : l’animal " + animal.getName() + " est déjà dans le zoo.");
                return false;
            }
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
            if (animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].getName().equals(animal.getName())) {

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
        if (z1.getNbrAnimals() > z2.getNbrAnimals()) {
            return z1;
        } else if (z2.getNbrAnimals() > z1.getNbrAnimals()) {
            return z2;
        } else {
            return null;
        }
    }


}


