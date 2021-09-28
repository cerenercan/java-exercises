package com.company.oop.inheritance.challenge;

public class Car extends Vehicle{

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Current gear changed to: " +currentGear);
    }

    public void changeVelocity(int speed, int direction){

        move(speed, direction);
        System.out.println("Car.changeVelocity() \n" +
                "New velocity is: " +speed+ "\n " +
                "New direction is: " +direction);

    }
}
