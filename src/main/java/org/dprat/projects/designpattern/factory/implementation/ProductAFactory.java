package org.dprat.projects.designpattern.factory.implementation;

import org.dprat.projects.designpattern.factory.Product;
import org.dprat.projects.designpattern.factory.ProductFactory;

public class ProductAFactory extends ProductFactory {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
