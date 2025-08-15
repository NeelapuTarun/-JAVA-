package num_converter;

import java.util.Scanner;

public class numConvert {

    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the decimal number for conversion:");


        int num =scanner.nextInt();
        


        System.out.println("integer:"+num);
        System.out.println("Hexadecimal:Ox"+Integer.toHexString(num));
        System.out.println("Octal:0"+Integer.toOctalString(num));


        scanner.close();
        
        }
        

    }

