package org.launchcode;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        double area;
        double radius;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle:");
        radius = input.nextDouble();

        area = Circle.getArea(radius);
        System.out.println("The area of the circle is " + area);
        input.close();
    }

}