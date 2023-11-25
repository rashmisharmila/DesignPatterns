package com.rashi.structural;

import com.rashi.structural.AdapterDesignPattern.BirdAdapter;
import com.rashi.structural.AdapterDesignPattern.PlasticToyDuck;
import com.rashi.structural.AdapterDesignPattern.Sparrow;
import com.rashi.structural.AdapterDesignPattern.ToyDuck;
import com.rashi.structural.decoratorDesignPattern.Rectangle;
import com.rashi.structural.decoratorDesignPattern.RedShapeDecorate;
import com.rashi.structural.facadeDesignPattern.ShapeMaker;
import com.rashi.structural.proxyDesignPattern.Image;
import com.rashi.structural.proxyDesignPattern.ProxyImage;

public class MainMethod {
    public static void main(String[] args) {

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

//==============================================================================

        System.out.println("\n\n==========PROXY DESIGN PATTEN================");
        Image image=new ProxyImage("test.jpg");

        image.display();
        System.out.println(" ");

        image.display();

//==============================================================================

        System.out.println("\n\n==========ADAPTER DESIGN PATTEN================");
        Sparrow sparrow=new Sparrow();
        ToyDuck toyDuck=new PlasticToyDuck();

        ToyDuck birdAdapter=new BirdAdapter(sparrow);

        System.out.println("Sparrow...");
        sparrow.fly();
        sparrow.makeSound();

        System.out.println("\nToyDuck...");
        toyDuck.squeak();

        System.out.println("\nBirdAdapter...");
        birdAdapter.squeak();
    }
}
