package org.dprat.projects.designpattern.singleton;

public class RunSingletonImplementation {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();


        //Singleton singleton1 = new Singleton();

        System.out.println(singleton.getName());

    }
}
