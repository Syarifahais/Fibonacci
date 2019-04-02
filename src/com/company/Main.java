package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner ais = new Scanner(System.in);
        int a;

        System.out.print("Jumlah deret Fibonacci yang diinginkan : ");
        a =ais.nextInt();

        for (int i = 1; i <= a ; i++) {
            int b = cari(i);
            System.out.print(b + " ");

        }
    }
    public static int cari (int a){
        if (a == 1 || a == 2){
            return 1;
        }else {
            return cari(a - 1) + cari(a - 2);
        }
    }
}
