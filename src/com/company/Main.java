package com.company;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scn = new Scanner(System.in);
        boolean isNtrue = false;
        int array[]={1,3,5,2};
        System.out.println("Enter N number");
        int n = scn.nextInt();
        for (int i = 0; i <n; i++) {
            for (int j = i+1; j <n; j++) {
                if(array[i]+array[j]==n) {
                    isNtrue=true;
                }
            }
        }
        System.out.println(isNtrue);
    }
}
