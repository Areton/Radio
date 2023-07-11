package ru.netology.radio.object;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStation () {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        int expected = 5;
        int actual= radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldntSetStationBigger () {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int expected = 0;
        int actual= radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldntSetStationLower () {
        Radio radio = new Radio();
        radio.setCurrentStation(-10);

        int expected = 0;
        int actual= radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldGoNext () {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.next());

        int expected = 1;
        int actual= radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldGoNextTo0 () {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setCurrentStation(radio.next());

        int expected = 0;
        int actual= radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldGoPrev () {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.setCurrentStation(radio.prev());

        int expected = 4;
        int actual= radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldGoPrevTo9 () {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.prev());

        int expected = 9;
        int actual= radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDoPlus () {
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.plus());

        int expected = 1;
        int actual= radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldntGoPlusUPto10 () {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.setCurrentVolume(radio.plus());

        int expected = 10;
        int actual= radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDoMinus () {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.setCurrentVolume(radio.minus());

        int expected = 4;
        int actual= radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldntDoMinusDownto0 () {
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.minus());

        int expected = 0;
        int actual= radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
