package u2pp;

/**
 * This class represents a car‘s gas intake and consumption
 * 
 * @author Andrew Das
 */
 
public class Car {
    private double gas; //The amount of gas in the tank
    private double mpg; //The fuel efficiency of the car in miles per gallon
    private String make; //The make of the car
    private String model; //The model of the car
    
    /**
     * @param anEfficiency - the efficiency of the Car
     * @param aMake - the make of the Car
     * @param aModel - the model of the Car
     */ 
    public Car(double anEfficiency, String aMake, String aModel) {
       	mpg = anEfficiency;
       	make = aMake;
       	model = aModel;
    }
    
    /**
     * Changing anEfficiency to equaling mpg.
     * @param amount - the amount of gas to add to the tank
     */
    public void addGas (double amount) {
        double addGas = 0;
        double gas =+ addGas;
        
    }
    
    /**
     * creating addGas variable to add gas to original gas tank
     * @param distance - the distance that the car has driven
     */
    public void drive (double distance) {
    	double distances = 0;
    	distance =- (mpg *- gas);
    	//distance = distances - addGas;
    	
        
    }
    
    /**
     * @return The amount of gas currently in the tank
     */
    public double getGasInTank() {
    	double getGasInTank = gas;
        System.out.println(getGasInTank());
        return 0.0;
        //return double distance;
    }
    
    /**
     * @return The make and model of the car
     */
     public String getMakeAndModel() {
       return make + " " + model;
     }
    
    /**
     * @return The efficiency of the car. Used for testing purposes
     */
    public double getMpg() {
        return mpg;
    }
}