package ru.netology.radio.object;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio(6);
        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldntSetStationBiggerMax() {
        Radio radio = new Radio(6);
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldntSetStationLower0() {
        Radio radio = new Radio(6);
        radio.setCurrentStation(-10);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGoNext() {
        Radio radio = new Radio(6);
        radio.setCurrentStation(radio.next());

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGoNextTo0() {
        Radio radio = new Radio(6);
        radio.setCurrentStation(5);
        radio.setCurrentStation(radio.next());

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGoPrev() {
        Radio radio = new Radio(6);
        radio.setCurrentStation(5);
        radio.setCurrentStation(radio.prev());

        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGoPrevToMax() {
        Radio radio = new Radio(6);
        radio.setCurrentStation(radio.prev());

        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation2() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldntSetStationBiggerMax2() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldntSetStationLower02() {
        Radio radio = new Radio();
        radio.setCurrentStation(-10);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGoNext2() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.next());

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGoNextTo02() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setCurrentStation(radio.next());

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGoPrev2() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.setCurrentStation(radio.prev());

        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGoPrevToMax2() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.prev());

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldntSetVolumeBigger100() {
        Radio radio = new Radio(6);
        radio.setCurrentVolume(110);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldntSetVolumeLower0() {
        Radio radio = new Radio(6);
        radio.setCurrentVolume(-10);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDoPlus() {
        Radio radio = new Radio(6);
        radio.setCurrentVolume(radio.plus());

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldntGoPlusUPto100() {
        Radio radio = new Radio(6);
        radio.setCurrentVolume(100);
        radio.setCurrentVolume(radio.plus());

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDoMinus() {
        Radio radio = new Radio(6);
        radio.setCurrentVolume(5);
        radio.setCurrentVolume(radio.minus());

        int expected = 4;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldntDoMinusDownto0() {
        Radio radio = new Radio(6);
        radio.setCurrentVolume(radio.minus());

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
