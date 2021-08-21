package nowcoder.nipx.cn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author NipGeihou
 * @create 2021-08-22 1:35
 */
public class AAddB3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;

        while ((line = br.readLine()) != null) {
            String[] nums = line.split(" ");
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);

            if (a == 0 && b == 0) {
                break;
            }

            System.out.println(a + b);

        }

    }
}
