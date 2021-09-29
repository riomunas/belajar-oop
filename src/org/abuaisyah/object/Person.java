package org.abuaisyah.object;


public class Person {
    String name;
    String address;
    final String nationality = "WNI";

    public Person() {};

    public Person(String paramName, String paramAddress) {
        name = paramName;
        address = paramAddress;
    }

    public void sayHello(String friend) {
        System.out.println(String.format("Hi %s, My name is %s, I'm %s and I live in %s", friend, name, nationality, address));
    }
}