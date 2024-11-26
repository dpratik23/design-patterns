package org.dprat.projects.designpattern.observer.implementation;

import org.dprat.projects.designpattern.observer.IObserver;

public class InternationalWeatherStation implements IObserver {

    public ObservableWeatherStation station;

    public InternationalWeatherStation(ObservableWeatherStation station){
        this.station = station;
    }

    @Override
    public void update() {
        System.out.println("Temperature updated in International Weather Station.."+station.getTemperature());
    }
}
