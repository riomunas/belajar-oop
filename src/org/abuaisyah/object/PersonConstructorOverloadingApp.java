package org.abuaisyah.object;

public class PersonConstructorOverloadingApp {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Rio");
        Person p3 = new Person("Rio", "Depok");

        p1.sayHello("Ali");
        p2.sayHello("Ali");
        p3.sayHello("Ali");
    }
}
