import java.io.*;
import java.util.*;

public class FarenhitetoCelcius {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        Double F = sc.nextDouble();
        Double C = ((F-32)*5)/9;
        System.out.println(C);
    }
}