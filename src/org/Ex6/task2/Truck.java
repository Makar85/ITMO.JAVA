package org.Ex6.task2;

import java.util.Set;

public class Truck extends Car{
    public int wheelsQty;
    public int maxWeight;

    public Truck(int weight, String model, char color, float speed, int wheelsQty, int maxWeight) {
        super(weight, model, color, speed);
        this.wheelsQty = wheelsQty;
        this.maxWeight = maxWeight;
    }

    public Truck() {
    }

    public void newWheels(int wheelsQty){
        if (this.wheelsQty !=0){
            this.wheelsQty = wheelsQty;
            System.out.println("Колличество колёс грузовика" + this.model + "изменено на: " + this.wheelsQty);
        }

    }



}
