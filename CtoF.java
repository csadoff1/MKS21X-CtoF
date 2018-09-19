public class CtoF {
  
public static double celsiusToFahrenheit (double n) {
  return (n * (9.0/5.0) + 32.0);
}

public static double fahrenheitToCelsius (double n) {
  return ((n - 32.0) * (5.0/9.0));
}

// tests
public static void main(String[] args) {
System.out.println(celsiusToFahrenheit (0.0));
System.out.println(celsiusToFahrenheit (100.0));
System.out.println(celsiusToFahrenheit (-30.0));
System.out.println(celsiusToFahrenheit (26.0));
System.out.println(celsiusToFahrenheit (-1.0));
System.out.println(fahrenheitToCelsius (0.0));
System.out.println(fahrenheitToCelsius (100.0));
System.out.println(fahrenheitToCelsius (-30.0));
System.out.println(fahrenheitToCelsius (26.0));
System.out.println(fahrenheitToCelsius (-1.0));
}
}

