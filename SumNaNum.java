// sum of n natural numbers//

import java.util.Scanner;

public class SumNaNum{
    public static void main(String[] args){
        Scanner x =new Scanner(System.in);
        
        
        System.out.println("enter upto where the natural numbers must be added:");
        int num=x.nextInt();
        
        int sum = 0;
        for (int i=0 ; i<=num ; i++){
            sum+=i;
        }
        
        System.out.println("The sum is " + sum);
            x.close();
    }
}



