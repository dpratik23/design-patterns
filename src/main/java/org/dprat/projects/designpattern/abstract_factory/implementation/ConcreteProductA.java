package org.dprat.projects.designpattern.abstract_factory.implementation;

import org.dprat.projects.designpattern.abstract_factory.ProductA;

public class ConcreteProductA implements ProductA {
    @Override
    public String getProductAName() {
        return "Product A";
    }
}
