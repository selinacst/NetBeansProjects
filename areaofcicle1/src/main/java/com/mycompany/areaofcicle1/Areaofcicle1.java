
package com.mycompany.areaofcicle1;
import java.util.Scanner;
public class Areaofcicle1 {
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the radius:");
        double r=in.nextDouble();
        double area=(22*r*r)/7;
        System.out.println("Area of circle is:"+area);
    }
}
