public class binary_to_decimal {
    public static void binTodecimal(int binNum){
        int mynum = binNum;
        int pow =0;
        int decNum = 0;
        while(binNum>0){
            int lastDigit = binNum%10;
            decNum =decNum+(lastDigit* (int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;

        }
        System.out.println("decimal of "+binNum+"  = "+decNum);
    }
    public static void main(String[] args) {
        binTodecimal(1010);
        
    }

    
}
