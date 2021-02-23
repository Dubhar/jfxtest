package de.soptim.spielwiese;

public class Main {
    public static void main(String[] args) {
        var lombokTest = new Lombok("Hello World!");

        System.out.println(lombokTest.getMyString());
    }
}
