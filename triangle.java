 import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        //eq = 3 eqal
        //isos = 2= 3 not
        // scalen =3 diff

        int a = 3;
        int b = 4;
        int c = 5;
        if(a+b>c && a+c>b && b+c>a){ 
            System.out.println("this is a triangle");
            if(a==b && b==c){
                  System.out.println("this is a equilateral triangle");
            }
                else if (a==b || b==c || a==c){
                  System.out.println("this is a iso triangle");
            }            
               else{

                  System.out.println("this is a scalen triangle");

               }
            }
        
          else {
                    System.out.println("this is not triangle");

            }

        
        }
    
}
