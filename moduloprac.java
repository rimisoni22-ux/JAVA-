
public class moduloprac {
    // if no is  163212 then sum of 16+32+12 = 60

    public static void main(String[] args) {
        // int x = 231628;
        // int y = x % 100; // find the last 2 digits  28
        // int z = x / 100; //remove 28 
        // int m = z % 100; //find 16 from 2316
        // int n = z / 100; // find 23
        // int a = y + m + n;
        // System.out.println(a);
        int n = 236821;
        int a = n % 10;//1
        n = n / 10;//23682 

        int b = n % 10;//2
        n = n / 10;//2368

        int c = n % 10;//8
        n = n / 10;//236

        int d = n % 10;//6
        n = n / 10;//23

        int e = n % 10;//3
        n = n / 10;//2
        int f = n % 10;//2
        n = n / 10;//

        System.out.println(a+b+c+d+e+f);

    }

}
