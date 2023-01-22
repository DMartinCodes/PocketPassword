package com.example.pocketpassword;
import java.security.SecureRandom;
import java.lang.Math;


public class generate {

     char[] secChar = {'0','1','2','3','4','5','6','7','8','9',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
            'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
            'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
            'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
            'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '!', '"', '#',
            '$', '%', '&', '(', ')', '*', '+', ',', '-', '.',
            '/', ':', ';', '<', '=', '>', '?', '@', '[', ']', '^',
            '_', '`', '{', '|', '}', '~'};

    public String genPass(){

        String passWord = "";
        SecureRandom randomChar = new SecureRandom();

        while(passWord.length() < 15) {
            int ranIndex = randomChar.nextInt(secChar.length);
            char ranChar = secChar[ranIndex];
            passWord += ranChar;
        }

        return passWord;
    }



}
