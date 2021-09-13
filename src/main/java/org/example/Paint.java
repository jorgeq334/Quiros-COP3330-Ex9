package org.example;
import java.util.Scanner;
/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jorge Quiros
 */
public class Paint
{
    public static void main( String[] args )
    {
        Scanner input=new Scanner(System.in);
        System.out.println( "What is the length of the room in feet?" );
        Double length= input.nextDouble();
        System.out.println( "What is the width of the room in feet?" );
        Double width= input.nextDouble();
        Double f2= length * width;
        Integer sqFeetPerGallon= 350;
        Integer gallon= (int)Math.ceil(f2/sqFeetPerGallon);
        System.out.println("You will need to purchase "+ gallon + " gallons of paint to cover "+ f2 + " square feet.");

    }
}
