package com.example.helloworld;


public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        //creez vectorul languages
        String[] languages = {"C", "C++", "C#", "Phyton", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        //aleg o variabila la intamplare
        int n = (int) (Math.random() * 1_000_000);
        //efectuez operatiile cerute
        n = n * 3;
        n = n + Integer.parseInt("10101", 2);
        n = n + Integer.parseInt("FF", 16);
        n = n * 6;
        //calculez sumele cerute
        while(n >= 10){
            int sum = 0, variable = n;
            while(variable > 0){
                sum += variable%10;
                variable /= 10;
            }
            n = sum;
        }
        //afisam textul
        System.out.print("Willy-nilly, this semester I will learn ");
        System.out.print(languages[n]);
    }
}
