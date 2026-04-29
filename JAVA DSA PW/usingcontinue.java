public class usingcontinue {
    public static void main(String[] args) {
       // print all values 1 TO 50 except for the Multiples of 3
        
      myloop :  for(int num =1; num<=50;num++) {
            if (num%3==0){
                continue;

            }
            System.out.println(num );

        }
    }
    
}
