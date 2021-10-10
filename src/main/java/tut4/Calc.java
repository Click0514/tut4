package tut4;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        System.out.println("请输入第一个数：");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("请输入第二个数：");
        Scanner newscanner = new Scanner(System.in);
        int b = newscanner.nextInt();
        int sum = add(a,b);
        int difference = subtract(a,b);
        System.out.println(sum);
        System.out.println(difference);
    }

    public static int add(int a, int b) {
        return a+b;
    }

    public static int subtract(int a, int b) {
        return a+b;
    }

}
