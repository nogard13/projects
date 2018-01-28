package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        int n = sc.nextInt();
        String s = "";
        String temp_s = "";
        sc.nextLine();
        do{
            n--;
            s = sc.nextLine();
            if (s.length()>4){
                temp_s = String.valueOf((s.length()-2));
                System.out.println(s.charAt(0) + temp_s + s.charAt(s.length()-1));
            }else{
                System.out.println(s);
            }
        } while (n>0);
    }
}
