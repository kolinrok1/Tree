public class Human {
    private String gender;
    private String name;
    private String parant;

    public Human(String gender, String name, String parant) {
        this.gender = gender;
        this.name = name;
        this.parant = parant;
    }

    public Human(String gender, String name) {
        this.gender = gender;
        this.name = name;
        this.parant = "-";
    }

    @Override
    public String toString() {
        return name + " " + gender + " " + parant;
    }
}
