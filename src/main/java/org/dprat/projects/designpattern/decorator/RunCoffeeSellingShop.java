package org.dprat.projects.designpattern.decorator;

import org.dprat.projects.designpattern.decorator.implementation.addOn.ConcreteCaramelAddOnDecorator;
import org.dprat.projects.designpattern.decorator.implementation.addOn.ConcreteChocolateAddOnDecorator;
import org.dprat.projects.designpattern.decorator.implementation.beverage.ConcreteCoffeeBeverage;
import org.dprat.projects.designpattern.decorator.implementation.beverage.ConcreteEspressoBeverage;
import org.dprat.projects.designpattern.decorator.implementation.addOn.ConcreteMilkAddonDecorator;

public class RunCoffeeSellingShop {

    public static void main(String[] args) {

        AbstractBeverage drink = new ConcreteMilkAddonDecorator(new ConcreteCaramelAddOnDecorator(new ConcreteEspressoBeverage()));
        printDrinkDetails(drink);

        AbstractBeverage myDrink = new ConcreteMilkAddonDecorator(new ConcreteEspressoBeverage());
        printDrinkDetails(myDrink);

        AbstractBeverage coffeeWithChocolateAndCaramel =  new ConcreteChocolateAddOnDecorator(new ConcreteCaramelAddOnDecorator(new ConcreteCoffeeBeverage()));
        printDrinkDetails(coffeeWithChocolateAndCaramel);

    }

    private static void printDrinkDetails(AbstractBeverage drink) {
        System.out.println("Drink Description :"+ drink.description());
        System.out.println("Final Drink Cost :"+ drink.cost());
    }
}
