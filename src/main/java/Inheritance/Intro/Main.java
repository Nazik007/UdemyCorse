package Inheritance.Intro;

import Inheritance.ancestor.Object;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Zack", 27);
        Person person2 = new Person(person);
        System.out.println(person2 == person); // NEVER USE == TO COMPARE OBJ
        System.out.println(person2.equals(person));
        System.out.println("person.hashCode() = " + person.hashCode());
        System.out.println("person2.hashCode() = " + person2.hashCode());

        System.out.println(person.toString());
    }
}
