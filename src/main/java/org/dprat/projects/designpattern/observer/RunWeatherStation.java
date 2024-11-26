package org.dprat.projects.designpattern.observer;

import org.dprat.projects.designpattern.observer.implementation.InternationalWeatherStation;
import org.dprat.projects.designpattern.observer.implementation.LocalWeatherObserver;
import org.dprat.projects.designpattern.observer.implementation.ObservableWeatherStation;

public class RunWeatherStation {

    public static void main(String[] args) {

        //Create concrete observable
        ObservableWeatherStation station = new ObservableWeatherStation();

        //Creating concrete observers
        LocalWeatherObserver localWeatherObserver = new LocalWeatherObserver(station);
        InternationalWeatherStation internationalWeatherStation = new InternationalWeatherStation(station);

        //Adding concrete observers to observable
        station.add(localWeatherObserver);
        station.add(internationalWeatherStation);

        // state change in Observable will notify all Observers
        station.setTemperature(5);

        // removing observer..
        station.remove(localWeatherObserver);

        // Changing state again
        station.setTemperature(3);


    }

}
