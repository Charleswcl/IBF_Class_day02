package sdf;

public class Porsche extends Car {

    private String turbo = "off";
    private int accelerate = 0;

    public Porsche() {
        super.setColour("red");
    }
    
    public Porsche(String colour, String registration) {
        setColour(colour);
        setRegistration(registration);
    }

    public String getTurbo() { return turbo; }

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
