    
class ArrayExample{
     void demoArray(){
        int [] ages = new int[3];
        float[]weight = new float[4];
        String[]names ={"John","Mary","David","harry"};
        ages[0]=12;
        ages[1]=15;
        ages[2]=18;
        //  System.out.println(names[0]);
        //  System.out.println(names[1]);
        //  System.out.println(names[2]);
         System.out.println(ages.length);//3
         System.out.println(weight.length);//4
         System.out.println(names.length);//4
        // for(int i=0;i<3;i++){
           // System.out.println(ages[i]);
           int i = 0;
           while(i<3){
            System.out.println(ages[i]);
            i++;
           }
             for ( int age : ages) {
                System.out.println(age);
            
             }
          //  }
            }
    
        public static void main(String[] args) {
            ArrayExample obj = new ArrayExample();
            obj.demoArray();
            
            
        }
      
        }

    