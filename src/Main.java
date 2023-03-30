import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Human Human1 = new Human("man", "Oleg", "Ivan");
        Human Human2 = new Human("woman", "Alla", "Ivan");
        Human Human3 = new Human("woman", "Ylya", "Oleg");
        Human Human4 = new Human("man", "Saha", "Oleg");
        Human Human5 = new Human("man", "Misha", "Dima");
        Human Human6 = new Human("woman", "Dasha", "Dima");
        ArrayList<Human> treeHuman = new ArrayList<>();
        ArrayList<Object> listParant= new ArrayList<>();
        treeHuman.add(Human1);
        treeHuman.add(Human2);
        treeHuman.add(Human3);
        treeHuman.add(Human4);
        treeHuman.add(Human5);
        treeHuman.add(Human6);
        System.out.println();
        for (Human el : treeHuman) {
            String name_parant = "" ;
            String name_child = el.getChild();
            if (!(listParant.contains(name_child))){
                System.out.println("Ребенок " + name_child);
                for (Human ec : treeHuman) {
                     if (ec.getChild().equals(name_child)) {
                         name_parant += ec.getName_p() + " ";
                     }
                }

                System.out.println("Родители " + name_parant);
                System.out.println();
                listParant.add(name_child);
            }
        }
    }
}