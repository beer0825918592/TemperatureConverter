package com.example.temperatureconverter.model;

public class Temperature {
    private float temperature;
    public Temperature() { }

    public Temperature(float temperature) {
        this.temperature = temperature;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
    public float calCtoF(){
        float f=(temperature*9/5)+32;

        return f;
    }
    public float calFtoC(){
        float c=(((temperature-32)*5)/9);

        return c;
    }
}
