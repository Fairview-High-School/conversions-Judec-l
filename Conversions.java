import java.util.Scanner;
/**
 * Unit Conversion App.
 *
 * @author Jude Chen
 * @version 8/19/2024
 */
public class Conversions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Feet to Meters");
        System.out.println("4. Meters to Feet");
        System.out.println("5. Ounces to Milliliters");
        System.out.println("6. Milliliters to Ounces");
        System.out.println("7. Pounds to Grams");
        System.out.println("8. Grams to Pounds");
        System.out.println("9. Liters to Ounces");
        System.out.println("10. Ounces to Liters");
        
        int selection = keyboard.nextInt();
        keyboard.nextLine();
        
        if (selection == 1) //Celcius to Fahrenheit
        {
            System.out.println("Enter Celcius: ");
            double celcius = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = celcius * (9.0 / 5.0) + 32;
            System.out.println(celcius + " degrees Celcius is " + fahrenheit + " degrees Fahrenheit.");
        }
        if (selection == 2) //Fahrenheit to Celcius
        {
            System.out.println("Enter Fahrenheit: ");
            double fahrenheit = keyboard.nextDouble();
            keyboard.nextLine();
            double celcius = (fahrenheit - 32) / 1.8;
            System.out.println(fahrenheit + " degrees Fahrenheit is " + celcius + " degrees Celcius.");
        }
        if (selection == 3) //Feet to Meters
        {
            System.out.println("Enter Feet: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double meters = (feet * 0.3048);
            System.out.println(feet + " feet is " + meters + " meters.");
        }
        if (selection == 4) //Meters to Feet
        {
            System.out.println("Enter Meters: ");
            double meters = keyboard.nextDouble();
            keyboard.nextLine();
            double feet = meters / 0.3048;
            System.out.println(meters + " meters is " + feet + " feet.");
        }
        if (selection == 5) //Ounces to Milliliters
        {
            System.out.println("Enter Ounces: ");
            double ounces = keyboard.nextDouble();
            keyboard.nextLine();
            double milliliters = ounces * 29.5735;
            System.out.println(ounces + " ounces is " + milliliters + " milliliters."); 
        }
        if (selection == 6) //Milliliters to Ounces
        {
            System.out.println("Enter Milliliters: ");
            double milliliters = keyboard.nextDouble();
            keyboard.nextLine();
            double ounces = milliliters / 29.5735;
            System.out.println(milliliters + " milliliters is " + ounces + " ounces.");
        }
        if (selection == 7) //Pounds to Grams
        {
            System.out.println("Enter Pounds: ");
            double pounds = keyboard.nextDouble();
            keyboard.nextLine();
            double grams = pounds * 453.592;
            System.out.println(pounds + " pounds is " + grams + " grams.");
        }
        if (selection == 8) //Grams to Pounds
        {
            System.out.println("Enter Grams: ");
            double grams = keyboard.nextDouble();
            keyboard.nextLine();
            double pounds = grams / 453.592;
            System.out.println(grams + " grams is " + pounds + " pounds.");
        }
        if (selection == 9) //Liters to Ounces
        {
            System.out.println("Enter Liters: ");
            double liters = keyboard.nextDouble();
            keyboard.nextLine();
            double ounces = liters * 33.814;
            System.out.println(liters + " liters is " + ounces + " ounces.");
        }
        if (selection == 10) //Ounces to Liters
        {
            System.out.println("Enter Ounces: ");
            double ounces = keyboard.nextDouble();
            keyboard.nextLine();
            double liters = ounces / 33.814;
            System.out.println(ounces + " ounces is " + liters + " liters.");
        }
    }