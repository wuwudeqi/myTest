package huawei;

import java.util.Scanner;

public class HJ85 {
    /**
     * 使用双指针，中心扩散法
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int maxLength = 0;
        int center = 0;
        for (int i = 0; i < s.length(); i++) {
            int jishu = countLength(s, i, i);
            int oushu = countLength(s, i, i + 1);
            if (maxLength < Math.max(jishu, oushu)) {
                center = i;
                maxLength = Math.max(jishu, oushu);
            }
        }
        System.out.println(maxLength);

    }

    static int countLength(String s, int i, int j) {
        int left = i;
        int right = j;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

}
