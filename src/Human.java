public class Human {
    private String gender;
    private String name_p;
    private String child;

    public Human(String gender, String name_p, String child) {
        this.gender = gender;
        this.name_p = name_p;
        if (child.equals("")){
            this.child = "-";
        }
        else {
            this.child = child;
        }
    }

    public Human(String gender, String name_p) {
        this.gender = gender;
        this.name_p = name_p;
        this.child = "-";
    }

    public String getName_p() {
        return name_p;
    }

    public String getChild() {
        return child;
    }

    @Override
    public String toString() {
        return "Родитель: " + name_p + " " + "Ребенок: " + child;
    }

}
