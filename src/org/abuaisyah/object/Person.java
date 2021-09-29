package org.abuaisyah.object;


public class Person {
    String name;
    String address;
    final String nationality = "WNI";

    public Person() {
        this(null);
        System.out.println("~~> Constructor 1");
    };

    public Person(String paramName, String paramAddress) {
        System.out.println("~~> Constructor 3");
        this.name = paramName;
        this.address = paramAddress;
    }

    public Person(String paramName) {
        this(paramName, null);
        System.out.println("~~> Constructor 2");
    }

    public void sayHello(String friend) {
        System.out.println(String.format("Hi %s, My name is %s, I'm %s and I live in %s", friend, name, nationality, address));
    }
}