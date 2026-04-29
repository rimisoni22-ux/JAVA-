class student{
    int rollno;
    String  studentname;

}




public class Smain {
    public static void main(String[] args) {
        student obj1 = new student();
         obj1.rollno=1;
         obj1.studentname = " Rohan";
         System.out.println(obj1.rollno);
         System.out.println(obj1.studentname);
        
         student obj2 = new student();
        obj2.rollno=2;
        obj1.studentname="Ram";
        System.out.println(obj2.rollno);
        System.out.println(obj2.studentname);
        
    }
    
}
