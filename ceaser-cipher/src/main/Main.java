package main;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {
            String msg = input.nextLine();
            String enc = encrypt(msg, 3);
            System.out.println(enc);
            String dec = decrypt(enc, 3);
            System.out.println(dec);
            System.out.println("***********************");
        }
    }


    public static String decrypt(String msg, int key){
        char[] tempChar = msg.toCharArray();
        char[] tempInt = new char[tempChar.length];

        for(int i=0; i<tempChar.length; i++){
            tempInt[i] = (char) (tempChar[i] - key);
        }

        return String.valueOf(tempInt);
    }

    public static String encrypt(String msg, int key){
        char[] tempChar = msg.toCharArray();
        char[] tempInt = new char[tempChar.length];

        for(int i=0; i<tempChar.length; i++){
            tempInt[i] = (char) (tempChar[i] + key);
        }

        return String.valueOf(tempInt);
    }
}
