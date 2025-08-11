package labsession5;

public class Temperature {
	// Private field (encapsulation)
    private double celsius;

    //  Setter with validation (no temp below absolute zero)
    public void setTemperature(double celsius) {
        if (celsius >= -273.15) {
            this.celsius = celsius;
        } else {
            System.out.println("Invalid temperature! Celsius cannot be below -273.15.");
            this.celsius = -273.15; // Set to absolute zero if invalid
        }
    }

    //  Getter
    public double getCelsius() {
        return celsius;
    }

    // Convert to Fahrenheit
    public double toFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    //  Convert to Kelvin
    public double toKelvin() {
        return celsius + 273.15;
    }

    //  Main method to test
    public static void main(String[] args) {
        Temperature temp1 = new Temperature();

        temp1.setTemperature(25);
        System.out.println("Celsius   : " + temp1.getCelsius());
        System.out.println("Fahrenheit: " + temp1.toFahrenheit());
        System.out.println("Kelvin    : " + temp1.toKelvin());

        System.out.println("-----------------------------");

        Temperature temp2 = new Temperature();
        temp2.setTemperature(-500); // Invalid input
        System.out.println("Celsius   : " + temp2.getCelsius());
        System.out.println("Fahrenheit: " + temp2.toFahrenheit());
        System.out.println("Kelvin    : " + temp2.toKelvin());
    }
}
		
	

	
