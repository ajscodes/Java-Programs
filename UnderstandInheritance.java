class Vehicle{
    int noOfPassanger;
    int maxSpeed;
    int noOfGear = 5;

    public void display(){
        System.out.println("No. of Passangers = "+noOfPassanger);
        System.out.println("Max Speed of vehicle = "+maxSpeed);
        System.out.println("No. of Gear = "+noOfGear);
    }
}
class Car extends Vehicle{
    Double horsePower;
    int noOfAirbag;
}
public class UnderstandInheritance {
    public static void main(String[]args){
        Vehicle v;
        v = new Vehicle();
        System.out.println("--------Vehicle info---------"); 
        v.noOfPassanger = 3;
        v.maxSpeed = 120;
        v.display();

        Car c;
        c = new Car();
        System.out.println("-------Car Info--------");
        //c.noOfPassanger = 5;
        c.maxSpeed = 220;
        c.display();
    }
}