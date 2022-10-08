package com.java21days;

import java.util.StringTokenizer;

public class Tokenizer {
    public static void main(String[] args) {
        StringTokenizer tokened1, tokened2;

        String str1 = "A Lannister always pays his debts.";
        String str2 = "Here/is/another/phrase.";

        showTokens(str1);
        showTokens(str2, "/");
    }

    static void showTokens(String str) {
        StringTokenizer stk = new StringTokenizer(str);
        int tokenCount = stk.countTokens();

        System.out.println("The phrase '" + str + "' has " + tokenCount + " tokens:");
        for (int i=1; i<=tokenCount; i++) {
            System.out.println("Token " + i + ": " + stk.nextToken());
        }
    }

    static void showTokens(String str, String delim) {
        StringTokenizer stk = new StringTokenizer(str, delim);
        int tokenCount = stk.countTokens();

        System.out.println("The phrase '" + str + "' has " + tokenCount + " tokens:");
        for (int i=1; i<=tokenCount; i++) {
            System.out.println("Token " + i + ": " + stk.nextToken());
        }
    }
}
