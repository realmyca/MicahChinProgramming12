import java.util.Scanner;

public class QuadrantCalculator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the X coordinate: ");
        double x = scanner.nextDouble();

        System.out.print("Enter the Y coordinate: ");
        double y = scanner.nextDouble();

        if (x > 0 && y > 0){
            System.out.println("Quadrant 1");
        }
        else if (x < 0 && y > 0){
            System.out.println("Quadrant 2");
        }
        else if (x < 0 && y < 0){
            System.out.println("Quadrant 3");
        }
        else if (x > 0 && y < 0){
            System.out.println("Quadrant 4");
        }
        else{
            // Point is on an axis or at the origin
            System.out.println("The coordinates isn't in a quadrant");
        }

    }
}
