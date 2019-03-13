package exercises;
import java.util.Scanner;

class Ex13MilesPerGallon {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter miles driven: ");
        float miles = in.nextFloat();
        System.out.println("Enter gas consumed (in gallons): ");
        float gas = in.nextFloat();
        System.out.println("Miles per gallon: " + miles/gas);

    }
}
