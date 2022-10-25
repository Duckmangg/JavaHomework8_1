package ru.netology.stats.test;

import org.junit.jupiter.api.Assertions;
import ru.netology.stats.Conditioner;
import org.junit.jupiter.api.Test;
import ru.netology.stats.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StatsServiceTest {
    @Test
    void changeConditioner40Test() {
        Conditioner cond = new Conditioner();
        cond.setCurrentTemperature(40);
        int actual = cond.getCurrentTemperature();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void changeConditioner25Test() {
        Conditioner cond = new Conditioner();
        cond.setCurrentTemperature(25);
        int actual = cond.getCurrentTemperature();
        int expected = 25;

        assertEquals(expected, actual);
    }

    @Test
    void changeConditionerNegativeTest() {
        Conditioner cond = new Conditioner();
        cond.setCurrentTemperature(-8);
        int actual = cond.getCurrentTemperature();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void nextRadioStation3Test() {

        Radio rad = new Radio(16);
        int station = 3;

        rad.setStation(station);
        rad.nextStation();

        int actual = rad.getCurrentStation();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void nextRadioStation9Test() {

        Radio rad = new Radio();
        int station = 9;

        rad.setStation(station);
        rad.nextStation();

        int actual = rad.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void prevRadioStation0Test() {
        Radio rad = new Radio(100);
        int station = 0;
        rad.setStation(station);
        rad.prevStation();
        int actual = rad.getCurrentStation();
        int expected = 99;

        assertEquals(expected, actual);
    }

    @Test
    void prevRadioStation3Test() {
        Radio rad = new Radio();
        int station = 3;
        rad.setStation(station);
        rad.prevStation();
        int actual = rad.getCurrentStation();
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    void setRadioStationDefaultNegativeTest() {
        Radio rad = new Radio();
        int station = 0;
        rad.setStation(station);
        rad.setCurrentStation(10);
        int actual = rad.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void setRadioStation5Test() {
        Radio rad = new Radio();
        int station = 0;
        rad.setStation(station);
        rad.setCurrentStation(5);
        int actual = rad.getCurrentStation();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void setRadioStationNegativeTest() {
        Radio rad = new Radio(100);
        int station = 10;
        rad.setStation(station);
        rad.setCurrentStation(101);
        int actual = rad.getCurrentStation();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeRadioMaxTest() {
        Radio rad = new Radio();
        int volume = 100;
        rad.setVolume(volume);
        rad.increaseVolume();
        int actual = rad.getCurrentVolume();
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume5Test() {
        Radio rad = new Radio();
        int volume = 5;
        rad.setVolume(volume);
        rad.increaseVolume();
        int actual = rad.getCurrentVolume();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void reduceVolumeRadio0Test() {
        Radio rad = new Radio();
        int volume = 0;
        rad.setVolume(volume);
        rad.reduceVolume();
        int actual = rad.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void reduceVolume10Test() {
        Radio rad = new Radio();
        int volume = 10;
        rad.setVolume(volume);
        rad.reduceVolume();
        int actual = rad.getCurrentVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }
}