import java.io.*;
import java.util.*;

public class AddlastDigit {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a%10 + b%10;
        System.out.println(sum);
    }
}