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
        int y = (int)Math.floor(Math.random() * (upperMax - min + 1) + min);
        passWord += upperAlpha.charAt(y);

        while(passWord.length() < 8){
            int x = (int)Math.floor(Math.random() * (lowerMax - min + 1) + min);
            passWord += lowerAlpha.charAt(x);
        }

        for(int i = 0; i < 2; i++){
            int z = (int)Math.floor(Math.random() * (digitMax - min + 1) + min);
            passWord += digits.charAt(z);
        }

        int w = (int)Math.floor(Math.random() * (specMax - min + 1) + min);
        passWord += specChars.charAt(w);


        return passWord;
    }



}
