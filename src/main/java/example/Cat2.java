package example;
@Table(title = "cat2")
public class Cat2 {

    @Column
    String name;

    @Column
    String color;

    @Column
    int age;

    public Cat2(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
}