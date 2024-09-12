import java.util.Scanner;
public class CarTester{
    public Car addCar(){
        Scanner CarNameScanner = new Scanner(System.in);
        System.out.println("Please enter the car's name: ");
        String carName = CarNameScanner.nextLine();
        
        Scanner CarMilesScanner = new Scanner(System.in);
        System.out.println("Please enter cars miles: ");
        int carMiles = CarMilesScanner.nextInt();
        
        Scanner CarGallonsScanner = new Scanner(System.in);
        System.out.println("Please enter cars gallons: ");
        int carGallons = CarGallonsScanner.nextInt();
        
        Car newCar = new Car(carName, carMiles, carGallons);
        return newCar;
    }
    
    public static void main(String[] args){
        CarTester testCar = new CarTester();
        Car testCar1 = testCar.addCar();
        System.out.println(testCar1.toString());
        
        Car testCar2 = testCar.addCar();
        System.out.println(testCar2.toString());
    }
}
