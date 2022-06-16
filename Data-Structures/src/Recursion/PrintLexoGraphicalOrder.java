package Recursion;

import java.util.Scanner;

// first print 1 ,2 ,3 usme bi (10,11,12, 19) aise
public class PrintLexoGraphicalOrder {
    public static void printLexoHelper(int i,int n)
    {
        if(i>n) {
            return;
        }
        System.out.println(i);// print the incoming number and call for the family to print
        for(int j=0;i<10;j++){
            printLexoHelper(10*i+j,n);
        }
    }
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=1;i<=9;i++) {
            printLexoHelper(i,n);
        }

    }
}
