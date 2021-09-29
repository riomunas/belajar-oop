package org.abuaisyah.object;

public class PersonInitializationApp {
    public static void main(String[] args) {
        Person person1 = new Person();

        //var -> can be used only for local variable declaration and with explicit initialization
        var person2 = new Person();
        Person person3;
        person3 = new Person();

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}
