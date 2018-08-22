package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for(int i = 0; i < 1000; i++){
            if(i%5==0){
                System.out.println("* "+i);
                for(int j = i+1; j < i+5; j++){
                    if(j%2==0){
                        System.out.println("*** "+j);
                    }
                }
            }
        }
    }
}
