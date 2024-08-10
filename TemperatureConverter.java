import java.util.Scanner;
public class TemperatureConverter{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a temperature : ");
            double temperature = sc.nextDouble();
            
            System.out.println("Enter the unit (C for Celsius, F for Fahrenheit, K for Kelvin) : ");
            String unit = sc.next().toLowerCase();
            switch(unit){
                case "c" -> {
                    System.out.println("Celsius to Fahrenheit : "+((temperature*9/5)+32)+"°F");
                    System.out.println("Celsius to Kelvin : "+(temperature+273.15)+"K");
                }
                case "f" -> {
                    System.out.println("Fahrenheit to Celsius : "+((temperature-32)*5/9)+"°C");
                    System.out.println("Fahrenheit to Kelvin : "+((temperature-32)*5/9+273.15)+"K");
                }
                case "k" -> {
                    System.out.println("Kelvin to Celsius : "+(temperature-273.15)+"°C");
                    System.out.println("Kelvin to Fahrenheit : "+((temperature-273.15)*9/5+32)+"°F");
                }
                default -> System.out.println("Invalid unit");
            }
        }
    }
}