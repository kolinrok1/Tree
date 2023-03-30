import java.util.ArrayList;
import java.util.List;

public class Tree_human {
    private List<Human> humanList;

    public Tree_human(List<Human> humanList){
        this.humanList = humanList;
    }
    public Tree_human() {
        this(new ArrayList<>());
    }
    public void addHuman(Human human){
        humanList.add(human);
    }
    public List<Human> getHumanList() {
        return humanList;
    }

}
