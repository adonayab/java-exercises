package exercises;
import java.util.Scanner;

public class Ex12AreaOfARectangle {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of the Rectangle: ");
        double len = in.nextDouble();
        System.out.println("Enter width of the Rectangle: ");
        double wid = in.nextDouble();
        System.out.println("Area = " + len * wid);

    }
}
