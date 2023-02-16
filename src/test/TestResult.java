package test;

import domain.Exercise;

import java.util.Scanner;

public class TestResult {

    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scann.nextInt();

        Exercise.IsArmstrong(number);
    }
}
