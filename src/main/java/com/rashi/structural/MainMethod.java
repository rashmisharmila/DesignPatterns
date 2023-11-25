package com.rashi.structural;

import com.rashi.structural.decoratorDesignPattern.Rectangle;
import com.rashi.structural.decoratorDesignPattern.RedShapeDecorate;
import com.rashi.structural.facadeDesignPattern.ShapeMaker;

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


    }
}
