package exam.nipx.cn.alibaba;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @author NipGeihou
 * @create 2021-08-23 19:36
 */
public class B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        line = br.readLine();
        String[] temps;

        int n, m, p;
        temps = line.split(" ");
        n = Integer.parseInt(temps[0]);
        m = Integer.parseInt(temps[1]);
        p = Integer.parseInt(temps[2]);

        // 存水量
        line = br.readLine();
        temps = line.split(" ");
        int[] waterList = new int[n];
        for (int i = 0; i < temps.length; i++) {
            waterList[i] = Integer.parseInt(temps[i]);
        }

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            line = br.readLine();
            temps = line.split(" ");

            map.put(temps[0] + temps[1], Integer.parseInt(temps[2]));
            map.put(temps[1] + temps[0], Integer.parseInt(temps[2]));

        }


    }
}
