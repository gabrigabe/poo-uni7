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