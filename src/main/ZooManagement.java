package main;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import entities.Zoo;
import entities.Animal;

public class ZooManagement {

    public static void main(String[] args) {

        Zoo myZoo = new Zoo("My Zoo", "Tunis");


        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal tiger = new Animal("Felidae", "Tiger", 3, true);
        Animal crocodile = new Animal("Crocodylidae", "Crocodile", 10, true);
        Animal lion2 = new Animal("Felidae", "Lion", 5, true);


        System.out.println("Le zoo est-il plein ? " + myZoo.isZooFull());



        System.out.println("Ajout du lion : " + myZoo.addAnimal(lion));
        System.out.println("Ajout du tigre : " + myZoo.addAnimal(tiger));
        System.out.println("Ajout du crocodile : " + myZoo.addAnimal(crocodile));
        System.out.println("Ajout du lion : " + myZoo.addAnimal(lion2));

        System.out.println(myZoo);

        myZoo.ShowAnimals();

        boolean removed = myZoo.removeAnimal(lion);
        System.out.println("\nSuppression du lion réussie ? " + removed);

        System.out.println(myZoo);

        myZoo.ShowAnimals();


        Zoo zoo1 = new Zoo("Zoo A", "Paris");
        Zoo zoo2 = new Zoo("Zoo B", "Tunis");

        zoo1.addAnimal(new Animal("Canidae", "Loup", 4, true));
        zoo1.addAnimal(new Animal("Felidae", "Tigre", 3, true));

        zoo2.addAnimal(new Animal("Ursidae", "Ours", 7, true));

        Zoo biggerZoo = Zoo.comparerZoo(zoo1, zoo2);

        if (biggerZoo != null) {
            System.out.println("Le zoo avec le plus d’animaux est : " + biggerZoo.getName());
        } else {
            System.out.println("Les deux zoos ont le même nombre d’animaux.");
        }


    }
}


