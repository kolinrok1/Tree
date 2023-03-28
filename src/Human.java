public class Human {
    private String gender;
    private String name;
    private String data_fiirst;
    private String data_last;
    private String parant;

    public Human(String gender, String name, String data_fiirst, String data_last, String parant) {
        this.gender = gender;
        this.name = name;
        this.data_fiirst = data_fiirst;
        this.data_last = data_last;
        this.parant = parant;
    }

    public Human(String gender, String name, String data_fiirst, String data_last) {
        this.gender = gender;
        this.name = name;
        this.data_fiirst = data_fiirst;
        this.data_last = data_last;
        this.parant = "-";
    }

    @Override
    public String toString() {
        return name + " " + gender + " " + parant;
    }
}
