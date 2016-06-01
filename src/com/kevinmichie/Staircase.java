package com.kevinmichie;

import java.util.Scanner;

public class Staircase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfStairs = scanner.nextInt();
        String stairCaseBuild = "";
        for(int i = 0; i < sizeOfStairs; i++){
            stairCaseBuild+=" ";
        }
        for(int j = sizeOfStairs; j >0; j--){
            stairCaseBuild = stairCaseBuild.substring(0,j-1);
            while(stairCaseBuild.length() < sizeOfStairs){
                stairCaseBuild+= "#";
            }
            System.out.println(stairCaseBuild);
        }

    }
}
