package meituan.nipx.cn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Set;

/**
 * @author NipGeihou
 * @create 2021-08-22 10:02
 */
public class One {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        line = br.readLine();
        int n = Integer.parseInt(line);

        while (n > 0) {
            line = br.readLine();
            String[] nums = line.split(" ");

            // 存放结果
            HashMap<Integer, Integer> map = new HashMap<>(n);

            Set<Integer> keySet = map.keySet();
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < i; j++) {
                    
                }
            }

            n--;
        }

    }
}
