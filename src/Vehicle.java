import java.beans.VetoableChangeListener;

class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;
}

class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan;
        minivan = new Vehicle();
        int range;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        range = minivan.fuelcap * minivan.mpg;
        System.out.println("range of minivan is " + range);

        Vehicle car1 = new Vehicle();
        Vehicle car2 = car1;

        car1.mpg = 26;

        System.out.println(car1.mpg);
        System.out.println(car2.mpg);


    }
}
