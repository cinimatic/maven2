package com.techprimers.testing;

public class FizzBuzz {

    public static void main(int number) {

        if (number == 0) throw new IllegalArgumentException("Number must not be 0");
        if (number % 3 == 0) return "Fizz";
        if (number % 5 == 0) return "Buzz";
        
        System.out.println("Hello world!");
        
        //return String.valueOf(number);
    }
}
