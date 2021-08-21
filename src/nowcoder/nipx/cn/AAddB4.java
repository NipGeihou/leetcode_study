package nowcoder.nipx.cn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author NipGeihou
 * @create 2021-08-22 1:42
 */
public class AAddB4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null) {
            String[] nums = line.split(" ");

            if (nums.length == 1 && Integer.parseInt(nums[0]) == 0) {
                break;
            }

            int sum = 0;
            for (String num : nums) {
                sum += Integer.parseInt(num);
            }
            System.out.println(sum);
        }

        br.close();

    }
}
