public class Person {
    private String name;
    private String designation;
    private String learn;
    private String walk;
    private String eat;

    public Person() {
    }

    public Person(String name, String designation,  String learn, String walk, String eat) {
        this.name = name;
        this.designation = designation;
        this.learn = learn;
        this.walk = walk;
        this.eat = eat;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", learn='" + learn + '\'' +
                ", walk='" + walk + '\'' +
                ", eat='" + eat + '\'' +
                '}';
    }
}
