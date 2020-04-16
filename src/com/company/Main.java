package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        if(z==0){ System.out.printf("%d",x+y);}
        if(z==1){ System.out.printf("%d",x-y); }
        if(z==2){ System.out.printf("%d",x*y); }
        if(z==3) {
            {if(y==0) System.out.println("cannot divide by zero");}
        { System.out.printf("%f",(float)x/y); }
        }
        if(z==4){
            {if(y==0) System.out.println("cannot divide by zero");}
            {System.out.printf("%d",x%y);}
        }
    }
}
