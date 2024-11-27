package org.dprat.projects.designpattern.decorator.implementation.beverage;

import org.dprat.projects.designpattern.decorator.AbstractBeverage;

public class ConcreteCoffeeBeverage extends AbstractBeverage {
    @Override
    public int cost() {
        return 2;
    }

    @Override
    public String description() {
        return "Coffee";
    }
}
