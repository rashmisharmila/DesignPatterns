package com.rashi.creational.singletonDesignPatterns;

public class SingletonDesignPatternIMPL {

    private  static SingletonDesignPatternIMPL instance=new SingletonDesignPatternIMPL();

    public SingletonDesignPatternIMPL() {
    }

    public static SingletonDesignPatternIMPL getInstance() {
        System.out.println("Hello Singleton");
        return instance;
    }


}
