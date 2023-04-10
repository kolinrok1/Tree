import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Tree_human tree = new Tree_human();
        tree.addHuman(new Human("woman", "Алла"));
        tree.addHuman(new Human("man", "Олег"));
        tree.addHuman(new Human("man", "Дима",tree.getByName("Олег"), tree.getByName("Алла")));
        System.out.println(tree.getInfo());
    }
}