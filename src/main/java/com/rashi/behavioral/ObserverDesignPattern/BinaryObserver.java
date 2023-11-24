package com.rashi.behavioral.ObserverDesignPattern;

public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject) {
        this.subject=subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary Value : "+ Integer.toBinaryString(subject.getState()));
    }
}
