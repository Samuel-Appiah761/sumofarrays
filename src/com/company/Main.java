package com.company;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        int[] a = {4, 6,1,8,3,7,9,0,10};
        int sum = IntStream.of(a).sum();
        System.out.println("The sum is " + sum);
}
}
