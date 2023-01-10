/**
 * Author: Jason D'Oyley
 * Date: Jan 10, 2023
 * Challenge: Convert to Centimeters
 */

public class ConvertToCentimeters {
    public static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }
    public static double convertToCentimeters(int feet, int inches) {
        return convertToCentimeters((feet * 12) + inches);
    }

    public static void main(String[] args) {
        System.out.println("6ft, 0in = " + convertToCentimeters(6, 0));               // 182.88
        System.out.println("5ft, 8in = " + convertToCentimeters(5, 8) + "cm");        // 172.72
        System.out.println("200in = " + convertToCentimeters(200) + "cm");                 // 508.0
    }
}
