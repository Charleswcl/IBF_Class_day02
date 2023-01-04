package day02.src;

public class Car {
    
    //members
    private String registration;
    private String Colour;
    private int year;
    private boolean started;

    // Constructor
    public Car() {
        // default constructor
        this.Colour = "white";
        }
    public Car(String)
    // Getters and Setters

    public String getRegistration() { return this.registration;}
    public void setRegistration(String r) { this.registration = r;}
   
    public String getColour() { return this.Colour; }
    public void setColour(String colour) { this.Colour = colour; }
    
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
   
    public boolean isStarted() { return started; }
    public void setStarted(boolean started) { this.started = started; }

    //methods
    public void start() {
        this.started = true;
    }


    
}
