package org.dprat.projects.designpattern.decorator.implementation.addOn;

import org.dprat.projects.designpattern.decorator.AbstractAddOnDecorator;
import org.dprat.projects.designpattern.decorator.AbstractBeverage;

public class ConcreteMilkAddonDecorator extends AbstractAddOnDecorator {


    public ConcreteMilkAddonDecorator(AbstractBeverage abstractBeverage) {
        super(abstractBeverage);
    }

    @Override
    public int cost() {
        return abstractBeverage.cost() + 3;
    }

    @Override
    public String description() {
        return abstractBeverage.description() + " With Milk";
    }
}
