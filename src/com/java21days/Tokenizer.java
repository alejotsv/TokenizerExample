package com.java21days;

import java.util.StringTokenizer;

public class Tokenizer {
    public static void main(String[] args) {
        StringTokenizer tokened1, tokened2;

        String str1 = "A Lannister always pays his debts.";
        String str2 = "Herecutiiscutiacutisentencecutiincutisecretcuticodecuti.";

        showTokens(str1);
    }

    static void showTokens(String str) {
        StringTokenizer stk = new StringTokenizer(str);
        int tokenCount = stk.countTokens();

        System.out.println("The phrase '" + str + "' has " + tokenCount + " tokens:");
        for (int i=1; i<=tokenCount; i++) {
            System.out.println("Token " + i + ": " + stk.nextToken());
        }
    }

    static void showTokens(String str, String token) {
        StringTokenizer stk = new StringTokenizer(str, token);
        int tokenCount = stk.countTokens();

        System.out.println("The phrase '" + str + "' has " + tokenCount + " tokens:");
        for (int i=1; i<=tokenCount; i++) {
            System.out.println("Token " + i + ": " + stk.nextToken());
        }
    }
}
