/**
 * The Temperature class prints calculation units temperature difference after given table.
 *
 * Hadassa Kazhav
 * @version 1
 */

import java.util.Scanner;
public class Temperature

{

    /**
    // Get the first char temperature and number from user
    // read char, number, line gets from user with class Scanner 
    // convert units temperature after given user
    // print unit after given final after given user c/k/f 
     */
    public static void main(String[]args)
    {

        String unitTemperature;
        String line;
        double unitsNumber;

        Scanner scan=new Scanner(System.in);
        System.out.println("This program calculates unit temperature CELSIUS,FAHRENHEIT,KELVIN" +
            " after gets from user\n"  );

        //Get the first char temperature (c/k/f) and number from user 
        System.out.println("Please enter units temperature C/F/K and temperature number");
        unitTemperature = scan.next();
        unitsNumber=scan.nextDouble();
        line = scan.nextLine();
        char firstTemp = unitTemperature.charAt(0);
        System.out.println(line + unitTemperature.charAt(0) + "  " + unitsNumber);

        // convert units temperature after given user
        final double CELSIUS_TO_FAHRENHEIT_CONVERT = ((9/5.0) * unitsNumber + 32);
        final double CELSIUS_TO_KELVIN_CONVERT = (unitsNumber + 273.15);
        final double FAHRENHEIT_TO_KELVIN_CONVERT = (unitsNumber + 459.67) / 1.8 ;
        final double FAHRENHEIT_TO_CELSIUS_CONVERT = (5/9.0)*(unitsNumber - 32);
        final double KELVIN_TO_CELSIUS_CONVERT = (unitsNumber - 273);
        final double KELVIN_TO_FAHRENHEIT_CONVERT = ((9/5.0) * (unitsNumber - 273.15) + 32);
        System.out.println();

        // print unit after given final after given user c/k/f 
        switch (firstTemp) {
            case 'F': 
                System.out.println(FAHRENHEIT_TO_CELSIUS_CONVERT + " C" );
                System.out.println(unitsNumber + " F" );
                System.out.println(FAHRENHEIT_TO_KELVIN_CONVERT + " K" );
                break;

            case 'C':
                System.out.println(unitsNumber + " C" );
                System.out.println(CELSIUS_TO_FAHRENHEIT_CONVERT + " F" );
                System.out.println(CELSIUS_TO_KELVIN_CONVERT + " K" );
                break;

            case 'K':
                System.out.println(KELVIN_TO_CELSIUS_CONVERT + " C" );
                System.out.println(KELVIN_TO_FAHRENHEIT_CONVERT + " F" );
                System.out.println(unitsNumber + " K" );
                break;

            default: System.out.println("Error illegal units temperature");

        } //end swich
    }//main
}//Temperature class