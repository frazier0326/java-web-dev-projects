package org.launchcode;
import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args) {
        double length;
        double width;
        double area;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter rectangle length:");
        length = input.nextDouble();
        System.out.println("Enter rectangle width:");
        width = input.nextDouble();
        input.close();
        area = width * length;
        System.out.println("Rectangle area:" + area);
    }
}
