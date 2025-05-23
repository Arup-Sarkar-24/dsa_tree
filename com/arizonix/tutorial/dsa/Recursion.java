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
        String strBinary = Integer.toString(binary);
        if (index == strBinary.length()) {
            return 0;
        }

        int bit = Character.getNumericValue(strBinary.charAt(index));
        int power = strBinary.length() - 1 - index;

        return ((bit * (int)Math.pow(2, power)) + toDecimalRecursive(binary, index+1));
    }

    static void reverseNumber(int num){
        if (num == 0)
            return;
        System.out.print (num%10);
        reverseNumber(num/10);
    }

    //without recursion
    static void reverseNumWithStr(int num){
       String numStr = Integer.toString(num);
       String newNumStr ="";
       for(int i = numStr.length() -1; i>=0; i--){
           newNumStr+=numStr.charAt(i);
       }
        System.out.println(Integer.parseInt(newNumStr));
    }

    //with recursion
    static String reverseNumWithStr(int num,int index){
        //String numStr = Integer.toString(num);
        String numStr = ""+num;
        index = numStr.length()-1;
        if (index == 0)
            return (""+numStr.charAt(0));

        String newNumStr ="";
        newNumStr +=numStr.charAt(index);
        return (newNumStr+reverseNumWithStr(num/10,(index-1)));
    }

    //String reverse
    static void reverseStrWithRecr(int num ,int index ){
        String inp =""+num;
        if (index == inp.length())
            return;
        reverseStrWithRecr(num,index+1);
        String res ="";
        res = res+inp.charAt(index);
        System.out.print(res);
    }

 */

    //Array reverse
    static void reverseArrWithRecur(char[] arr  ) {
        recur(arr , 0);
    }

    static void recur(char[] arr, int index){
        if (index == arr.length/2)
            return;
        swap(arr,index,arr.length-index-1);
        recur(arr,index+1);
    }

    static void swap(char[] arr, int i1, int i2){
        char temp = arr[i1];
        arr[i1]=arr[i2];
        arr[i2] =temp;
    }


    public static void main(String[] args) {
        //fun2(5);
        //System.out.println(fun4(4));
        //toBinary(4);
        //toDecimal(100);
        //System.out.println(toDecimalRecursive(100,0));
        //reverseNumber(-19);
        //reverseNumWithStr(654);
        //System.out.println();
        //reverseStrWithRecr(600,0);
        char[] arr = {'A','R','U','P'};
        reverseArrWithRecur(arr);
        System.out.print(arr);
    }
}
