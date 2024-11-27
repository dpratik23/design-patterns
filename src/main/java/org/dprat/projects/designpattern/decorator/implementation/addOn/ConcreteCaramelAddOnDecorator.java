package org.dprat.projects.designpattern.decorator.implementation.addOn;

import org.dprat.projects.designpattern.decorator.AbstractAddOnDecorator;
import org.dprat.projects.designpattern.decorator.AbstractBeverage;

public class ConcreteCaramelAddOnDecorator extends AbstractAddOnDecorator {

    public ConcreteCaramelAddOnDecorator(AbstractBeverage abstractBeverage) {
        super(abstractBeverage);
    }

    @Override
    public int cost() {
        return super.abstractBeverage.cost() + 2;
    }

    @Override
    public String description() {
        return abstractBeverage.description()+ " With Caramel";
    }
}
