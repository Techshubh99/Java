import java.io.*;
import java.util.*;

public class Greaterthanhundred {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>100){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}