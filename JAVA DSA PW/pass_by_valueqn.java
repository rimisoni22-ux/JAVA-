public class pass_by_valueqn {
    public static void decrease(int n1 ,int n2){
        n1--;
        n2=n2-2;
        System.out.println(" value of n1 and n2");
        System.out.println(n1+":"+n2);
    }
     public static void main(String[] args) {
        int p = 26;
        int q =13;
        decrease(p,q);
        System.out.println("value of p and q");
        System.out.println(p+":"+q);
         
     }
    
}
