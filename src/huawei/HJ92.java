package huawei;

import java.util.Map;
import java.util.Scanner;

public class HJ92 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res=0;
        while (in.hasNextLine()){
            String s = in.nextLine();
            // d[i]=d[i-1]+1;
            int[] d = new int[s.length()+1];
            for(int i=1; i<=s.length(); i++){
                if(Character.isDigit(s.charAt(i-1))){
                    d[i]=d[i-1]+1;
                    res = Math.max(res,d[i]);
                }
            }
            for(int i=1;i<=s.length();i++){
                if(d[i]==res){
                    System.out.print(s.substring(i-res,i));
                }
            }
            System.out.print(","+res);
        }
    }
}
