package com.zipcodewilmington.assessment1.part2;

import com.zipcodewilmington.assessment1.part1.BasicStringUtils;

import java.text.BreakIterator;
import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {
       ArrayList<String> words = new ArrayList<>();

        BreakIterator breakIterator = BreakIterator.getWordInstance();
        breakIterator.setText(sentence);

        int lastIndex = breakIterator.first();

        while (BreakIterator.DONE != lastIndex) {
            int firstIndex = lastIndex;
            lastIndex = breakIterator.next();
            if (lastIndex != BreakIterator.DONE && Character.isLetterOrDigit(sentence.charAt(firstIndex))) {
                words.add(sentence.substring(firstIndex, lastIndex));
            }
        }

        return words.toArray(new String[0]);
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {

        return sentence.substring(0, sentence.indexOf(' '));
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {
        return BasicStringUtils.reverse(sentence.substring(0, sentence.indexOf(' ')));
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order and the first character capitalized
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {
        StringBuilder stringBuilder = new StringBuilder(sentence);

        String reverse = BasicStringUtils.reverse(stringBuilder.substring(0,sentence.indexOf(' ')));


        return BasicStringUtils.camelCase(reverse);
    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {
        StringBuilder stringBuilder = new StringBuilder(str);
         index = str.length() / index - 1;

        stringBuilder.deleteCharAt(index);

        return stringBuilder.toString() ;
    }

}
