package org.dprat.projects.designpattern.factory;

import org.dprat.projects.designpattern.factory.implementation.ProductAFactory;
import org.dprat.projects.designpattern.factory.implementation.ProductBFactory;

public class RunFactoryMethodImplementation {

    public static void main(String[] args) {

        ProductFactory productAFactory = new ProductAFactory();
        ProductFactory productBFactory = new ProductBFactory();
        Product productA = productAFactory.createProduct();
        Product productB = productBFactory.createProduct();


        System.out.println("created product "+productA.getProductName());
        System.out.println("created product "+productB.getProductName());


    }
}
