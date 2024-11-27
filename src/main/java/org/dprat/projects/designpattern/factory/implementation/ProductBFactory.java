package org.dprat.projects.designpattern.factory.implementation;

import org.dprat.projects.designpattern.factory.Product;
import org.dprat.projects.designpattern.factory.ProductFactory;

public class ProductBFactory extends ProductFactory {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
