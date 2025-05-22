package com.arizonix.tutorial.dsa;

public class Complex {

    static void linearTime(){
        int array[] ={
                1,2,3,4,5
        };
        for(int i =0; i<array.length;i++){
            System.out.print((i+1) +" time \t");
            System.out.println(array[i]+ " ");
        }//O(n)
    }
    static void constantTime(){
        int array[] ={
                1,2,3,4,5
        };
        System.out.println(array[0]);
    }

    public static void main(String[] args) {
        //constantTime();//O(1)
        linearTime();
    }
}
