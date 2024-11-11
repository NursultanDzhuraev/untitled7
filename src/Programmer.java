public class Programmer extends Person {
    private String coding;
    private String companyName;

    public Programmer(String name, String designation, String companyName, String learn, String walk, String eat, String coding) {
        super(name, designation, learn, walk, eat);
        this.coding = coding;
        this.companyName = companyName;

    }

    @Override
    public String toString() {
        return "Programmer{" + super.toString() +
                "coding='" + coding + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
