package nowcoder.nipx.cn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author NipGeihou
 * @create 2021-08-22 1:28
 */
public class AAddB2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        // 读取要计算多少行
        line = br.readLine();
        int n = Integer.parseInt(line);
        while (n > 0) {
            // 读取要计算的行
            line = br.readLine();
            String[] nums = line.split(" ");
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);
            System.out.println(a + b);
            n--;
        }

    }
}
