package org.dprat.projects.designpattern.singleton;

public class Singleton {

    // This instance variable holds the reference to the Singleton object
    private static Singleton instance;

    // created private constructor so that it can not be instantiated from outside this class
    private Singleton(){}

    public String getName() {
        return "Pratik";
    }

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }


}
