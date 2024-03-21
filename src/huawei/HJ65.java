package huawei;

import java.util.Scanner;

public class HJ65 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        String m = in.nextLine();
        //动态规划
        //转移方程d[i][j]=d[i-1][j-1]+1 d[i]=d[j]
        //d[i][j]=0 d[i]!=d[j]
        int nlen = n.length();
        char[] nChars = n.toCharArray();
        char[] mChars = m.toCharArray();
        int mlen = m.length();
        // 动态方程
        int[][] d = new int[nlen+1][mlen+1];
        int maxLen=0;
        int nmIndex=0;
        if(nlen>mlen){
            int templen = nlen;
            nlen=mlen;
            mlen=nlen;
        }
        for(int i=1; i<nlen+1; i++){
            for(int j=1; j<mlen+1; j++){
                if(nChars[i-1]==mChars[j-1]){
                    d[i][j] = d[i-1][j-1]+1;
                    if(d[i][j]>maxLen){
                        maxLen=d[i][j];
                        if (nlen<=mlen){
                            nmIndex=i;
                        }else {
                            nmIndex=j;
                        }
                    }
                }else {
                    d[i][j] = 0;
                }
            }
        }
        // 输出子串
        System.out.print(n.substring(nmIndex-maxLen,nmIndex));
    }
}
