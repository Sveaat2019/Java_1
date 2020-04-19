package ru.geekbrains.java_one.lesson_c.online.HomeWork3;

import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {



    private static int fieldSizeY;
    private static int fieldSizeX;
    private static char[][] field;

    private static int vin = 4;
//    private static int xH, yH;      // необходимы для получения координат хода человека


    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();

    private static final char HUMAN_DOT = 'X';
    private static final char AI_DOT = 'O';
    private static final char EMPTY_DOT = '.';

    // init field
    private static void initMap() {
        fieldSizeY = 5;
        fieldSizeX = 5;
        field = new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = EMPTY_DOT;
            }
        }
    }

    // print field
    private static void printMap() {
        System.out.println("-------");
        for (int y = 0; y < fieldSizeY; y++) {
            System.out.print("|");
            for (int x = 0; x < fieldSizeX; x++) {
                System.out.print(field[y][x] + "|");
            }
            System.out.println();
        }
    }

    // human turn
    private static void humanTurn() {
        int x;
        int y;
        do {
            System.out.printf("Введите координаты хода X и Y (от 1 до 5) через пробел: ", fieldSizeX);
            x = SCANNER.nextInt() - 1;
//            xH = x;
            y = SCANNER.nextInt() - 1;
//            yH = y;
        } while (!(isEmptyCell(y, x) && isValidCell(y, x)));
        field[y][x] = HUMAN_DOT;
    }

    // is cell empty
    private static boolean isEmptyCell(int y, int x) {
        return field[y][x] == EMPTY_DOT;
    }

    // is cell valid
    private static boolean isValidCell(int y, int x) {
        return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
    }

    private static boolean isHumanTurn(int x, int y) {
        if (isValidCell(x, y)) return field[x][y] == HUMAN_DOT;
        return false;
    }

/*    // ai turn
    private static void aiTurn() {
        int x;
        int y;


//        System.out.println(xH + " " + yH + " " + counter);



        y = xH;
        x = yH;
        int counter_2 = 0;

        if ((counter > 10) && ((isHumanTurn(x - 1, y)) || (isHumanTurn(x + 1, y)) ||
                (isHumanTurn(x, y - 1)) || (isHumanTurn(x, y + 1)) || (isHumanTurn(x + 1, y + 1)) || (isHumanTurn(x - 1, y - 1)))) {



            for (int i = 0; i < fieldSizeX; i++) {
                if ((isHumanTurn(i, i)) && (isHumanTurn(i + 1, i + 1)) && (isValidCell(i + 2, i + 2))) {
                    if (isEmptyCell(i + 2, i + 2)) {
                        if (counter_2 == 0) {
                            field[i + 2][i + 2] = AI_DOT;
                            counter_2++; }
                    }
                } else if ((isHumanTurn(fieldSizeY - i, xH)) && (isHumanTurn(fieldSizeY - i - 1, xH + 1)) && (isValidCell(fieldSizeY - i - 2, xH + 2))) {
                    if (isEmptyCell(fieldSizeY - i - 2, xH + 2)) {
                        if (counter_2 == 0) {
                            field[fieldSizeY - i - 2][xH + 2] = AI_DOT;
                            counter_2++; }
                    }
                }
                else if ((isHumanTurn(i, fieldSizeX - xH)) && (isHumanTurn(i + 1, fieldSizeX - xH - 1)) && (isValidCell(i + 2, fieldSizeX - xH - 2))) {
                    if (isEmptyCell(i + 2, fieldSizeX - xH - 2)) {
                        if (counter_2 == 0) {
                            field[i + 2][fieldSizeX - xH - 2] = AI_DOT;
                            counter_2++; }
                    }
                }
                else if ((isHumanTurn(fieldSizeY - i, fieldSizeX - xH)) && (isHumanTurn(fieldSizeY - i - 1, fieldSizeX - xH - 1)) && (isValidCell(fieldSizeY - i - 2, fieldSizeX - xH - 2))) {
                    if (isEmptyCell(fieldSizeY - i - 2, fieldSizeX - xH - 2)) {
                        if (counter_2 == 0) {
                            field[fieldSizeY - i - 2][fieldSizeX - xH - 2] = AI_DOT;
                            counter_2++;
                        }
                    }
                }
            }
            for (int i = xH; i < counter + xH; i++) {
                if (((isHumanTurn(i - 1, y)) || (isHumanTurn(i + 1, y))) && (isValidCell(i - 2, y))) {
                    if (isEmptyCell(i - 2, y)) {
                        if (counter_2 == 0) {
                            field[i - 2][y] = AI_DOT;
                            counter_2 ++;
                        }

                    }
                } else if (((isHumanTurn(i - 1, y)) || (isHumanTurn(i + 1, y))) && (isValidCell(i + 2, y))) {
                    if (isEmptyCell(i + 2, y)) {
                        if (counter_2 == 0) {
                        field[i + 2][y] = AI_DOT;
                            counter_2 ++; }
                    }
                }
            }


                for (int j = yH; j < counter + yH; j++) {
                    if (((isHumanTurn(x, j - 1)) || (isHumanTurn(x, j + 1))) && (isValidCell(x, j - 2))) {
                        if (isEmptyCell(x, j - 2)) {
                            if (counter_2 == 0) {
                            field[x][j - 2] = AI_DOT;
                            counter_2++; }
                        }
                    } else if (((isHumanTurn(x, j - 1)) || (isHumanTurn(x, j + 1))) && (isValidCell(x, j + 2))) {
                        if (isEmptyCell(x, j + 2)) {
                            if (counter_2 == 0) {
                            field[x][j + 2] = AI_DOT;
                            counter_2++; }
                        }
                                }
                            }

                                  }

*/


    private static void aiTurn() {
        if  (aiStep()) {
        }
        else {
            aiAnyStep();
        }
    }


          private static boolean aiStep()
        {

            for (int i = 0; i < fieldSizeX; i++) {
                for (int j = 0; j < fieldSizeY; j++) {
                    if (field[i][j] == EMPTY_DOT) {
                        field[i][j] = AI_DOT;
                      //  System.out.println(i + "  " + j);
                        if (checkWin(AI_DOT)||checkForVin3(AI_DOT)) return true;
                        field[i][j] = HUMAN_DOT;
                        if (checkWin(HUMAN_DOT)||checkForVin3(HUMAN_DOT)) {field[i][j] = AI_DOT; return true;}
                        field[i][j] = EMPTY_DOT;
                    }
                }
            } return false;
        }

                       private static void aiAnyStep()
        {
            int x;
            int y;
            do {
                x = RANDOM.nextInt(fieldSizeX);
                y = RANDOM.nextInt(fieldSizeY);
            } while (!isEmptyCell(y, x));
            field[y][x] = AI_DOT;
        }






    /*
        // check win
       private static boolean checkWin(char c) {
            // hor
            if (field[0][0] == c && field[0][1] == c && field[0][2] == c) return true;
            if (field[1][0] == c && field[1][1] == c && field[1][2] == c) return true;
            if (field[2][0] == c && field[2][1] == c && field[2][2] == c) return true;

            //ver
            if (field[0][0] == c && field[1][0] == c && field[2][0] == c) return true;
            if (field[0][1] == c && field[1][1] == c && field[2][1] == c) return true;
            if (field[0][2] == c && field[1][2] == c && field[2][2] == c) return true;

            //dia
            if (field[0][0] == c && field[1][1] == c && field[2][2] == c) return true;
            if (field[0][2] == c && field[1][1] == c && field[2][0] == c) return true;
            return false;

        }
        */
/*
    private static boolean checkWin(char c) {
        // -------------------------------horizontal----------------------------------------


            int countPlay_1 = 0;
            int countPlay_2 = 0;
            int countPlay_3 = 0;
            int countPlay_4 = 0;





                for (int i = 0; i < fieldSizeX; i++) {
                    boolean flag_1 = true;
                    for (int j = 0; j < fieldSizeY && flag_1; j++) {
                        flag_1 = (field[i][j] == c);
                        if (flag_1) countPlay_1++;
                        if (countPlay_1 == vin) return true;



                    }
                }
                if (countPlay_1 > 0) countPlay_1--;


                //-------------------------------vertikal-------------------------------------------

                for (int i = 0; i < fieldSizeY; i++) {
                    boolean flag_2 = true;
                    for (int j = 0; j < fieldSizeX && flag_2; j++) {
                        flag_2 = (field[j][i] == c);
                        if (flag_2) countPlay_2++;
                        if (countPlay_2 == vin) return true;

                    }
                }
                if (countPlay_2 > 0) countPlay_2--;

                //-------------------------------diagonal_1-------------------------------------------

                boolean flag_3 = true;
                for (int i = 0; i < fieldSizeX && flag_3; i++) {
                    flag_3 = (field[i][i] == c);
                    if (flag_3) countPlay_3++;

                    if (countPlay_3 == vin) return true;


                }
                if (countPlay_3 > 0) countPlay_3--;

                //-------------------------------diagonal_2-------------------------------------------


                boolean flag_4 = true;
                for (int i = 0; i < fieldSizeY && flag_4; i++) {
                    flag_4 = (field[fieldSizeY - i - 1][i] == c);
                    if (flag_4) countPlay_4++;

                    if (countPlay_4 == vin) return true;

                }


             return false;
    }
*/


         private static boolean checkWin(char c) {      // проверка выигрыша для vin = 4
             for (int i = 0; i < fieldSizeX; i++)
             {
                 for (int j = 0; j < fieldSizeY; j++)
                 {
                     if ((i<(vin - 2))&&(field[i][j] == c)&&(field[i+1][j] ==c)&&(field[i+2][j]==c)&&(field[i+3][j]==c)) return true;
//                     else if ((i>(vin-2))&&(field[i][j] == c)&&(field[i-1][j] == c)&&(field[i-2][j] == c)&&(field[i-3][j] == c)) return true;
                     else if ((j<(vin -2))&&(field[i][j] == c)&&(field[i][j+1] ==c)&&(field[i][j+2]==c)&&(field[i][j+3]==c)) return true;
//                     else if ((j>(vin-2))&&(field[i][j] == c)&&(field[i][j-1] ==c)&&(field[i][j-2]==c)&&(field[i][j-3]==c)) return true;
                     else if ((j<(vin - 2))&&(i< (vin - 2))&&(field[i][j]==c)&&(field[i+1][j+1]==c)&&(field[i+2][j+2]==c)&&(field[i+3][j+3]==c)) return true;
//                     else if ((i == j)&&(i>(vin-2))&&(field[i][j]==c)&&(field[i-1][j-1]==c)&&(field[i-2][j-2]==c)&&(field[i-3][j-3]==c)) return true;
//                     else if ((i>3)&&(j<fieldSizeY - vin + 2)&&(field[i][j]==c)&&(field[i-1][j+1]==c)&&(field[i-2][j+2]==c)&&(field[i-3][j+3]==c)) return true;
                     else if ((i<(fieldSizeX-3))&&(j>(vin -2))&&(field[i][j]==c)&&(field[i+1][j-1]==c)&&(field[i+2][j-2]==c)&&(field[i+3][j-3]==c)) return true;

                 }
             }      return false;
         }


             private static boolean checkForVin3(char c) {
                 for (int i = 0; i < fieldSizeX; i++) {
                     for (int j = 0; j < fieldSizeY; j++) {
                         if ((i < (vin - 1)) && (field[i][j] == c) && (field[i + 1][j] == c) && (field[i + 2][j] == c))
                             return true;
                         else if ((j < (vin - 1)) && (field[i][j] == c) && (field[i][j + 1] == c) && (field[i][j + 2] == c))
                             return true;
                         else if ((j < (vin - 1)) && (i < (vin - 2)) && (field[i][j] == c) && (field[i + 1][j + 1] == c) && (field[i + 2][j + 2] == c))
                             return true;
                         else if ((i < (fieldSizeX - 2)) && (j > (vin - 1)) && (field[i][j] == c) && (field[i + 1][j - 1] == c) && (field[i + 2][j - 2] == c))
                             return true;
                     }
                 } return false;
             }




    // check draw
    private static boolean isMapFull() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (isEmptyCell(y, x)) return false;
            }
        }
        return true;
    }



    private static boolean gameChecks(char aiDot, String s) {
        if (checkWin(aiDot)) {
            System.out.println(s);
            return true;
        }
        if (isMapFull()) {
            System.out.println("draw!");
            return true;
        }
        return false;
    }


    public static void main(String[] args) {


        while (true) {
            initMap();
            printMap();
            while (true) {
                humanTurn();
                printMap();
                if (gameChecks(HUMAN_DOT, "Human win!")) break;
                aiTurn();
                printMap();
                if (gameChecks(AI_DOT, "AI win!")) break;

            }
            System.out.println("Play again?");
            if (!SCANNER.next().equals("Y"))
                break;
        }
        SCANNER.close();



    }


}
