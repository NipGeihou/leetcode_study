package exam.nipx.cn.alibaba;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * 轮流出最小的时候，得最小
 *
 * @author NipGeihou
 * @create 2021-08-23 18:58
 */
public class A {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        line = br.readLine();
        // n张牌
        int n = Integer.parseInt(line);

        ArrayList<Integer> integers = new ArrayList<>(n * 3);

        // 取三个人的牌
        for (int i = 0; i < 3; i++) {
            line = br.readLine();
            String[] paiList = line.split(" ");
            for (int j = 0; j < n; j++) {
                integers.add(Integer.parseInt(paiList[j]));
            }
        }



        int sum = 0;

        integers.sort(Comparator.comparingInt(o -> o));

        for (int i = 0; i < n; i++) {

            sum += integers.get(i);
        }

        System.out.println(sum);
    }


}
