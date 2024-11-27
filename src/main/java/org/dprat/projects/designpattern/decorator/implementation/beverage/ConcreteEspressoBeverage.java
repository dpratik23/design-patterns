package org.dprat.projects.designpattern.decorator.implementation.beverage;

import org.dprat.projects.designpattern.decorator.AbstractBeverage;

public class ConcreteEspressoBeverage extends AbstractBeverage {
    @Override
    public int cost() {
        return 1;
    }

    @Override
    public String description() {
        return "Espresso";
    }
}
