package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sofsquares=0;
        int squaresum=0;

        sofsquares = sumofsquaresmethod();
        squaresum = squaresummethod();
      //  System.out.println(sofsquares);
       // System.out.println(squaresum);
        System.out.println(squaresum-sofsquares);
    }

    private static int sumofsquaresmethod() {
        int sqauaresum=0;
        for (int i =1 ; i<=10; i++){
            sqauaresum += i*i;
        }

        return sqauaresum;
    }

    private static int squaresummethod() {
        int sum =0;
        for (int i =1 ; i<=10; i++){
            sum += i;
        }

        return sum*sum;
    }
}
