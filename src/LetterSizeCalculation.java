public class LetterSizeCalculation {
public static void main(String[] args){
     double MM_Inch = 25.4 ;
     double WIDTH_inINCHES = 8.5 ;
     double HEIGHT_inINCHES = 11.0 ;

     double Width_inMM = WIDTH_inINCHES * MM_Inch ;
     double Height_inMM = HEIGHT_inINCHES * MM_Inch ;
     double  Perimetre_inMM = 2 * (Width_inMM + Height_inMM) ;
     double Diagonal_inMM = Math.sqrt(Height_inMM * Height_inMM + Width_inMM * Width_inMM) ;

     System.out.print("Width : " + Width_inMM + " mm\n") ;
     System.out.print("Height : " + Height_inMM + " mm\n") ;
     System.out.print("Perimetre : " + Perimetre_inMM + " mm\n") ;
     System.out.print("Length of diagonal : " + Diagonal_inMM + " mm\n") ;
}
}
