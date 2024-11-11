public class Dancer extends Person {
    private String dancing;
    private String groupName;

    public Dancer(String name, String designation, String groupName, String learn, String walk, String eat, String dancing) {
        super(name, designation, learn, walk, eat);
        this.dancing = dancing;
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Dancer{" + super.toString() +
                "dancing='" + dancing + '\'' +
                ", groupName='" + groupName + '\'' +
                '}';
    }
}
