package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int col, row, count = 0;
        int p1 = 79, p2 = 88 , i;
        int num;
        int arr[][] = new int[3][3];
        boolean winCheck = false;
        for ( i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = (int)Math.random()*10;
            }

        }
        System.out.println("00          |01           |02          ");
        System.out.println("------------ ------------- ------------");
        System.out.println("10          |11           |12          ");
        System.out.println("------------ ------------- ------------");
        System.out.println("20          |21           |22          ");
        // taking user input


            for ( i = 0; i < 9; i++) {
                boolean check = false;
                if (count % 2 == 0) {
                    System.out.println("Player 1's turn");
                    num = p1;
                } else {
                    System.out.println("Player 2's turn");
                    num = p2;
                }

                System.out.print("enter column number");
                col = scan.nextInt();
                System.out.print("enter row number");
                row = scan.nextInt();

                if (arr[col][row] == 79 || arr[col][row] == 88) {
                    System.out.println("OOPS------!    someone already enter in the spot select other location");
                    check = true;

                } else {
                    arr[col][row] = num;

                }
                System.out.println((char) arr[0][0] + "          |" + (char) arr[0][1] + "           |" + (char) arr[0][2] + "          ");
                System.out.println("----------- ------------ ------------");
                System.out.println((char) arr[1][0] + "          |" + (char) arr[1][1] + "           |" + (char) arr[1][2] + "          ");
                System.out.println("----------- ------------ ------------");
                System.out.println((char) arr[2][0] + "          |" + (char) arr[2][1] + "           |" + (char) arr[2][2] + "          ");
                if (check) {
                    i--;
                } else {
                    count++;
                }
               // check answer
                if((arr[0][0] == arr[0][1] && arr[0][1] == arr[0][2]) || (arr[0][0] == arr[1][0] && arr[1][0] == arr[2][0] ) ){
                    if(arr[0][0] == 79){
                        System.out.println("player 1 wins");
                        winCheck = true;}
                    else if(arr[0][0] == 88){
                        System.out.println("player 2 wins");
                        winCheck = true;}
                    }

                if(arr[1][0] == arr[1][1] && arr[1][1] == arr[1][2]){
                    if(arr[1][0] == 79){
                        System.out.println("player 1 wins");
                        winCheck = true;}
                    else if(arr[1][0] == 88){
                        System.out.println("player 2 wins");
                        winCheck = true;}
                }
               if(arr[2][0] == arr[2][1] && arr[2][1] == arr[2][2]){
                    if(arr[2][0] == 79){
                        System.out.println("player 1 wins");
                        winCheck = true;}
                    else if(arr[2][0] == 88){
                        System.out.println("player 2 wins");
                        winCheck = true;}
                }
                if((arr[0][1] == arr[1][1] && arr[1][1] == arr[2][1])) {
                    if (arr[0][1] == 79){
                        System.out.println("player 1 wins");
                        winCheck = true;}
                    else if (arr[0][1] == 88){
                        System.out.println("player 2 wins");
                        winCheck = true;}
                }
                    if(arr[0][2] == arr[1][2] && arr[1][2] == arr[2][2]){
                     if(arr[0][2] == 79){
                        System.out.println("player 1 wins");
                        winCheck = true;}
                     else if(arr[0][2] == 88){
                        System.out.println("player 2 wins");
                        winCheck = true;}
                    }
                if(arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2]){
                    if(arr[0][0] == 79)
                    {System.out.println("player 1 wins");
                    winCheck = true;}
                    else if(arr[0][0] == 88)
                    { System.out.println("player 2 wins");
                    winCheck = true;}
                }
                if(arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0]){
                    if(arr[0][2] == 79){
                        System.out.println("player 1 wins");
                    winCheck = true;}
                    else if(arr[0][2] == 88){
                        System.out.println("player 2 wins");
                    winCheck = true;
                    }
                }

                if(winCheck)
                    break;

            }
        if (winCheck == false)
            System.out.println("it is a Draw");
        }
    }

