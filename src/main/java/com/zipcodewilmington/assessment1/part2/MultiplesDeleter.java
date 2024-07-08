package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        int countOdd = 0;

        for (int i : ints) {
            if (!(i % 2 == 0))
                ++countOdd;
        }
        Integer[] odd = new Integer[countOdd];

        int i = 0;
        for (int num : ints) {
            if (!(num % 2 == 0)) {

                odd[i++] = num;
            }


        }
        return odd;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        int countEven = 0;

        for (int i : ints) {
            if (!(i % 2 == 0))
                ++countEven;
        }
        Integer[] even = new Integer[countEven];

        int i = 0;
        for (int num : ints) {
            if (num % 2 == 0) {

                even[i++] = num;
            }


        }
        return even;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        int multiple = 0;

        for (int i : ints) {
            if (!(i % 3 == 0))
                multiple++;
        }
        Integer[] ofThree = new Integer[multiple];
        int i = 0;
        for (int num : ints) {
            if (num % 3 != 0) {

                ofThree[i++] = num;
            }


        }
        return ofThree;
    }

    /**
     * @param ints     array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
       return null;
    }
}