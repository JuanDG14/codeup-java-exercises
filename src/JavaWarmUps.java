import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JavaWarmUps {

    //Question 1

//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("================================");
//        for(int i=0;i<3;i++){
//            String s1=sc.next();
//            int x=sc.nextInt();
//            //Complete this line

//            System.out.printf("%-15s%03d%n", s1, x);

//        }
//        System.out.println("================================");
//
//    }
//

    // Question 2 (unsolved)

//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        int N = Integer.parseInt(bufferedReader.readLine().trim());
//
//
//
//        bufferedReader.close();
//    }

    //Question 3

//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        String A = sc.next();
//        /* Enter your code here. Print output to STDOUT. */
//        System.out.println( A.equals( new StringBuilder(A).reverse().toString()) ? "Yes" : "No" );
//    }

    // Question 4

    static boolean isAnagram(String a, String b) {
        // Complete the function

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

