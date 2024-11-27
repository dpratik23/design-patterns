package org.dprat.projects.designpattern.abstract_factory.implementation;

import org.dprat.projects.designpattern.abstract_factory.ProductB;

public class ConcreteProductB implements ProductB {
    @Override
    public String getProductBName() {
        return "Product B";
    }
}
