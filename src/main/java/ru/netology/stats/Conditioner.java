package ru.netology.stats;

public class Conditioner {
    public  int currentTemperature;
    public void setCurrentTemperature(int newCurrentTemperature){
        if (newCurrentTemperature < 0){
            return;
        }
        if (newCurrentTemperature > 30){
            return;
        }
        currentTemperature = newCurrentTemperature;
    }
    public int getCurrentTemperature(){
        return currentTemperature;
    }
}
