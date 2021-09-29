package org.abuaisyah.object;

public class PersonPropertiesApp {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Rio";
        p.addres = "Depok";

        //karena dikasi final jadi tidak bisa diedit
//        p.nationality = "WNI";

        System.out.println(p.name);
        System.out.println(p.addres);
        System.out.println(p.nationality);
    }
}
