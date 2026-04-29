public class arrayloops{
    void demoArray (){
        int []ages = new int [3];
        float[]weights =new float[3];
        String[]names = { "John", "Mary", "David" };
         ages[0]=12;
         ages[1]=15;
         ages[2]=18;
         for (int i =0; i<3;i++){
            System.out.println(ages[i]);
         }

    }
    
        public static void main(String[] args) {
           arrayloops demo = new arrayloops();
            demo.demoArray();
        }
    }
    

