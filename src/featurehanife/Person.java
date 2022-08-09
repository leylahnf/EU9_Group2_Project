package featurehanife;

public class Person {
    private String name;
    private char gender;
    private int age;

    public Person(String name, char gender, int age) {
        setName(name);
        setGender(gender);
        setAge(age);
    }

    //getters

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
    //setters

    public void setName(String name) {
        this.name = name;
    }



    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //instance methods
    public void eat(){
        System.out.println(name + " is eating.");
    }

    public void drink(){
        System.out.println(name + " is drinking.");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

}
