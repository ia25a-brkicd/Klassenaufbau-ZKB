package exercise5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class  RadioTest {



    @Test
    void on() {
        Radio radio = new Radio(true,5,99.5);
        radio.On();
        assertFalse(radio.toString().contains("isON = true"));
    }

    @Test
    void off() {
        Radio radio = new Radio(false,5,99.5);
        radio.Off();
        assertFalse(radio.toString().contains("isOFF = true"));
    }

    @Test
    void increaseVolume() {
    }

    @Test
    void decreaseVolume() {
    }

    @Test
    void selectChannel() {
    }

    @Test
    void testToString() {
    }
}