package meituan.nipx.cn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author NipGeihou
 * @create 2021-08-22 10:19
 */
public class Two {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuffer sb = new StringBuffer("abcdefghijklmnopqrstuvwxyz");
        StringBuilder s = new StringBuilder(br.readLine());


        String line = br.readLine();
        int n = Integer.parseInt(line);
        while (n > 0) {
            line = br.readLine();
            String[] arr = line.split(" ");

            // 如果opt=1，接下来有一个小写字母，表示小美将要往s末尾添加该小写字母。如果opt=2，表示一次问题描述中的询问
            switch (arr[0]) {
                case "1":
                    s.append(arr[1]);
                    break;
                case "2":
                    //    寻找给出位置（1开始）的字母最近的相同字母
                    int pos1Index = Integer.parseInt(arr[1]) - 1;


                    char curr = s.charAt(pos1Index);
                    // 找左边
                    int leftDist = 0;
                    boolean leftFlag = false;
                    for (int i = pos1Index - 1; i >=0 ; i--) {
                        leftDist++;
                        if (s.charAt(i) == curr) {
                            // 找到字母，结束循环
                            leftFlag = true;
                            break;
                        }
                    }

                    int rightDist = 0;
                    boolean rightFlag = false;
                    // 找右边
                    for (int i = pos1Index + 1; i < s.length(); i++) {
                        rightDist++;
                        if (s.charAt(i) == curr) {
                            // 找到字母，结束循环
                            rightFlag = true;
                            break;
                        }
                    }

                    // 最近距离
                    int minDist = s.length();
                    if (leftFlag) {
                        minDist = leftDist;
                    }

                    if (rightFlag && rightDist < minDist) {
                        minDist = rightDist;
                    }

                    if (leftFlag || rightFlag) {
                        System.out.println(minDist);
                    } else {
                        System.out.println(-1);
                    }


                default:
            }



            n--;
        }

    }
}
