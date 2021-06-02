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
