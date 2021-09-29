package org.abuaisyah.object;


public class Person {
    String name;
    String addres;
    final String nationality = "WNI";

    public void sayHello(String friend) {
        System.out.println(String.format("Hi %s, My name is %s", friend, name));
    }
}