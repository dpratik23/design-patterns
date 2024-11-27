package org.dprat.projects.designpattern.abstract_factory;

import org.dprat.projects.designpattern.abstract_factory.implementation.ConcreteAbstractFactory;

public class RunAbstractFactoryImplementation {

    public static void main(String[] args) {

        ConcreteAbstractFactory concreteAbstractFactory = new ConcreteAbstractFactory();

        ProductA productA = concreteAbstractFactory.getProductA();
        ProductB productB = concreteAbstractFactory.getProductB();

        System.out.println("Products from abstract factory :\n"+productA.getProductAName()+" \n"+productB.getProductBName());

    }
}
