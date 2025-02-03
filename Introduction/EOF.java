import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n=0;
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext())
        {
            String word=sc.nextLine();
            System.out.println((n+1)+" "+word);
            n++;
        }
        sc.close();
    }
}