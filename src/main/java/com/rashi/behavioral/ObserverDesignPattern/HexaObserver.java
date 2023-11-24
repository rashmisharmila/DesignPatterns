package com.rashi.behavioral.ObserverDesignPattern;

public class HexaObserver extends Observer{
    public HexaObserver(Subject subject) {
        this.subject=subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hexadecimal value : "+Integer.toHexString(subject.getState()) );
    }
}
