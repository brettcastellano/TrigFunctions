/*
 Prompts the user for the angle, displays sine, cosine and tangent of the angle
 Brett Castellano
 April 5, 2017
 */
package trigfunctions;

import java.lang.Math;
import java.util.Scanner;
import java.text.*;

/**
 *
 * @author brcas1396
 */
public class TrigFunctions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double angle;   //angle in degrees that will be inputted by user
        double sine;    //sin cos and tan which will be calculated for inputted angle
        double cosine;
        double tangent;

        DecimalFormat x = new DecimalFormat("0.##");    //decimal format that will be used to display values        

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an angle in degrees: ");    //prompts user for angle

        angle = input.nextInt();    //angle is inputted by user
        input.close();

        sine = Math.sin(Math.toRadians(angle));     //calculate sine of inputted angle in radians
        cosine = Math.cos(Math.toRadians(angle));   //calculate cosine of inputted angle in radians  
        tangent = Math.tan(Math.toRadians(angle));  //calculate tangent of inputted angle in radians

        System.out.println("Sine: " + x.format(sine));        //displays sine of angle to two decimal places
        System.out.println("Cosine: " + x.format(cosine));    //displays cosine of angle to two decimal places
        System.out.println("Tangent: " + x.format(tangent));  //displays tangent of angle to two decimal places
    }

}
