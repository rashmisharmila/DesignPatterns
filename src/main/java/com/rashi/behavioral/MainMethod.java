package com.rashi.behavioral;

import com.rashi.behavioral.ObserverDesignPattern.BinaryObserver;
import com.rashi.behavioral.ObserverDesignPattern.HexaObserver;
import com.rashi.behavioral.ObserverDesignPattern.OctalObserver;
import com.rashi.behavioral.ObserverDesignPattern.Subject;
import com.rashi.behavioral.Strategy.Context;
import com.rashi.behavioral.Strategy.OparationMultiply;
import com.rashi.behavioral.Strategy.OperationAdd;
import com.rashi.behavioral.Strategy.OperationSubstract;

public class MainMethod {
    public static void main(String[] args) {

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

    }
}
