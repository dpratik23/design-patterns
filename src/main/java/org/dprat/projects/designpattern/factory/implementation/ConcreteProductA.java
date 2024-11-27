package org.dprat.projects.designpattern.factory.implementation;

import org.dprat.projects.designpattern.factory.Product;

public class ConcreteProductA extends Product {
    @Override
    public String getProductName() {
        return "Product A";
    }
}
