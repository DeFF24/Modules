package main;

import java.util.Scanner;

import static practice3.hw1.Task1.*;
import static practice3.hw2.Task2.*;
import static practice3.hw3.Task3.*;
import practice4.Arrays;
import static practice6.Task1.*;
import practice6.Box;
import static practice6.Task3.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Practice 3, Task 1:");
        System.out.println(sumNums("itt2sw13s"));
        System.out.println("Practice 3, Task 2:");
        System.out.println(countChars("itt2sw13s"));
        System.out.println("Practice 3, Task 3:");
        System.out.println("Кінець урока: " + getTime(4));

        System.out.println("Practice 4, Task 1:");
        Arrays.task1();
        System.out.println("Practice 4, Task 2:");
        Arrays.task2();
        System.out.println("Practice 4, Task 3:");
        Arrays.task3();
        System.out.println("Practice 4, Task 4:");
        Arrays.task4();
        System.out.println("Practice 4, Task 5:");
        Arrays.task5();

        System.out.println("Practice 6, Task 1:");
        System.out.println(pow(5));
        System.out.println(reverseString("Hello"));
        System.out.println("Practice 6, Task 2:");
        Box box1 = new Box();
        System.out.println(box1.value);
        box1.value = 20;
        System.out.println(box1.value);
        System.out.println("Practice 6, Task 3:");
        Box box2 = new Box(30);
        System.out.println(box2.value);
        System.out.println("Practice 6, Task 4:");
        System.out.println(recursiveMultiplication(5, 7));
    }
}
