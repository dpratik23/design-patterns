package org.dprat.projects.designpattern.decorator.implementation.addOn;

import org.dprat.projects.designpattern.decorator.AbstractAddOnDecorator;
import org.dprat.projects.designpattern.decorator.AbstractBeverage;

public class ConcreteChocolateAddOnDecorator extends AbstractAddOnDecorator {

    public ConcreteChocolateAddOnDecorator(AbstractBeverage abstractBeverage) {
        super(abstractBeverage);
    }

    @Override
    public int cost() {
        return abstractBeverage.cost() + 5;
    }

    @Override
    public String description() {
        return abstractBeverage.description()+" With Chocolate";
    }
}
