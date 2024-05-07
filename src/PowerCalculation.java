import java.util.Scanner ;
public class PowerCalculation {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in) ;
        System.out.print("Enter a number: ") ;
        double Num_1 ;
        Num_1 = input.nextDouble() ;
        double square = Num_1 * Num_1 ;
        double cube = Num_1 * Num_1 * Num_1 ;
        double fourthPower = Math.pow(Num_1 , 4) ;

        System.out.println("Square: " + square);
        System.out.println("Cube: " + cube);
        System.out.println("Fourth power: " + fourthPower);
        input.close();
    }
}
