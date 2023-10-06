import java.util.Scanner;

public class Selection2Exp115 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);
        System.out.println("Input Year: ");
        int year = input15.nextInt();

        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                System.out.println("Leap year");
            } else {
                System.out.println("Not a leap year");
            }
        } else {
            System.out.println("Not a leap year");
        }
    }
}

