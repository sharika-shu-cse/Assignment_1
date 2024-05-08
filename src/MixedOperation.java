import java.util.Scanner ;
public class MixedOperation {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in) ;
        int Num_1 , Num_2 ;
        System.out.print("Enter the First number  : ") ;
        Num_1 = input.nextInt() ;
        System.out.print("Enter the Second number  : ") ;
        Num_2 = input.nextInt() ;

        int Sum = Num_1 +  Num_2 ;
        int  Difference =  Num_1 - Num_2  ;
        int  Product = Num_1 * Num_2  ;
        double Average = (double) (Num_1 + Num_2) / 2 ;
        int Distance = Math.abs(Num_1 - Num_2) ;
        int  Maximum = Math.max(Num_1 , Num_2) ;
        int  Manimum = Math.min(Num_1 , Num_2) ;

        System.out.println("The Sum of the two number : " + Sum ) ;
        System.out.println("The Difference of the two number : " + Difference) ;
        System.out.println("The Product of the two number : " + Product) ;
        System.out.println("The Average of the two number : " + Average) ;
        System.out.println("The Distance of the two number : " + Distance) ;
        System.out.println("The Maximum number of the two number : " + Maximum) ;
        System.out.println("The Minimum of the two number : " + Manimum) ;
    }
}
