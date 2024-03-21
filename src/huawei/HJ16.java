package huawei;

import static java.lang.Math.max;

public class HJ16 {
    public static void main(String[] args) {
        int bagweight=4;
        int[]  weight = new int[]{0,1,3,4};
        int[] value = new int[]{0,15,20,30};
        int[][] dp = new int[4][5];
        // weight数组的大小 就是物品个数
        for(int j = 0; j <= bagweight; j++) { // 遍历背包容量
            for(int i = 1; i < weight.length; i++) { // 遍历物品
                if (j < weight[i]) dp[i][j] = dp[i - 1][j];
                else dp[i][j] = max(dp[i - 1][j], dp[i - 1][j - weight[i]] + value[i]);
            }
        }
        for(int i=0; i<4; i++){
            for(int j=0; j<5;j++){
                System.out.println("["+i+"]"+"["+j+"]"+dp[i][j]);
            }
        }
    }
}
