package com.company;

public class InformCar {
    private int yerOfBirth;
    private String model;
    private int price;
    private String color;

    public InformCar(int yerOfBirth, String model, int price, String color) {
        this.yerOfBirth = yerOfBirth;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public int getYerOfBirth() {
        return yerOfBirth;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return " \n InformCar  " +
                "  \n yerOfBirth " + yerOfBirth  +
                " \n model  " + model + '\'' +
                "  \n price " + price +
                "\n  color " + color + '\'' +
                ' ';
    }
}


