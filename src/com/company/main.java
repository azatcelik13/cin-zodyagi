
package com.company;
import java.util.Scanner;
public class main {
    static public void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome! Are u ready for find your Chinese Zodiac?");
        System.out.println("What is your Birth Year?");
        int birthYear = input.nextInt();
        if (birthYear%12==0)        {System.out.println("Your Chinese Zodiac is " + "Monkey"); }
        else if (birthYear%12==1)   {System.out.println("Your Chinese Zodiac is " + "Rooster");}
        else if (birthYear%12==2)   {System.out.println("Your Chinese Zodiac is " + "Dog");}
        else if (birthYear%12==3)   {System.out.println("Your Chinese Zodiac is " + "Pig");}
        else if (birthYear%12==4)   {System.out.println("Your Chinese Zodiac is " + "Rat");}
        else if (birthYear%12==5)   {System.out.println("Your Chinese Zodiac is " + "Ox");}
        else if (birthYear%12==6)   {System.out.println("Your Chinese Zodiac is " + "Tiger");}
        else if (birthYear%12==7)   {System.out.println("Your Chinese Zodiac is " + "Rabbit");}
        else if (birthYear%12==8)   {System.out.println("Your Chinese Zodiac is " + "Wow!!! IT IS A DRAGONNNNNNN");}
        else if (birthYear%12==9)   {System.out.println("Your Chinese Zodiac is " + "Snake");}
        else if (birthYear%12==10)  {System.out.println("Your Chinese Zodiac is " + "Horse");}
        else if (birthYear%12==11)  {System.out.println("Your Chinese Zodiac is " + "Sheep");}



    }


}