package com.arizonix.tutorial.dsa;

public class Recursion {
/*
    //Tail recursion
    static void fun1(int n){
        if(n ==0)
            return;
        System.out.print(n +" ");
        fun1(n-1);
    }

    //Head recursion
    static void fun2(int n){
        if(n ==0)
            return;
        fun2(n-1);
        System.out.print(n +" ");

    }

    //Linear recursion (adding n natural numbers)
    static int fun3(int n){
        if(n <=0)
            return 0;
        return (n + fun3(n-1));//head recursion

    }

    //Tree recursion (fibonacci series)
    static int fun4(int n){
        if(n ==0)
            return 0;
        if(n ==1)
            return 1;
        return fun4(n-1) + fun4(n-2);
    }

    //convert Decimal to Binary
    static void toBinary(int decimal){
        if (decimal==0)
            return;
        toBinary(decimal/2);
        System.out.print(decimal%2);
        //Shortcut with method
        //String binary = Integer.toBinaryString(decimal);
        //System.out.println(binary);
    }

    //convert Binary to Decimal
    static void toDecimal(int binary) {
        //My process
        String numTOStr = Integer.toString(binary);
        int num = 0;
        for (int i = 0; i < numTOStr.length(); i++) {
            int pow = numTOStr.length() - 1 -i;
            num += Character.getNumericValue(numTOStr.charAt(i)) * Math.pow(2, pow);
        }
        System.out.println(num);

        //Shortcut with method
        //int decimal = Integer.parseInt(Integer.toString(binary), 2);
        //System.out.println(decimal);
    }

    static int toDecimalRecursive(int binary,int index) {
        String strBinary =  Integer.toString(binary);
        if (index == strBinary.length()) {
            return 0;
        }

        int bit = Character.getNumericValue(strBinary.charAt(index));
        int power = strBinary.length() - 1 - index;

        return ((bit * (int)Math.pow(2, power)) + toDecimalRecursive(binary, index+1));
    }



 */
    static void reverseNumber(int num){
        if (num == 0)
            return;
        System.out.print (num%10);
        reverseNumber(num/10);
    }

    public static void main(String[] args) {
        //fun2(5);
        //System.out.println(fun4(4));
        //toBinary(4);
        //toDecimal(100);
        //System.out.println(toDecimalRecursive(100,0));
        reverseNumber(5463010);
    }
}
