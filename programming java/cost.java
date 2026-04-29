import java.util.*;
//Bill of items

public class cost {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        Float pencil = Sc.nextFloat();
        Float pen = Sc.nextFloat();
        Float eraser = Sc.nextFloat();
        Float total = pencil+pen+eraser;
        System.out.println("Bill is :"+total);
        //Add on-with 18%tax
        Float newtotal =total+(0.18f*total);
        System.out.println("Bill with 18% tax:"+newtotal);
        
    }
    
}
