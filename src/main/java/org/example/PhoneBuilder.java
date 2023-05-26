package org.example;

public class PhoneBuilder {

    public String os;
    public String processor;
    public int camera;

    public int battery;
    public double screensize;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setCamera(int camera) {
        this.camera = camera;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public PhoneBuilder setScreensize(double screensize) {
        this.screensize = screensize;
        return this;
    }


    public Phone getPhone(){
        return new Phone(os,processor,camera,battery,screensize);
    }

}
