package exam.nipx.cn.qianxin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author NipGeihou
 * @create 2021-08-23 15:23
 */
public class A {
    public static void main(String[] args) throws IOException {
        A a = new A();
        System.out.println(Arrays.toString(a.getFraction((float) 0.1415926535898)));

    }

    public int[] getFraction (float a) {
        int[] result = new int[]{1, 1};
        float errorValue = Math.abs(a - 1);

        // 穷举
        for (float i = 1; i <= 200; i++) {
            for (float j = 1; j <= 200; j++) {
                // 当前误差值
                float currErrorValue = Math.abs(a - i / j);

                // 误差更小
                if (currErrorValue < errorValue) {
                    result[0] = (int) i;
                    result[1] = (int) j;
                    errorValue = currErrorValue;
                }


                // 误差相同
                if (Float.compare(currErrorValue, errorValue) == 0 && (i + j) < (result[0] + result[1])) {
                    result[0] = (int) i;
                    result[1] = (int) j;
                    errorValue = currErrorValue;
                }
            }
        }

        return result;
    }
}
