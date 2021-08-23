package exam.nipx.cn.qianxin;

import sun.security.action.GetLongAction;

import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author NipGeihou
 * @create 2021-08-23 15:52
 */
public class B {

    public static void main(String[] args) {

        int[][] ints = new int[11][11];
        ints[0][0] = 1;
        ints[0][2] = 1;
        ints[1][1] = 1;
        ints[10][10] = 1;

        B b = new B();
        b.getMinLength(ints);
    }

    public int getMinLength (int[][] pearls) {

        List<String> validXYList = new ArrayList<>();

        for (int i = 0; i < pearls.length; i++) {
            for (int j = 0; j < pearls[i].length; j++) {
                if (pearls[i][j] > 0) {
                    validXYList.add(i + "," + j);
                }
            }
        }

        validXYList.forEach(System.out::println);

        List<String> groupList = new ArrayList<>();

        String[] selectGroup = {validXYList.get(0), validXYList.get(1), validXYList.get(2)};
        String[] p1Select = validXYList.get(0).split(",");
        int x1S = Integer.parseInt(p1Select[0]);
        int y1S = Integer.parseInt(p1Select[1]);
        String[] p2Select = validXYList.get(1).split(",");
        int x2S = Integer.parseInt(p2Select[0]);
        int y2S = Integer.parseInt(p2Select[1]);
        String[] p3Select = validXYList.get(2).split(",");
        int x3S = Integer.parseInt(p3Select[0]);
        int y3S = Integer.parseInt(p3Select[1]);
        int distance12S = (int) (Math.pow(Math.abs(x1S - x2S), 2) + Math.pow(Math.abs(y1S - y2S), 2));
        int distance13S = (int) (Math.pow(Math.abs(x1S - x3S), 2) + Math.pow(Math.abs(y1S - y3S), 2));
        int selectDistance = distance12S + distance13S;

        // 笛卡尔积
        for (int i1 = 0; i1 < validXYList.size(); i1++) {
            for (int i2 = i1 + 1; i2 < validXYList.size(); i2++) {
                for (int i3 = i2 + 1; i3 < validXYList.size(); i3++) {
                    String p1 = validXYList.get(i1);
                    String p2 = validXYList.get(i2);
                    String p3 = validXYList.get(i3);

                    if (p1.equals(p2) || p1.equals(p3) || p2.equals(p3)) {
                        continue;
                    }
                    groupList.add(p1 + "|" + p2 + "|" + p3);

                    // 求p1与p2\p3的距离
                    String[] p1Arr = p1.split(",");
                    int x1 = Integer.parseInt(p1Arr[0]);
                    int y1 = Integer.parseInt(p1Arr[1]);
                    String[] p2Arr = p2.split(",");
                    int x2 = Integer.parseInt(p2Arr[0]);
                    int y2 = Integer.parseInt(p2Arr[1]);
                    String[] p3Arr = p3.split(",");
                    int x3 = Integer.parseInt(p3Arr[0]);
                    int y3 = Integer.parseInt(p3Arr[1]);

                    int currDistance = 0;
                    int distance12 = (int) (Math.pow(Math.abs(x1 - x2), 2) + Math.pow(Math.abs(y1 - y2), 2));
                    int distance13 = (int) (Math.pow(Math.abs(x1 - x3), 2) + Math.pow(Math.abs(y1 - y3), 2));
                    currDistance = distance12 + distance13;
                    if (currDistance < selectDistance) {
                        selectDistance = currDistance;
                        selectGroup[0] = p1;
                        selectGroup[1] = p2;
                        selectGroup[2] = p3;
                    }

                }
            }
        }



        System.out.println(Arrays.toString(selectGroup));

        // groupList.forEach(System.out::println);

        // 求筛选出来的方案求路径
        for (String p : selectGroup) {
            String[] xy = p.split(",");

        }
        String[] p1 = selectGroup[0].split(",");
        String[] p2 = selectGroup[1].split(",");
        String[] p3 = selectGroup[2].split(",");
        // int result = Math.abs(Integer.parseInt(p1[0]) - Integer.parseInt(p2[0])) + ;

        // TODO：求最短路径




        // write code here
        return 0;
    }




}
