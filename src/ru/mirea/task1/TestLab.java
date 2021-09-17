package ru.mirea.task1;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class TestLab
{
    public static void sumFOR(int[] arr)
    {
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        System.out.println(sum);
    }
    public static void sumWhile(int [] arr)
    {
        int sum = 0, i = 0;
        while (i < arr.length)
        {
            sum += arr[i];
            i++;
        }
        System.out.println(sum);
    }
    public static void sumDoWhile(int [] arr)
    {
        int sum = 0, i = 0;
        do
        {
            i++;
            sum += arr[i-1];
        }
        while (i < arr.length);
        System.out.println(sum);
    }
    public static  void HarmSer()
    {
        double sum = 0;
        for(int i = 1; i < 11; i++)
        {
            System.out.println(1.0/(i));
        }
    }
    public static void fact(int n)
    {
        int x = 1;
        for (int i = 1; i <=n; i ++)
        {
            x = x*i;
        }
        System.out.println(x);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] array = new String[5];
        int size = 5;
        for(int i = 0; i < size; i++)
        {
            array[i] = sc.nextLine();
        }
        for(int i = 0; i < size; i++)
        {
            System.out.println(array[i]);
        }

        int SIZE = 10;
        int[] arr = new int[SIZE];
        for(int i = 0; i < SIZE; i++)
        {
            arr[i] = (int) (Math.random()*1000);
            System.out.println(i + 1 + ")" + arr[i]);
        }
        Arrays.sort(arr);
        System.out.println("-----");
        for(int i = 0; i < SIZE; i++)
        {
            System.out.println(i + 1 + ")" + arr[i]);
        }
        System.out.println("---------------");
        Random foo = new Random();

        for(int i = 0; i < SIZE; i++)
        {
            arr[i] = foo.nextInt(1000);
            System.out.println(i + 1 + ")" + arr[i]);
        }
        Arrays.sort(arr);
        System.out.println("-----");
        for(int i = 0; i < SIZE; i++)
        {
            System.out.println(i + 1 + ")" + arr[i]);
        }

        //-----------------------------------------------
        int nums[] = {0,1,2,3,4,5,6,7,8,9};
        sumFOR(nums);
        sumWhile(nums);
        sumDoWhile(nums);
        HarmSer();
        fact(10);

    }

}
