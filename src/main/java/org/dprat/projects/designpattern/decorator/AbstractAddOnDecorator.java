package org.dprat.projects.designpattern.decorator;

public abstract class AbstractAddOnDecorator extends AbstractBeverage{

    protected AbstractBeverage abstractBeverage;

    public AbstractAddOnDecorator(AbstractBeverage abstractBeverage) {
        this.abstractBeverage = abstractBeverage;
    }

    public abstract int cost();
    public abstract String description();
}
