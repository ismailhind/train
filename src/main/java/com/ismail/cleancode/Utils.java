package com.ismail.cleancode;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static ArrayList<Character> stringToArrayChar(String str) {

        List<Character> chars = new ArrayList<Character>();
        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }
        return (ArrayList<Character>) chars;
    }
}
