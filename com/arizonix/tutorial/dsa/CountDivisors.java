package com.arizonix.tutorial.dsa;

public class CountDivisors {
    // Helper method to count divisors of a number
    private static int maxDivisorsFinder(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (i == n / i)
                    count += 1; // perfect square
                else
                    count += 2; // pair of divisors
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int maxDivisors = 0;
        int numberWithMaxDivisors = 0;

        for (int i = 1; i <= 10000 ; i++) {
            int divisorCount = maxDivisorsFinder(i);
            if (divisorCount > maxDivisors) {
                maxDivisors = divisorCount;
                numberWithMaxDivisors = i;
            }
        }

        System.out.println("Number with the most divisors between 1 and 10000: " + numberWithMaxDivisors);
        System.out.println("Number of divisors: " + maxDivisors);
    }
}
