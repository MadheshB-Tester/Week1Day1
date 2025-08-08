package week1.day1;

public class Car {

    public void applyBreak() {
        System.out.println("Applied break");
    }

    public void soundHorn() {
        System.out.println("Sound horn");
    }

    public static void main(String[] args) {
        
        Car myCar = new Car();
        
        myCar.applyBreak();
        myCar.soundHorn();
        
        
        System.out.println("Bike object created successfully");
    }
}
