package com.company;

public class Car {
    private int id;
    private int numberAuto;

    public Car(int id, int numberAuto) {
        this.id = id;
        this.numberAuto = numberAuto;
    }

    public int getId() {
        return id;
    }

    public int getNumberAuto() {
        return numberAuto;
    }

    @Override
    public String toString() {
        return "Car " +
                " \n id " + id +
                "  \n numberAuto " + numberAuto +
                ' ';
    }
}

