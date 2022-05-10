import java.util.*;

public class LineCompUC3{
    public static void main (String args[]) {

        int x1 ,y1, x2, y2, x3, y3, x4, y4 ;
        Double L1 ;
        Double L2 ;
        x1=1; x2=1; y1=8; y2=10; x3=1; x4=1; y3=8; y4=10;

        L1 = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)) ;
        L2 = Math.sqrt((x4-x3)*(x4-x3) + (y4-y3)*(y4-y3)) ;

        int result = L1.compareTo(L2);
         
        if (result > 0){
            System.out.println("L1 is Greater than L2");
        }
        else if (result < 0){
            System.out.println("L2 is Greater than L1");
        }
        else{
            System.out.println("L1 is equal to L2");
        }
    }
}
