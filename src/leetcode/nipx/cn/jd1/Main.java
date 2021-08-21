package leetcode.nipx.cn.jd1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author NipGeihou
 * @create 2021-08-21 19:35
 */
public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        sc.nextLine();

        int minX = 0;
        int minY = 0;
        int maxX = 99;
        int maxY = 999;

        int[][] location = new int[maxX+1][maxY+1];

        List<Home> homeList = new ArrayList<>();

        // 录入数据
        for (int i = 0; i < number; i++) {
            String lineString = sc.nextLine();
            String[] arr = lineString.split(" ");
            location[Integer.parseInt(arr[0]) - 1][Integer.parseInt(arr[1]) - 1] = 1;
            homeList.add(new Home(Integer.parseInt(arr[0]) - 1, Integer.parseInt(arr[1]) - 1));
        }
        int nextX;
        int nextY;

        int result = 0;
        for (Home home : homeList) {
            // 穷举

            nextX = home.getX();
            nextY = home.getY();
            while (true) {
                // 找左下角
                nextX--;
                nextY++;
                if (nextX >= minX && nextY <= maxY) {
                    if (location[nextX][nextY] == 1) {
                        result++;
                    }
                } else {
                    // 到头了
                    break;
                }
            }

            nextX = home.getX();
            nextY = home.getY();
            while (true) {
                // 找右下角
                nextX++;
                nextY++;
                if (nextX <= maxX && nextY <= maxY) {
                    if (location[nextX][nextY] == 1) {
                        result++;
                    }
                } else {
                    // 到头了
                    break;
                }
            }


        }


        System.out.println(result);

    }
}


class Home {
    private int x;
    private int y;

    public Home(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}