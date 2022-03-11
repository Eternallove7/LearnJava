package com.study;

public class recursion {
    public static void main(String[] args) {
        recursion re = new recursion();
        int result = re.Fibonacci(7);
        System.out.println(result);
    }

    public int Fibonacci(int n){
        if (n == 1){
            return 1;
        } else if (n == 2){
            return 1;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }
}


