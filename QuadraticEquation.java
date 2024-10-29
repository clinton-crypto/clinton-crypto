import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {
      double a;
      double b;
      double c;
        Scanner input = new Scanner(System.in);

        System.out.println ("Enter a");
        a = input.nextDouble();
        System.out.println ("Enter b");
        b = input.nextDouble();
        System.out.println ("Enter c");
        c = input.nextDouble();

        double discriminant = b * b - 4 * a*c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Root: " + root);
        } else {
            System.out.println("No real roots exist.");
        }
    }
}