// Largest between 4 Numbers

public class distinct {
    // (condition)?(true block):(false block)

    public static void main(String[] args) {
        int a = 10;
        int b = 23;
        int c = 45;
        int d = 46;
        int largest1 = (a > b)
                ? ((a > c)
                        ? ((a > d) ? (a) : (d))
                        : ((c > d) ? (c) : (d)))
                : (b > c)
                        ? ((b > d) ? (b) : (d))
                        : ((c > d) ? (c) : (d));
        System.out.println("Largest is : " + largest1);
    }
}

//         int largest;
//         if (a > b) {
//             // a is larger than b
//             if (a > c) {
//                 // a is larger than c,b
//                 if (a > d) {
//                     // a is larger than d,c,b
//                     largest = a;
//                 } else {
//                     // d is larget than a,b,c
//                     largest = d;
//                 }
//             } else {
//                 // c is larger than a ,b
//                 if (c > d) {
//                     // c is larger than a,b,dF
//                     largest = c;
//                 } else {
//                     // d is larger than a, b,c
//                     largest = d;
//                 }
//             }
//         } else {
//             // b is larger than a
//             if (b > c) {
//                 // b is larger than a,c
//                 if (b > d) {
//                     // b is larger than a,c,d
//                     largest = b;
//                 } else {
//                     largest = d;
//                 }
//             } else {
//                 // c is larger than b,a
//                 if (c > d) {
//                     // c is larger than a,b,d
//                     largest = c;
//                 } else {
//                     // d is larger than b ,a,c
//                     largest = d;
//                 }
//             }
//         }
//         System.out.println("Largest is : "+largest   );
//     }
// }
