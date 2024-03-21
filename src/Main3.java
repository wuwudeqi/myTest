import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        String number1 = in.next();
        String number2 = in.next();
        String[] num1 = number1.split("");
        String[] num2 = number2.split("");
        String rightNumber="";
        int changeCount=0;
        for(int i=0;i<count;i++){
            int check = Integer.parseInt(num1[i])+Integer.parseInt(num2[i]);
            if(check>0){
                rightNumber=rightNumber+"1";
            }else {
                rightNumber=rightNumber+"0";
            }
        }
        String checkNumber;
        for(int i=0;i<count;i++){
            for(int j=i+1;j<count;j++){
                num1=number1.split("");
                if(num1[i].equals(num1[j])){
                    continue;
                }
                checkNumber="";
                String temp = num1[i];
                num1[i]=num1[j];
                num1[j]=temp;
                for(int z=0;z<count;z++){
                    int check = Integer.parseInt(num1[z])+Integer.parseInt(num2[z]);
                    if(check>0){
                        checkNumber=checkNumber+"1";
                    }else {
                        checkNumber=checkNumber+"0";
                    }
                }
                if(!rightNumber.equals(checkNumber)){
                    changeCount++;
                }
            }
        }
        System.out.println(changeCount);
    }
}
