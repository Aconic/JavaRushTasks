package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        int res = 1;
        int i = 1;
        while (i <= 10)
        {
            res *= i;
            i++;
        }
        System.out.println(res);
    }
}
