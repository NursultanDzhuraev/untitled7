public class Singer extends Person {
    private String singing;
    private String playGuitar;
    private String bandName;

    public Singer(String name, String designation, String bandName, String learn, String walk, String eat, String singing, String playGuitar) {
        super(name, designation, learn, walk, eat);
        this.singing = singing;
        this.playGuitar = playGuitar;
        this.bandName = bandName;
    }

    @Override
    public String toString() {
        return "Singer{" + super.toString() +
                "singing='" + singing + '\'' +
                ", playGuitar='" + playGuitar + '\'' +
                ", bandName='" + bandName + '\'' +
                '}';
    }
}
