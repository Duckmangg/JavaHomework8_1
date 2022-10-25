package ru.netology.stats;

public class Radio {
    public int currentStation;
    public int currentVolume;

    public int maxVolume = 100;
    public int minVolume = 0;
    public int amountStation = 10;

    public Radio(int newAmountStation) {
        amountStation = newAmountStation;
    }

    public Radio() {

    }

    public void setStation(int station) {
        currentStation = station;
    }

    public void setVolume(int volume) {
        currentVolume = volume;
    }

    public void nextStation() {
        if (currentStation < amountStation - 2) {
            currentStation = currentStation + 1;
            return;
        }
        currentStation = 0;
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
            return;
        }
        currentStation = amountStation - 1;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > amountStation - 1) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }

    }

    public void reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}
