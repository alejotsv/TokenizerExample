package com.java21days;

import java.util.StringTokenizer;

public class Tokenizer {
    public static void main(String[] args) {
        StringTokenizer tokened1, tokened2;

        String str1 = "A Lannister always pays his debts.";
        String str2 = "Herecutiiscutiacutisentencecutiincutisecretcuticodecuti.";

        tokened1 = new StringTokenizer(str1);
        int tokenCount1 = tokened1.countTokens();
        System.out.println("The first phrase has " + tokenCount1 + " tokens");
        for (int i=1; i<=tokenCount1; i++) {
            System.out.println("Token " + i + ": " + tokened1.nextToken());
        }
    }
}
