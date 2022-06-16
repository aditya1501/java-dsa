package Recursion;

import java.util.Scanner;

public class JoshpheusProblem {
     public static int solveHelper(int n,int k)
     {
          //
          if(n==0) {
               return 0;
          }
          int x=solveHelper(n-1,k);
          int y=(x+k)%n;
          return y;
     }
     public static void main(String [] args)
     {
          Scanner scn=new Scanner(System.in);
          int n=scn.nextInt();
          int k= scn.nextInt();
          int ans=solveHelper(n,k);
          System.out.println(ans);
     }
}
