//The greatest of two numbers //

import java.util.Scanner;

public class SumNaNum1{
    public static void main(String[] args){
        Scanner x =new Scanner(System.in);
        
        System.out.println("enter the value of a:");
        int a =x.nextInt();
        
        System.out.println("enter the value of b:");
        int b =x.nextInt();
        
        if (a>b){
            System.out.println(a+" is greater then "+b);
        }
        else if(b>a){
            System.out.println(b+" is greater than "+a);
        }
        else if(a==b){
            System.out.println("both are equal");
        }
        else {
            System.out.println("Invalid");
        }
        x.close();
        }
        
    }




