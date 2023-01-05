package src;

public class Porche extends Car {

    private String turbo = "off";
    private int accelerate = 0;

    public Porche() {
        super.setColour("red");
    }
    
    public Porche(String colour, String registration) {
        // colour is protected so all child class can access it
        this.colour = colour;
        setRegistration(registration);
    }

    public String getTurbo() { return turbo; }

    // I can no longer change the colour of the car
    // once it has been instatiated.
    @Override
    public void setColour(String c) {}
    
    public void accelerate() {
        this.accelerate++;
        if (this.accelerate > 4) {
            this.turbo = "on";
        }
    }

    public void decelerate() {
        this.accelerate--;
        if (this.accelerate <=4) {
            this.turbo = "off";
                    }
    }
}
