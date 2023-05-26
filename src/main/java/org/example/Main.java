package org.example;

public class Main {


    public static void main(String[] args) {

        PhoneBuilder builder = new PhoneBuilder();
        builder.setOs("Android");
        builder.setProcessor("Snapdragon");
        builder.setBattery(3000);
        builder.setScreensize(6.5);
        builder.setCamera(33);

        Phone p = builder.getPhone();
        System.out.println(p);

    }
}