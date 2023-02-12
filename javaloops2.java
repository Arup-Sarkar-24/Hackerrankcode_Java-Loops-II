import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        int myInt=input.nextInt();
        for(int i=0;i<myInt;i++){
            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();
            int res = a;
            for (int j = 0; j < n; j++)
            {
                res += (int)(Math.pow(2, j) * b);
                System.out.print(Integer.toString(res)  + ' ');
            }
            System.out.print('\n');
        }
        input.close();
}
}
