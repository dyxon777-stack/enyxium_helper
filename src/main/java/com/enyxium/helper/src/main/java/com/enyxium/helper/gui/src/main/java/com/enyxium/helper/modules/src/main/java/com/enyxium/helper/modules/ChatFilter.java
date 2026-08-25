package com.enyxium.helper.modules;

import java.util.Arrays;
import java.util.List;

public class ChatFilter {
    private static final List<String> BLACKLIST = Arrays.asList("блять", "пидор", "еблан", "сука", "хуй");
    public static boolean containsBadWords(String message) {
        if (message == null || message.isEmpty()) return false;
        String clean = message.toLowerCase().replaceAll("[^a-zA-Zа-яА-Я0-9]", "");
        for (String word : BLACKLIST) {
            if (clean.contains(word)) return true;
        }
        return false;
    }
}
