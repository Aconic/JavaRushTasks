package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] arr = {"","понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
        if (num < 1 || num > 7)
        {
            System.out.println("такого дня недели не существует");
        }
        else
        {
            System.out.println(arr[num]);
        }
    }
}