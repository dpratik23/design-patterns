package org.dprat.projects.designpattern.observer.implementation;

import org.dprat.projects.designpattern.observer.IObservable;
import org.dprat.projects.designpattern.observer.IObserver;

import java.util.ArrayList;
import java.util.List;

public class ObservableWeatherStation implements IObservable {

    List<IObserver> observers;

    int temperature;

    @Override
    public void add(IObserver iObserver) {
        if(observers==null){
            observers = new ArrayList<>();
        }
        observers.add(iObserver);
        System.out.println("Observer added..");
    }

    @Override
    public void remove(IObserver iObserver) {
        if(observers !=null) {
            observers.remove(iObserver);
            System.out.println("Observer removed..");
        }else{
            System.out.println("No Observers found..");
        }

    }

    @Override
    public void notifyObservers() {
        observers.forEach(IObserver::update);
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        System.out.println("Temperature updated in Main Weather Station.."+temperature);
        this.temperature = temperature;
        notifyObservers();
    }
}
