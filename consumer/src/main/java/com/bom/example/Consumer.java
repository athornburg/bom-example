package com.bom.example;

public class Consumer {

    public String works() {
        return new ClassA().works() + " " + new ClassB().works() + " " + new ClassA().coolNewFeature();
    }
}
