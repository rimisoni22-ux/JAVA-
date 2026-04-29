
public class logical {
    public static void main(String[] args) {
        //logical AND
        System.out.println(3>2&&5>0);//if both are True then True otherwise False
        System.out.println(3<2&&5>0);
        System.out.println(3<2&&5<0);
        
        //logical OR

        System.out.println(3>2||5>0);//if both are False then False otherwise True
        System.out.println(3<2||5>0);
        System.out.println(3<2||5<0);

        //logical NOT
        System.out.println(!(3>2));
        System.out.println(!(3<2));//True to False and false to true REVERSE 

        
    }
    
}
