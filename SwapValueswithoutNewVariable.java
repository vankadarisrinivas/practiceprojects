package org.example;

public class SwapValueswithoutNewVariable {
        public static void main(String[] args) {
            int a = 10;
            int b = 7;

            // Swapping values without using a third variable
            a = a + b; // a now becomes 15
            b = a - b; // b now becomes 5 (original value of a)
            a = a - b; // a now becomes 10 (original value of b)

            System.out.println("After swapping:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }


}
