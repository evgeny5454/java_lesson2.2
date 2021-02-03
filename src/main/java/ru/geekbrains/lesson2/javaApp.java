package ru.geekbrains.lesson2;

import java.util.Arrays;

public class javaApp {

    public static void main(String[] args) {

        System.out.println("Задание 1");
        int [] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Длина масива = "+ array.length+"\n"+"Масив входные данные\n" +
                "[1, 1, 0, 0, 1, 0, 1, 1, 0, 0]");
        // с помшью цикла и условия меняем 0 на 1
        for (int i = 0; i < array.length; i++){
            if (array[i] != 0){
                array[i] = 0;
            } else{
                array[i] = 1;
            }
        }
        System.out.println("Замена 0 на 1\n"+Arrays.toString(array));
        System.out.println("");
        /*
        Задание номер 2 Задать пустой целочисленный массив размером 8.
        С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
         */
        System.out.println("Задание 2");
        array8();
        /*
        Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        пройти по нему циклом, и числа меньшие 6 умножить на 2;
         */
        System.out.println("");
        System.out.println("Задание 3");
        exempl3();
        System.out.println("");
        System.out.println("Задание 4");
        exempl4();

    }

    // метод для решения 2 задачи
    public static void array8(){

        int [] arr = new int [8];
            for (int i = 0; i < 8 ; i++){
                arr[i] = i * 3;
                System.out.println("arr" + i + " = " + arr[i] );
            }
        System.out.println("");
        System.out.println("Печать масива в строку\n"+Arrays.toString(arr));
    }

    public static void exempl3(){
        int result = 0;
        int [] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println("Заданный масив\n"+Arrays.toString(array));

        for (int i = 0; i < array.length; i++){
            if (array[i] < 6){
                int newValue = array[i] * 2 ;
                array[i] = newValue;
            }
         }
        System.out.println("Результат\n"+Arrays.toString(array));
    }

    public static void exempl4() {
        int newValue = 1 ;
        int[][] table = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                if (i == j){
                    //int newValue = 1 ;
                    table[i][j] = newValue;
                } else {
                    table[0][3] = newValue;
                    table[1][2] = newValue;
                    table[2][1] = newValue;
                    table[3][0] = newValue;
                }

                System.out.print(table[i][j] + "    ");
            }
            System.out.println();
        }

    }

}

