package com.rashi.creational;

import com.rashi.creational.BuilderDesignPattern.Meal;
import com.rashi.creational.BuilderDesignPattern.MealBuilder;
import com.rashi.creational.factoryDesignPatterns.Shape;
import com.rashi.creational.factoryDesignPatterns.ShapeFactory;
import com.rashi.creational.protoTypeDesignPatterns.ShapeCache;
import com.rashi.creational.singletonDesignPatterns.SingletonDesignPatternIMPL;

public class MainMethod {
    public static void main(String[] args) {
        System.out.println("\n\n==========SINGLETON DESIGN PATTEN================");

        SingletonDesignPatternIMPL singletonDesignPatternIMPL1=SingletonDesignPatternIMPL.getInstance();
        SingletonDesignPatternIMPL singletonDesignPatternIMPL2=SingletonDesignPatternIMPL.getInstance();
        System.out.println(singletonDesignPatternIMPL1);
        System.out.println(singletonDesignPatternIMPL2);

        //com.rashi.creational.singletonDesignPatterns.SingletonDesignPatternIMPL@1b28cdfa
        //com.rashi.creational.singletonDesignPatterns.SingletonDesignPatternIMPL@1b28cdfa
//============================================================================
        System.out.println("\n\n==========FACTORY DESIGN PATTEN================");

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

//============================================================================

        System.out.println("\n\n==========PROTOTYPE DESIGN PATTEN================");

        ShapeCache.loadCache();

        com.rashi.creational.protoTypeDesignPatterns.Shape clonedShape= (com.rashi.creational.protoTypeDesignPatterns.Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        com.rashi.creational.protoTypeDesignPatterns.Shape clonedShape2 = (com.rashi.creational.protoTypeDesignPatterns.Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        com.rashi.creational.protoTypeDesignPatterns.Shape clonedShape3 = (com.rashi.creational.protoTypeDesignPatterns.Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());

//============================================================================

        System.out.println("\n\n==========BUILDER DESIGN PATTEN================");

        MealBuilder mealBuilder=new MealBuilder();
        System.out.println("Veg Meal");
        Meal vegMeal=mealBuilder.prepareVegMeal();
        vegMeal.showItems();

    }
}
