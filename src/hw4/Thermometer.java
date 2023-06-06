package hw4;

public class Thermometer {

    double temperatureC;
    double temperatureF;


    private double convertToBigNum (double num){
        return  Math.ceil(num);
    }

    public double convertToFahrenheit(){
        double contToFahrenheit = (temperatureC * 9/5) + 32;
        return Math.ceil(contToFahrenheit);
    }

    public double convertToCelsius (){
        double convertToCelsius = (temperatureF - 32) * 5/9;
        return Math.ceil(convertToCelsius);
    }

    public Thermometer(double convToFahrenheit, double convToCeil) {
        this.temperatureC = convToFahrenheit;
        this.temperatureF = convToCeil;
    }
}
