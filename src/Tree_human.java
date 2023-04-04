import java.util.ArrayList;
import java.util.List;

public class Tree_human {
    private List<Human> humanList;

    public Tree_human(List<Human> humanList) {
        this.humanList = humanList;
    }

    public Tree_human() {
        this(new ArrayList<>());
    }

    public boolean addHuman(Human human) {
        if (human == null) {
            return false;
        }
        if (humanList.contains(human)) {
            humanList.add(human);
            if (human.getFather() != null) {
                human.getFather().addChild(human);
            }
            if (human.getMather() != null) {
                human.getMather().addChild(human);
            }
            return true;
        }
        return false;
    }
        //public List<Human> getHumanList () {
         //   return humanList;
        //}
    public Human getByName(String name){
        for (Human human: humanList){
            if (human.getName_p().equals(name)){
                return human;
            }
        }
        return null;
    }
    public String getInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append("дерево ");
        sb.append(humanList.size());
        sb.append(" обьектов \n");
        for (Human human: humanList){
            sb.append(human.getInfo());
            sb.append("\n");
        }
        return sb.toString();
    }
    }
