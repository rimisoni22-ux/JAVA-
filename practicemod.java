
public class practicemod {

    public static void main(String[] args) {
        //   Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the character: ");
        // char ch = sc.next().charAt(2);
        // char ch = 'b';
        // if (ch >= 'A' && ch <= 'Z') {
        //     if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
        //         System.out.println("VOWEL");
        //     } else { 
        //         System.out.println("CONSONANT");
        //     }
        // } else if (ch >= 'a' && ch <= 'z') {
        //     if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        //         System.out.println("Vowel");
        //     } else {
        //         System.out.println("Consonant");
        //     }

        // } else if (ch >= '0' && ch <= '9') {
        //     System.out.println("Number");

        // } else {
        //     System.out.println("Symbol");
        // }
            char ch = 'A';
        if ((ch >= 'A' && ch <= 'Z' )|| ( ch >= 'a' && ch <= 'z')) {
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("VOWEL");
            } else {
                System.out.println("CONSONANT");
            }

        } else if (ch >= '0' && ch <= '9') {
            System.out.println("Number");

        } else {
            System.out.println("Symbol");
        }


    }
}
