import java.util.Scanner;

public class Selection2Exp215 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);
        System.out.println("Input Angle A: ");
        int angle1 = input15.nextInt();
        System.out.println("Input Angle B: ");
        int angle2 = input15.nextInt();
        System.out.println("Input Angle C: ");
        int angle3 = input15.nextInt();
        int totalAngle = angle1 + angle2 + angle3;

        if (totalAngle == 180) {
            if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                System.out.println("Right triangle");
            } else if (angle1 == angle2 && angle2 == angle3) {
                System.out.println("Equilateral triangle");
            } else if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3) {
                System.out.println("Isosceles triangle");
            } else {
                System.out.println("Scalene triangle");
            }
        } else {
            System.out.println("Not a triangle");
        }
    }
}
