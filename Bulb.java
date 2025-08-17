//In a small town named Ramapuram, there is an annual festival where the main attraction is a large stage decorated with colorful lights. Each lightbulb on the stage has a number written on it, and the festival organizers have a unique lighting pattern challenge for programmers to create. The challenge is to light up only the bulbs with numbers that meet specific criteria:
//1. A bulb lights up green if its number is divisible by 3.
//2. A bulb lights up red if its number is divisible by 5.
//3. A bulb lights up yellow if it is divisible by both 3 and 5.
//4. All other bulbs remain off. The festival committee wants a program that takes the total number of bulbs(n), and number on each bulb as input and prints the lighting status of each bulb. Example: Enter the total number of bulbs: 5 Enter the number of bulb1: 80 Enter the number of bulb2: 24 Enter the number of bulb3: 60 Enter the number of bulb4: 23 Enter the number of bulb5: 33 Output: Bulb1 glows in Red Bulb2 glows in Green Bulb3 glows in Yellow Bulb4 remains switched off Bulb5 glows in green




//Ramapuram bulb incident

import java.util.Scanner;

public class Bulb{
    public static void main (String[] args ){
    
        Scanner x =new Scanner(System.in);

        System.out.println("Enter the number of types of bulbs:");
        
        //Total no of bulbs

        int n =x.nextInt();

        System.out.println("Enter the number of Bulb 01:");
        int bulb1 =x.nextInt();

        System.out.println("Enter the number of Bulb 02:");
        int bulb2 =x.nextInt();

        System.out.println("Enter the number of Bulb 03:");
        int bulb3 =x.nextInt();

        System.out.println("Enter the number of Bulb 04:");
        int bulb4 =x.nextInt();

        System.out.println("Enter the number of Bulb 05:");
        int bulb5 =x.nextInt();

    
        //For Bulb 01

        if (bulb1%3==0 && bulb1%5==0){
            System.out.println("Bulb1 glows in Yellow");
        }
        else if (bulb1%3==0){
            System.out.println("Bulb1 glows in Green");
        }
        else if(bulb1%5==0){
            System.out.println("Bulb1 glows in Red");
        }
        else {
            System.out.println("Bulb1 remains switched off");
        }


        //For Bulb 02
        if (bulb2%3==0 && bulb2%5==0){
            System.out.println("Bulb2 glows in Yellow");
        }
        else if (bulb2%3==0){
            System.out.println("Bulb2 glows in Green");
        }
        else if(bulb2%5==0){
            System.out.println("Bulb2 glows in Red");
        }

        else {
            System.out.println("Bulb2 remains switched off");
        }


        //For Bulb 03

        if (bulb3%3==0 && bulb3%5==0){
            System.out.println("Bulb3 glows in Yellow");
        }
        else if (bulb3%3==0){
            System.out.println("Bulb3 glows in Green");
        }
        else if(bulb3%5==0){
            System.out.println("Bulb3 glows in Red");
        }

        else {
            System.out.println("Bulb3 remains switched off");
        }

        //For Bulb 04
        if (bulb4%3==0 && bulb4%5==0){
            System.out.println("Bulb4 glows in Yellow");
        }
        else if (bulb4%3==0){
            System.out.println("Bulb4 glows in Green");
        }
        else if(bulb4%5==0){
            System.out.println("Bulb4 glows in Red");
        }

        else {
            System.out.println("Bulb4 remains switched off");
        }

        //For Bulb 05

        if (bulb5%3==0 && bulb5%5==0){
            System.out.println("Bulb5 glows in Yellow");
        }
        else if (bulb5%3==0){
            System.out.println("Bulb5 glows in Green");
        }
        else if(bulb5%5==0){
            System.out.println("Bulb5 glows in Red");
        }
        else {
            System.out.println("Bulb5 remains switched off");
        }

        x.close();

    }
}