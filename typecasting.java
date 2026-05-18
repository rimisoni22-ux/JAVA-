public class typecasting {
    public static void main(String[] args) { 
        byte b = 67;
        short s =b;
        int i = s;
        long l =i;
        float f = l ;
        double d = f;
        System.out.println("byte" +b);
        System.out.println("short s=b" + s);
        System.out.println("int i=s" +i);
         System.out.println("long l=i" +i);
          System.out.println(" " +i);
           System.out.println("int i=s" +i); 

           // Explicit typecasting
            double  d1 = 130.666889330483436475964645374;
            System.out.println(d1);
             float  f1 = (float) d1;
             long l1 =(long) f1;
             int  i1 = (int) l1;
             short s1 = (short) l1;
             byte b1 = (byte) s1;
             
      


        
    }
}