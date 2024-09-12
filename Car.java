public class Car{
    private String carName;
    private double milesDriven;
    private double gallonsUsed;
    
    public Car(){
        carName = "";
        milesDriven = 0;
        gallonsUsed = 0;
    }
    
    public Car(String newName, double newMiles, double newGallons){
        carName = newName;
        milesDriven = newMiles;
        gallonsUsed = newGallons;
    }
    
    public String getCarName(){
        return carName;
    }
    
    public double getMilesDriven(){
        return milesDriven;
    }
    
    public double getGallonsUsed(){
        return gallonsUsed;
    }
    
    public void setCarName(String newName){
        carName = newName;
    }
    
    public void setMilesDriven(double newMiles){
        milesDriven = newMiles;
    }
    
    public void setGallonsUsed(double newGallons){
        gallonsUsed = newGallons;
    }
    
    public double calculateAverage(){
        double calAve = milesDriven / gallonsUsed;
        return Math.round(calAve * 10.0) / 10.0;
    }
    
    public String toString(){
        String toString = carName + " averaged " + calculateAverage() + " m/g";
        return toString;
    } 
}
