package nowcoder.nipx.cn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author NipGeihou
 * @create 2021-08-22 1:15
 */
public class AAddB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        // 接收一行输入
        while ((str = br.readLine()) != null) {
            // 空格分割
            String[] nums = str.split(" ");
            if (nums.length == 2) {
                int a = Integer.parseInt(nums[0]);
                int b = Integer.parseInt(nums[1]);
                System.out.println(a + b);
            }
        }
    }


    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     while (sc.hasNextInt()) {
    //         int a = sc.nextInt();
    //         int b = sc.nextInt();
    //         System.out.println(a + b);
    //     }
    // }
}
