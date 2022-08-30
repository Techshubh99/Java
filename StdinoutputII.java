import java.io.*;
import java.util.*;

public class StdinoutputII {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        double b = scn.nextDouble();
        String c = scn.nextLine();
        c = scn.nextLine();
        System.out.println("String: "+c);
        System.out.println("Double: "+b);
        System.out.println("Int: "+a);
    }
}