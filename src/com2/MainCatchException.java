package com2;

import java.util.Scanner;

public class MainCatchException {

    public static void main(String[] args) {

        boolean flag = true;

        while(flag){

            try{
                System.out.println("Wprowadz inta");
                new Scanner(System.in).nextInt();
                flag = false;
            }
            catch (Exception e){
                System.out.println("Sprobuj jeszcze raz");
                continue;
            }

        }




    }
}
