public class Button {
    private Lamp lamp;
    private boolean state;
}

public class State extends Button {
    public Button(Lamp lamp) {
        this.lamp = lamp;
        }
        
         public void toggle() {
        state = !state;
        boolean buttonOn = state;
        if (buttonOn) {
        lamp.turnOn();
        } else {
        lamp.turnOff();
        }
        }
    
}

public class Lamp extends State{
    private int color;
    
     public void turnOn() {
    System.out.println("Lamp turned on");
    }
    
     public void turnOff() {
    System.out.println("Lamp turned off");
    }
    
     public int getColor() {
    return color;
    }
    
     public void setColor(int color) {
    this.color = color;
    }
} 

    
    