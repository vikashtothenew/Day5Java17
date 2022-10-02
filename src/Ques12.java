sealed interface Vehicle permits Car,Bike{
    int numberOfWheels();
}

record Car() implements Vehicle{
    @Override
    public int numberOfWheels() {
        return 4;
    }
}

record Bike() implements Vehicle{
    @Override
    public int numberOfWheels() {
        return 2;
    }
}



public class Ques12 {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.numberOfWheels());

        Bike bike = new Bike();
        System.out.println(bike.numberOfWheels());

    }

}