package org.example;

public class Phone {

    public String os;
    public String processor;
    public int camera;
    public int battery;
    public double screensize;

    public Phone(String os, String processor, int camera, int battery, double screensize) {
        this.os = os;
        this.processor = processor;
        this.camera = camera;
        this.battery = battery;
        this.screensize = screensize;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", processor='" + processor + '\'' +
                ", camera=" + camera +
                ", battery=" + battery +
                ", screensize=" + screensize +
                '}';
    }
}
