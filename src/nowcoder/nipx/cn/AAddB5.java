package nowcoder.nipx.cn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author NipGeihou
 * @create 2021-08-22 1:52
 */
public class AAddB5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        line = br.readLine();

        int i = Integer.parseInt(line);

        while (i > 0) {
            line = br.readLine();
            String[] nums = line.split(" ");
            int sum = 0;
            for (int j = 1; j <= Integer.parseInt(nums[0]); j++) {
                sum += Integer.parseInt(nums[j]);
            }
            System.out.println(sum);

            i--;
        }
    }
}
