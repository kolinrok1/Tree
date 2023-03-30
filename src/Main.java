import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Human Human1 = new Human("man", "Oleg", "Inan"); //Иван сын Олега
        Human Human2 = new Human("woman", "Alla", "Ivan"); //
        Human Human3 = new Human("woman", "Alla", "Misha");
        Human Human4 = new Human("man", "Oleg", "Misha");
        Human Human5 = new Human("man", "Misha", "Dima");
        Human Human6 = new Human("woman", "Dasha", "Dima");
        ArrayList<Human> treeHuman = new ArrayList<>();
        treeHuman.add(Human1);
        treeHuman.add(Human2);
        treeHuman.add(Human3);
        treeHuman.add(Human4);
        treeHuman.add(Human5);
        treeHuman.add(Human6);
        for (Human el: treeHuman) {
            System.out.println(el);;
        }

    }
}