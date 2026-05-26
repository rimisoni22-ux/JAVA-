
public class distinct5 {

    public static void main(String[] args) {
        int a = 90;
        int b = 20;
        int c = 100;
        int d = 78;
        int e = 200;
        // Assume a is the largest number initially

        // int largest;
        int largest =
(a > b)
? (
    (a > c)
    ? (
        (a > d)
        ? ((a > e) ? a : e)
        : ((d > e) ? d : e)
      )
    : (
        (c > d)
        ? ((c > e) ? c : e)
        : ((d > e) ? d : e)
      )
  )
: (
    (b > c)
    ? (
        (b > d)
        ? ((b > e) ? b : e)
        : ((d > e) ? d : e)
      )
    : (
        (c > d)
        ? ((c > e) ? c : e)
        : ((d > e) ? d : e)
      )
  );
       
     
     
    }
}
//         if (a > b) {
//             // a is larger than b
//             if (a > c) {
//                 // a is larger than c
//                 if (a > d) {
//                     //a is larger than d
//                     if (a > e) {
//                         // a is larger than e
//                         largest = a;
//                         System.out.println("a is largest");
//                     } else {
//                         //
//                         largest = e;
//                         System.out.println("e is largest");
//                     }

//                 } else {
//                     // d is larger than a and c and b
//                     if (d > e) {
//                         // d is larger than e
//                         largest = d;
//                         System.out.println("d is largest");
//                     } else {
//                         // e is larger than d and a and c and b
//                         largest = e;
//                         System.out.println("e is largest");
//                     }

//                 }

//             } else {
//                 //c is larger than a and b 
//                 if (c > d) {
//                     // c is larger than d
//                     if (c > e) {
//                         // c is larger than e
//                         largest = c;
//                         System.out.println("c is largest");
//                     } else {
//                         // e is larger than c and a and d and b
//                         largest = e;
//                         System.out.println("e is largest");
//                     }

//                 } else {
//                     // d is larger than a b and c 
//                     if (d > e) {
//                         // d is larger than e 
//                         largest = d;
//                         System.out.println("d is largest");

//                     } else {
//                         // e is larger than d and a and c and b
//                         largest = e;
//                         System.out.println("e is largest");
//                     }

//                 }

//             }
//         } else {

//             // b is larger than a
//             if (b > c) {
//                 // b is larger than c
//                 if (b > d) {
//                     // b is larger than d
//                     if (b > e) {
//                         // b is larger than e
//                         largest = b;
//                         System.out.println("b is largest");
//                     } else {
//                         // e is larger than b and a and c and d
//                         largest = e;
//                         System.out.println("e is largest");
//                     }

//                 } else {
//                     // d is larger than b and c and a
//                     if (d > e) {
//                         // d is larger than e
//                         largest = d;
//                         System.out.println("d is largest");
//                     } else {
//                         // e is larger than d and b and a and c
//                         largest = e;
//                         System.out.println("e is largest");
//                     }

//                 }

//             } else {
//                 //c is larger than b and a 
//                 if (c > d) {
//                     // c is larger than d
//                     if (c > e) {
//                         // c is larger than e
//                         largest = c;
//                         System.out.println("c is largest");
//                     } else {
//                         // e is larger than c and a and d and b
//                         largest = e;
//                         System.out.println("e is largest");
//                     }

//                 } else {
//                     // d is larger than b a and c 
//                     if (d > e) {
//                         // d is larger than e 
//                         largest = d;
//                         System.out.println("d is largest");

//                     } else {
//                         // e is larger than d and a and c and b
//                         largest = e;
//                         System.out.println("e is largest");
//                     }

//                 }

//             }

//         }
//     }

// }
