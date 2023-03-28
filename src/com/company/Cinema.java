package com.company;

import java.util.Scanner;

public class Cinema {

    private static char[][] cinemaHall;
    static  Scanner scanner =new Scanner(System.in);
public static void createCinema()
{
    System.out.println("Enter the number of rows");
    int numberOfRows = scanner.nextInt();

    System.out.println("Enter the number of seats in each row");
    int numberOfSeats = scanner.nextInt();

    for (int i = 0; i <numberOfRows ; i++) {
        for (int j = 0; j < numberOfSeats; j++) {
            cinemaHall[i][j] ='S';

        }

    }

}
public static void printCinemaHall()
{
    System.out.println("cinema");
    System.out.print(" ");
    for (int i = 1; i <= cinemaHall[0].length;  i++) {
        System.out.print(" "+i);

    }
    System.out.println();
    for (int i = 0; i < cinemaHall.length; i++) {
        System.out.print(i+1);
        for (int j = 0; j < cinemaHall[0].length; j++) {
            System.out.print(" "+cinemaHall[i][j]);

        }
        System.out.println();

    }
}
public   static void takeTicket(){
//        System.out.println("Enter a row number");
//        int seatRow = scanner.nextInt();
//        System.out.println("Enter a seat number in that row :");
//        int seatNumber = scanner.nextInt();
//        cinemaHall[seatRow-1][seatNumber-1] ='B';
}
  public static void main(String[] args) {

        createCinema();
        int command;
        do{
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("0. Exit");
            command =scanner.nextInt();
        }
        while (command != 0);
        switch (command)
        {
            case 1:
                printCinemaHall();
                break;

            case 2:
                takeTicket();
            case 0:
                break;

            default:
                System.out.println("Wrong command");
                break;


        }
    }
}
