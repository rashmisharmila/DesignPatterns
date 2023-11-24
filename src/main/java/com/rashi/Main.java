package com.rashi;

import com.rashi.behavioral.ObserverDesignPattern.BinaryObserver;
import com.rashi.behavioral.ObserverDesignPattern.HexaObserver;
import com.rashi.behavioral.ObserverDesignPattern.OctalObserver;
import com.rashi.behavioral.ObserverDesignPattern.Subject;
import com.rashi.behavioral.Strategy.Context;
import com.rashi.behavioral.Strategy.OparationMultiply;
import com.rashi.behavioral.Strategy.OperationAdd;
import com.rashi.behavioral.Strategy.OperationSubstract;
import com.rashi.creational.factoryDesignPatterns.Shape;
import com.rashi.creational.factoryDesignPatterns.ShapeFactory;
import com.rashi.creational.protoTypeDesignPatterns.ShapeCache;
import com.rashi.creational.singletonDesignPatterns.SingletonDesignPatternIMPL;
import com.rashi.structural.decoratorDesignPattern.Rectangle;
import com.rashi.structural.decoratorDesignPattern.RedShapeDecorate;
import com.rashi.structural.facadeDesignPattern.ShapeMaker;

public class Main {
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

//=============================================================================

        System.out.println("\n\n==========FACADE DESIGN PATTEN================");

        ShapeMaker shapeMaker=new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawSquare();
        shapeMaker.drawRectangle();

//==============================================================================

        System.out.println("\n\n==========DECORATOR DESIGN PATTEN================");

        com.rashi.structural.decoratorDesignPattern.Circle circle1= new com.rashi.structural.decoratorDesignPattern.Circle();
        circle1.draw();

        Rectangle rectangle=new Rectangle();
        rectangle.draw();

        RedShapeDecorate cirleredShapeDecorate=new RedShapeDecorate(new com.rashi.structural.decoratorDesignPattern.Circle());
        cirleredShapeDecorate.draw();

        RedShapeDecorate rectangleRedShapeDecorate=new RedShapeDecorate(new com.rashi.structural.decoratorDesignPattern.Rectangle());
        rectangleRedShapeDecorate.draw();

//=====================================================================================

        System.out.println("\n\n==========OBSERVER DESIGN PATTEN================");

        Subject subject=new Subject();

        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaObserver(subject);

        System.out.println("Value is 2");
        subject.setState(2);

        System.out.println("\nValue is 14");
        subject.setState(14);

        System.out.println("\nValue is 32");
        subject.setState(32);


//=====================================================================================

        System.out.println("\n\n==========STRATEGY DESIGN PATTEN================");

        Context contextAdd=new Context(new OperationAdd());
        System.out.println("Add :- " +contextAdd.executeOperation(64,36));

        Context contextSub=new Context(new OperationSubstract());
        System.out.println("Subtract  :- " +contextSub.executeOperation(64,36));

        Context contextMul=new Context(new OparationMultiply());
        System.out.println("Multiply  :- " +contextMul.executeOperation(64,36));

//=====================================================================================

        System.out.println("\n\n==========PROTOTYPE DESIGN PATTEN================");

        ShapeCache.loadCache();

        com.rashi.creational.protoTypeDesignPatterns.Shape clonedShape= (com.rashi.creational.protoTypeDesignPatterns.Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        com.rashi.creational.protoTypeDesignPatterns.Shape clonedShape2 = (com.rashi.creational.protoTypeDesignPatterns.Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        com.rashi.creational.protoTypeDesignPatterns.Shape clonedShape3 = (com.rashi.creational.protoTypeDesignPatterns.Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());

    }
}
