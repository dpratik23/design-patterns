package org.dprat.projects.designpattern.observer.implementation;

import org.dprat.projects.designpattern.observer.IObserver;

public class LocalWeatherObserver implements IObserver {

    public ObservableWeatherStation station;

    public LocalWeatherObserver(ObservableWeatherStation station){
        this.station = station;
    }

    @Override
    public void update() {
        System.out.println("temperature updated in Local WeatherStation.."+station.getTemperature());
    }
}
