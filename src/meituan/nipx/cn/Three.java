package meituan.nipx.cn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author NipGeihou
 * @create 2021-08-22 11:08
 */
public class Three {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        // line = br.readLine();

        line = "()()()(())";

        // 转换为 我制定的格式
        String s = calculate(line);

        // 求出结果
        System.out.println(calculate2(s));

    }


    // 定义searchCount方法，来返回字符串出现的个数
    public static int searchCount(String shortStr, String longStr) {
        // 定义一个count来存放字符串出现的次数
        int count = 0;
        // 调用String类的indexOf(String str)方法，返回第一个相同字符串出现的下标
        while (longStr.indexOf(shortStr) != -1) {
            // 如果存在相同字符串则次数加1
            count++;
            // 调用String类的substring(int beginIndex)方法，获得第一个相同字符出现后的字符串
            longStr = longStr.substring(longStr.indexOf(shortStr)
                    + shortStr.length());

        }
        // 返回次数
        return count;
    }

    /**
     * 返回一个处理好的字符串： ()()()(()) -> 【8】【3】 从而计算出24
     *
     * @param line
     * @return
     */
    public static String calculate(String line) {

        // 判断line包含()吗？
        if (!line.contains("()")) {
            return line;
        }

        // 包含车替换
        String pattern = "(\\(\\))+";

        Pattern r = Pattern.compile(pattern);

        // 现在创建 matcher 对象
        Matcher m = r.matcher(line);

        // 每次只处理一个
        if (m.find()) {
            String subString = m.group();
            int count = searchCount("()", subString);
            int result = (int) Math.pow(2, count);

            String leftString = line.substring(0, m.start());
            String rightString = line.substring(m.end());
            line = leftString + "[" + result + "]" + rightString;

        }


        // // 替换([2])
        // (?<=\(\[)\d+(?=\]\))
        pattern = "\\(\\[\\d+\\]\\)";
        r = Pattern.compile(pattern);
        m = r.matcher(line);
        if (m.find()) {
            String subString = m.group();
            int rightIndex = subString.indexOf("])");
            subString = subString.substring(2, rightIndex);

            int num = Integer.parseInt(subString) + 1;

            String leftString = line.substring(0, m.start());
            String rightString = line.substring(m.end());
            line = leftString + "[" + num + "]" + rightString;

        }

        return calculate(line);
    }


    public static int calculate2(String line) {
        String pattern = "\\d+";

        Pattern r = Pattern.compile(pattern);

        // 现在创建 matcher 对象
        Matcher m = r.matcher(line);

        int result = 1;

        // 每次只处理一个
        while (m.find()) {
            result *= Integer.parseInt(m.group());
        }

        return result;
    }

}
