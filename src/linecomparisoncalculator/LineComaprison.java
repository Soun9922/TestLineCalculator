package linecomparisoncalculator;

import java.util.Scanner;

public class LineComaprison {
    public static void main(String[] args) {
        int x1, x2, y1, y2;
        //double distance;
        double totalDistance;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 point : ");
        x1 = sc.nextInt();
        System.out.println("Enter x2 point : ");
        x2 = sc.nextInt();
        System.out.println("Enter y1 point : ");
        y1 = sc.nextInt();
        System.out.println("Enter y2 point : ");
        y2 = sc.nextInt();
        totalDistance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("The Length of the Line : " + totalDistance);
    }
}
