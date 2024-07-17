// Datei: App.java
package com.cc.java;

public class App {

    public static void main(String[] args) {
        Mitarbeiter mitarbeiter1 = new Mitarbeiter("Schneider", "Anna", "Manager", 2015);
        Mitarbeiter mitarbeiter2 = new Mitarbeiter("Bauer", "Hans", "Developer", 2018);
        Mitarbeiter mitarbeiter3 = new Mitarbeiter("Martinelli", "Silvia", "CEO", 2020);

        output(mitarbeiter1.getInfo("familyname")); // Schneider
        output(mitarbeiter1.getInfo("firstname"));  // Anna
        output(mitarbeiter1.getInfo("role"));       // Manager
        output(mitarbeiter1.getInfo("yearofentry"));// 2015

        System.out.println("-----------------");

        output(mitarbeiter2.getInfo("familyname")); // Bauer
        output(mitarbeiter2.getInfo("firstname"));  // Hans
        output(mitarbeiter2.getInfo("role"));       // Developer
        output(mitarbeiter2.getInfo("yearofentry"));// 2018

        System.out.println("-----------------");

        output(mitarbeiter3.getInfo("familyname")); // Martinelli
        output(mitarbeiter3.getInfo("firstname"));  // Silvia
        output(mitarbeiter3.getInfo("role"));       // CEO
        output(mitarbeiter3.getInfo("yearofentry"));// 2020
    }

    private static void output(String outStr) {
        System.out.println(outStr);
    }
}
