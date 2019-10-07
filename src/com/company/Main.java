package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        input.nextLine();
        String symbol = input.nextLine();
        int c = input.nextInt();
        //skal skrives linje for linje

        input.close();

        if((symbol.equals("+"))){
            System.out.println(pluser(a,c));
        }
        else if((symbol.equals("-"))){
            System.out.println(pluser(a,c));
        }
        else if((symbol.equals("/"))){
            System.out.println(pluser(a,c));
        }
        else if((symbol.equals("*"))){
            System.out.println(pluser(a,c));
        }
    }

    public static int pluser(int x, int y){

       return x+y;
    }

}
// den virker som det skal