package com.erikriosetiawan;

import java.util.ArrayList;
import java.util.List;

public class Result {

    public static int getTotalX(List<Integer> arr, List<Integer> brr) {
        List<Integer> factorialByArr = new ArrayList<>();

        for (int i = arr.get(arr.size() - 1); i <= brr.get(0); i++) {
            boolean isEvenAllNumbers = true;
            for (int j : arr) {
                if (i % j != 0) {
                    isEvenAllNumbers = false;
                    break;
                }
            }
            if (isEvenAllNumbers)
                factorialByArr.add(i);
        }

        List<Integer> factorial = new ArrayList<>();
        for (int i : factorialByArr) {
            boolean isFactorial = true;
            for (int j : brr) {
                if (j % i != 0) {
                    isFactorial = false;
                    break;
                }
            }
            if (isFactorial)
                factorial.add(i);
        }

        return factorial.size();
    }
}