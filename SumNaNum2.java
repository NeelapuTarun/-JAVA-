//Greatest of three Numbers//

import java.util.Scanner;

public class SumNaNum2{
    public static void main(String[] args){
        Scanner x =new Scanner(System.in);
        
        System.out.println("enter the value of a:");
        int a =x.nextInt();
        
        System.out.println("enter the value of b:");
        int b =x.nextInt();
        
        System.out.println("enter the value of c:");
        int c =x.nextInt();
        
        if (a>b && a>c){
            System.out.println(a+" is greater then "+b+" and " +c);
        }
        else if(b>a && b>c){
            System.out.println(b+" is greater than "+a+" and " +c);
        }
        else if(c>a && c>b){
            System.out.println(c+" is greater than "+a+" and "+b);
        }
        else if(a==b && a==c){
            System.out.println("All are equal");
        }
        else {
            System.out.println("Invalid");
        }
        x.close();
        }
        
    }




