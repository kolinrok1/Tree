import java.util.ArrayList;

public class Human {
    private String gender;
    private String name;
    private Human mather;
    private Human father;
    private ArrayList<Human> children;

    public Human(String gender, String name, Human mather, Human father) {
        this.gender = gender;
        this.name = name;
        this.mather = mather;
        this.father = father;
        children = new ArrayList<>();
    }

    public Human(String gender, String name_p) {
        this.gender = gender;
        this.name = name_p;
        father = null;
        mather = null;
        children = new ArrayList<>();
    }

    public String getName_p() {
        return name;
    }

    public Human getMather() {
        return mather;
    }

    public Human getFather() {
        return father;
    }

    public boolean addChild(Human child){
        if (!children.contains(child)){
            children.add(child);
            return true;
        }
        return false;
    }
    public String getInfo() {
        StringBuilder fam = new StringBuilder();
        fam.append("имя-");
        fam.append(name);
        fam.append(" ");
        fam.append("мать-");
        if (mather != null) {
            fam.append(mather);
        } else {
            fam.append("неизвестна");
        }
        fam.append("отец-");
        if (father != null) {
            fam.append(father);
        } else {
            fam.append("неизвестен");
        }
        fam.append(",");
        fam.append(getInfoChild());
        return fam.toString();
    }
        public String getInfoChild() {
        StringBuilder res = new StringBuilder();
        res.append("дети: ");
        if (children.size() != 0) {
            res.append(children.get(0).getName_p());
            for (int i = 0; i < children.size(); i++) {
                res.append(", ");
                res.append(children.get(i).getName_p());
            }
        }else {
            res.append("нет");}
        return res.toString();
        }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Human)) {
            return false;
        }
        Human human = (Human) obj;
        return human.getName_p().equals(getName_p());
    }
    }

