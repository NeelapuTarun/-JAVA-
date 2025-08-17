// Postive or Negative number checker//

import java.util.Scanner;


public class PostiveOrNegtaive{
    public static void main(String[] args ){
    Scanner scanner =new Scanner(System.in);
    
    System.out.println("Enter the Number to be Checked:");
    int num =scanner.nextInt();

    if (num >0) {
        System.out.println("Postive");
    }
    else if (num==0){
    System.out.println("Zero");
    }  else if(num<0){
        System.out.println("Negative");
    } else{
        System.out.println("Invalid");
    }
        scanner.close();
    
    }

    }


