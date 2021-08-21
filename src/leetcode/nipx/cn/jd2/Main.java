package leetcode.nipx.cn.jd2;

import java.util.Scanner;

/**
 * @author NipGeihou
 * @create 2021-08-21 19:36
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        sc.next();

        System.out.println(number);

        String s = sc.nextLine();

        System.out.println(0);
        for (int i = 0; i < number; i++) {
            String substring = s.substring(i);
            System.out.println(substring);

        }

    }
}
