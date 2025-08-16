// Sum of numbers in a given range//

import java.util.Scanner;

public class SumNatural{
    
    public static void main(String[] args) {
        
    Scanner x = new Scanner(System.in);
    System.out.println("pls enter the starting natural number:");
    int start=x.nextInt();
    
    System.out.println("pls enter the natural no upto to which it should be added:");
    int end=x.nextInt();
    
    int sum =0;
    
    
    for (int i=start ; i <= end ;i++){
        sum+=i;
    
        
    }
      System.out.println("The sum is "+sum);
      
    }
    

}


