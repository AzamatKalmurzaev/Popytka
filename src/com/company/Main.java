package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main{

    public static void main(String[] args) {



        HashMap<Car,InformCar> map = new HashMap<>();
        map.put(new Car(1,995),new InformCar(2019,"Bugatti",1000000,"Black"));
        System.out.println(map);



    }
}
