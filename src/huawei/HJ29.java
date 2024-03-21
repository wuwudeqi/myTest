package huawei;

import java.util.Scanner;

public class HJ29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String deStr = in.nextLine();
        String enStr = in.nextLine();
        // 加密字符串
        char[] dechars = deStr.toCharArray();
        char[] decharss = new char[dechars.length];
        for(int i=0; i<dechars.length; i++){
            if(Character.isDigit(dechars[i])){
                if(dechars[i]=='9'){
                    decharss[i]='0';
                }
                decharss[i] = (char)((int)dechars[i]+1);
            }else if(Character.isUpperCase(dechars[i])){
                if(dechars[i]=='Z'){
                    decharss[i]='a';
                }
                char lowC = Character.toLowerCase(dechars[i]);
                decharss[i]=(char)((int)lowC+1);
            }else if(Character.isLowerCase(dechars[i])){
                if(dechars[i]=='z'){
                    decharss[i]='A';
                }
                char upperC = Character.toUpperCase(dechars[i]);
                decharss[i]=(char)((int)upperC+1);
            }else {
                decharss[i]=dechars[i];
            }
        }
        // 解密字符串
        char[] enchars = enStr.toCharArray();
        char[] encharss = new char[enchars.length];
        for(int i=0; i<enchars.length; i++){
            if(Character.isDigit(enchars[i])){
                if(enchars[i]=='0'){
                    encharss[i]='9';
                }
                encharss[i] = (char)((int)enchars[i]-1);
            }else if(Character.isUpperCase(enchars[i])){
                if(enchars[i]=='A'){
                    encharss[i]='z';
                }
                char lowC = Character.toLowerCase(enchars[i]);
                encharss[i]=(char)((int)lowC-1);
            }else if(Character.isLowerCase(enchars[i])){
                if(enchars[i]=='a'){
                    encharss[i]='Z';
                }
                char upperC = Character.toUpperCase(enchars[i]);
                encharss[i]=(char)((int)upperC-1);
            }else {
                encharss[i]=dechars[i];
            }
        }
        System.out.println(String.valueOf(decharss));
        System.out.println(String.valueOf(encharss));
    }
}
