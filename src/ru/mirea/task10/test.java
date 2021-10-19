package ru.mirea.task10;


import java.util.Scanner;

public class test {

    public void specifiedSumOfDigits() {
    }


    private static boolean HIP = false;
    private static boolean IP = true;
    static Scanner sc = new Scanner(System.in);
    static int div = sc.nextInt();
    private static int sum = 0;

    public static void sumOfDigit(int N) {
        sum += N % 10;
        N /= 10;
        N = (int) Math.floor(N);

        if (N != 0) sumOfDigit(N);
        else System.out.println(sum);
    }

    public static void IP(boolean TF, boolean H) {
        if (!H) {
            if (TF == true) {
                System.out.println("Yes");
            } else {
                System.out.println("NO");
            }

        }

    }

    public static void isPrime(int N) {
        div--;
        if (((N % div) == 0) & (div > 1)) {
            IP = false;
        } else if (((N % div) != 0) & (div > 1)) {
            isPrime(N);
        }
        IP(IP, HIP);
        HIP = true;
    }

    public static void factorization(int n, int k) {
        if (k > n / 2) {
            System.out.println(n);
            return;
        }
        if (n % k == 0) {
            System.out.println(k);
            factorization(n / k, k);
        } else {
            factorization(n, ++k);
        }
    }

    public static String isPalindrom(String str) {
        if (str.length() == 1) {
            return "YES";
        } else {//сравниваем первый и последний элемент до тех пор, пока не останется 2 элемента
            if (str.substring(0, 1).equals(str.substring(str.length() - 1, str.length()))) {
                if (str.length() == 2) {
                    return "YES";
                }
                return isPalindrom(str.substring(1, str.length() - 1));
            } else {
                return "NO";
            }
        }
    }
    public static int recursion(int a, int b) {
        if (a > b + 1) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return recursion(a, b - 1) + recursion(a - 1, b - 1);
    }
    public static void main(String args[]) {
        System.out.print("sum of digit 645789: ");
        sumOfDigit(645789);
        System.out.print("is prime num \'"+ div +"\': ");
        isPrime(div);
        System.out.println("factorization of 628: ");
        System.out.println("-");
        factorization(628,2);
        System.out.println("-");
        System.out.println("isPalinrom \'довод\' : " + isPalindrom("довод"));
        System.out.println("isPalinrom \'доводы\' : " + isPalindrom("доводы"));
        System.out.println("without two zeros \'3, 8\' :" + recursion(3, 8));
        //https://ru.hexlet.io/blog/posts/bez-dvuh-nuley
    }
}
