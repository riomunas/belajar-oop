package org.abuaisyah.object;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void sayHello(String friend) {
        System.out.println(String.format("Hi. %s, My name %s", friend, this.name));
    }
}

class Manager extends Employee{

    Manager(String name) {
        super(name);
    }

    void sayHello(String friend) {
        super.sayHello(friend);
        System.out.println(String.format("Hi. %s, My name %s and I'm a manager", friend, this.name));
    }
}

public class ManagerInheritanceApp {
    public static void main(String[] args) {
        System.out.println("Parent ------------------------------------");
        Employee e = new Employee("Rio");
        e.sayHello("Zaid");
        System.out.println("Child -------------------------------------");
        Manager m = new Manager("Rio");
        m.sayHello("Zaid");
    }
}
