package ru.netology.stats;

public class Radio {
    public int currentStation;
    public int currentVolume;

    public void setStation(int station) {
        currentStation = station;
    }

    public void setVolume(int volume) {
        currentVolume = volume;
    }

    public void nextStation() {
        if (currentStation < 9) {
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
        currentStation = 9;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }

    }

    public void reduceVolume() {
        if (currentVolume > 0) {
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
