package org.dprat.projects.designpattern.abstract_factory.implementation;

import org.dprat.projects.designpattern.abstract_factory.AbstractFactory;
import org.dprat.projects.designpattern.abstract_factory.ProductA;
import org.dprat.projects.designpattern.abstract_factory.ProductB;

public class ConcreteAbstractFactory implements AbstractFactory {
    @Override
    public ProductA getProductA() {
        return new ConcreteProductA();
    }

    @Override
    public ProductB getProductB() {
        return new ConcreteProductB();
    }
}
