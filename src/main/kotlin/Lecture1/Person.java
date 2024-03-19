package Lecture1;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Person {
    private final String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @NotNull
    public String getName(){
        return name;
    }

    public static void printAgeIfPerson(Object o){
        if (o instanceof Person){
            Person person = (Person) o;
            System.out.println("person.age = " + person.getAge());
        }
    }
}
