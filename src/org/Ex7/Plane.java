package org.Ex7;

public class Plane {

    public static class Wing{
        private double wingWeight;

        public Wing(double wingWeight) {
            this.wingWeight = wingWeight;
        }

        public double getWingWeight() {
            return wingWeight;
        }

        public void setWingWeight(double wingWeight) {
            this.wingWeight = wingWeight;
        }
        public void showWingWeight(){
            System.out.println("Вес крыла самолета составляет " + wingWeight + " кг" );
        }

    }

    public static void main(String[] args) {

        Plane.Wing wing1 = new Plane.Wing(760.1);
        Plane.Wing wing2 = new Wing(970.5);
        wing1.showWingWeight();
        wing2.showWingWeight();
    }

}
