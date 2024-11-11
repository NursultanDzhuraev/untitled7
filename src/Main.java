//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Almaz","Saparov","java","Programmer","chocolate");
        Person person2 = new Person("Erlan","Saparov","C++","Programmer","doner");
        Person person3 = new Person("Nuridin","Sherov","tango","Dance","steak");
        Person person4 = new Person("Nur","Sherov","vals","Dance","");
        Person person5 = new Person("Sagyn","Sharipov","roc", "Singer","Fruit salad");
        Person person6 = new Person("Salim","Sharipov","pop","Singer","dish");

        Programmer programmer1 = new Programmer("Almaz","Saparov","HaulMar",
                "java","Peaksoft House","chocolate","codingGames");
        Programmer programmer2 = new Programmer("Erlan","Saparov","AnyWay",
                "C++","InfoPort","doner","codingGames");

        Dancer dancer1 = new Dancer("Nuridin","Sherov","Inna",
                "tango","dance shcool","steak","Levine music");
        Dancer dancer2 = new Dancer("Nur","Sherov","RuPaul",
                "vals","dance shcool","torte","literasii");

        Singer singer1 = new Singer("Sagyn","Sharipov","Saga",
                "roc","signer shcool","Fruit salad","saga music","good");
        Singer singer2 = new Singer("Salim","Sharipov","Sali",
                "pop","signer shcool","dish","dancer music","good");

        Object[] people={person1,person2,person3,person4,person5,person6,programmer1,programmer2,dancer1,dancer2,singer1,singer2};
        for (Object person : people) {
            System.out.println(person.toString());
        }



    }
}