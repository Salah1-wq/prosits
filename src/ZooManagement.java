//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class ZooManagement {
    int nbrCages = 20;
    String zooName = "my zoo";

    public static void main(String[] args) {
        ZooManagement zoo = new ZooManagement();

        System.out.println( zoo.zooName + " comporte " + zoo.nbrCages + " cages.");

        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le nom du zoo : ");
        String inputName = sc.nextLine();
        while (inputName.trim().isEmpty()) {
            System.out.print("Le nom du zoo ne peut pas être vide. Réessayez : ");
            inputName = sc.nextLine();
        }
        zoo.zooName = inputName;

        System.out.print("Entrez le nombre de cages : ");
        int inputCages = -1;
        while (true) {
            if (sc.hasNextInt()) {
                inputCages = sc.nextInt();
                if (inputCages > 0) {
                    break;
                } else {
                    System.out.print("Le nombre de cages doit être positif. Réessayez : ");
                }
            } else {
                System.out.print("Veuillez entrer un entier valide. Réessayez : ");
                sc.next();
            }
        }
        zoo.nbrCages = inputCages;

        System.out.println( zoo.zooName + " comporte " + zoo.nbrCages + " cages.");

        sc.close();

        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal tiger = new Animal("Felidae", "Tiger", 3, true);
        Animal crocodile = new Animal("Crocodylidae", "Crocodile", 10, true);


        Zoo myZoo = new Zoo("My Zoo", "Tunis", 20);

        myZoo.animals[0] = lion;
        myZoo.animals[1] = tiger;
        myZoo.animals[2] = crocodile;

        myZoo.displayZoo();

        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        System.out.println(lion);
        System.out.println(tiger);
        System.out.println(crocodile);

    }
}


