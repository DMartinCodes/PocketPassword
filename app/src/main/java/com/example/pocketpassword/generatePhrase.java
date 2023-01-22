package com.example.pocketpassword;

import java.security.SecureRandom;

public class generatePhrase {

    String[] commonWords = {"the", "be", "to", "of", "and", "a", "in", "that", "have", "I", "it", "for", "not", "on", "with", "he", "as", "you", "do", "at", "this", "but", "his", "by", "from", "they", "we", "say", "her", "she", "or", "an", "will", "my", "one", "all", "would", "there", "their", "what",
            "so", "up", "out", "if", "about", "who", "get", "which", "go", "me", "when", "make", "can", "like", "time", "no", "just", "him", "know", "take", "person", "into", "year", "your", "good", "some", "could", "them", "see", "other", "than", "then", "that", "now", "look", "only", "come", "its",
            "over", "think", "also", "back", "after", "use", "two", "how", "our", "work", "first", "well", "way", "even", "new", "want", "because", "any", "these", "give", "day", "most", "us", "amor", "bellum", "civis", "deus", "exemplum", "familia", "gladius", "homo", "ignis", "jus", "libertas", "magister",
            "nauta", "opus", "pax", "rex", "salus", "tempus", "ursus", "ventus", "via", "vita", "amour", "arbre", "chat", "chapeau", "cheval", "ciel", "coeur", "couleur", "dame", "danse", "deux", "doigt", "enfant", "etoile", "fleur", "froid", "gentil", "homme", "jardin", "joli", "jour", "lait", "lampe",
            "livre", "maison", "maman", "mer", "miel", "neige", "noir", "nuit", "oeil", "oiseau", "or", "pain", "pays", "petit", "pomme", "poule", "poussin", "prairie", "rouge", "soleil", "tigre", "toi", "train", "verre", "vert", "ville"
    };

    char[] nums = {'0','1','2','3','4','5','6','7','8','9'};
    char[] specChars = {'!', '"', '#',
            '$', '%', '&', '(', ')', '*', '+', ',', '-', '.',
            '/', ':', ';', '<', '=', '>', '?', '@', '[', ']', '^',
            '_', '`', '{', '|', '}', '~'};

    public String genPhrase(){

        SecureRandom randomString = new SecureRandom();

        StringBuilder phrase = new StringBuilder();

        for(int i = 0; i < 3; i++){
            int ranIndex = randomString.nextInt(commonWords.length);
            phrase.append(commonWords[ranIndex]);
        }

        String passPhrase = phrase.toString();

        SecureRandom randomInt = new SecureRandom();


        if(passPhrase.length() < 15){
            int diff = 15 - passPhrase.length();
            for (int i = 0; i < (diff - 1); i++){
                int ranIndex = randomInt.nextInt(nums.length);
                char ranInt = nums[ranIndex];
                passPhrase += ranInt;
            }
            SecureRandom randomChar = new SecureRandom();
            int ranIndex = randomChar.nextInt(specChars.length);
            char ranChar = specChars[ranIndex];
            passPhrase += ranChar;
        }



        return passPhrase;
    }
}
