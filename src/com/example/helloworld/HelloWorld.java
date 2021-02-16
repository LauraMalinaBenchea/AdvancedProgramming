package com.example.helloworld;


public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String[] languages = {"C", "C++", "C#", "Phyton", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        int n = (int) (Math.random() * 1_000_000);
        n = n * 3;
        n = n + Integer.parseInt("10101", 2);
        n = n + Integer.parseInt("FF", 16);
        n = n * 6;
        while(n >= 10){
            int sum = 0, variable = n;
            while(variable > 0){
                sum += variable%10;
                variable /= 10;
            }
            n = sum;
        }
        System.out.print("Willy-nilly, this semester I will learn ");
        System.out.print(languages[n]);
    }
}
