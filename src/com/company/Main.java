package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int numberOfRows = scanner.nextInt();

        System.out.println("Enter the number of seats in each row");
        int numberOfSeats = scanner.nextInt();
        int totalNumberOfSeats= numberOfRows*numberOfSeats;
        int totalIncome;
        if(totalNumberOfSeats<60)
        {
            totalIncome=totalNumberOfSeats*10;
        }
        else {
            int frontHalfOfRows = numberOfRows/2;
            int backHalfOfRows = numberOfRows-frontHalfOfRows;

            totalIncome = frontHalfOfRows * numberOfSeats*10+ backHalfOfRows *numberOfSeats * 8;

        }
        System.out.println("$ "+totalIncome);
        }
    }

