import java.io.*;
import java.util.*;

public class AreaandPerimeter {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        int area = l*b;
        System.out.println(area);
        int perimeter = 2*(l+b);
        System.out.println(perimeter);
    }
}