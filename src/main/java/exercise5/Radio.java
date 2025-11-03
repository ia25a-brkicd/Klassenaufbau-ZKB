package exercise5;

public class Radio {
    private boolean isOn;
    private int volume;
    private double frequency;
    public Radio(boolean isOn, int volume, double frequency) {
        this.isOn = isOn;
        this.volume = volume;
        this.frequency = frequency;
    }

    public void On() {
        isOn = true;
    }
    public void Off() {
        isOn = false;
    }
    public void increaseVolume() {
        volume++;
    }
    public void decreaseVolume() {
        volume--;
    }

    public void selectChannel(double frequency){
        this.frequency = frequency;
    }

    public String toString(){
        return isOn ? "ON" : "OFF";
    }
}
