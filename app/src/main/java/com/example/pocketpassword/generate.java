package com.example.pocketpassword;
import java.util.Random;
import java.lang.Math;


public class generate {

    static String lowerAlpha = "abcdefghijklmnopqrstuvwxyz";
    String upperAlpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String digits = "0123456789";
    String specChars = "!@#$%^&*()_+~";

    public String genPass(){

        int lowerMax = lowerAlpha.length();
        int upperMax = upperAlpha.length();
        int digitMax = digits.length();
        int specMax = specChars.length();
        int min = 1;

        String passWord = "";

        while(passWord.length() < 8){
            if(passWord.length() % 2 == 0) {
                int x = (int) Math.floor(Math.random() * (lowerMax - min) + min);
                passWord += lowerAlpha.charAt(x);
            } else {
                int z = (int)Math.floor(Math.random() * (digitMax - min) + min);
                passWord += digits.charAt(z);
            }
        }

        for(int i = 0; i < 7; i++){
            if(i % 2 == 0) {
                int x = (int) Math.floor(Math.random() * (upperMax - min) + min);
                passWord += upperAlpha.charAt(x);
            } else {
                int z = (int)Math.floor(Math.random() * (specMax - min) + min);
                passWord += specChars.charAt(z);
            }
        }




        return passWord;
    }



}
