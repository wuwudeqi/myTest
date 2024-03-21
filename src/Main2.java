import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String kuohao = in.nextLine();
        String[] kuohaoArray = kuohao.split("");
        Stack<String> stack = new Stack<>();
        int isTrue=1;
        int max=0;
        for(int i=0;i<kuohao.length();i++){
            // 小括号
            if(kuohaoArray[i].equals(")")){
                if(stack.isEmpty()){
                    isTrue=0;
                    break;
                }
                String pop = stack.pop();
                if(!pop.equals("(")){
                    isTrue=0;
                    break;
                }
                continue;
            }
            // 中括号
            if(kuohaoArray[i].equals("]")){
                if(stack.isEmpty()){
                    isTrue=0;
                    break;
                }
                String pop = stack.pop();
                if(!pop.equals("[")){
                    isTrue=0;
                    break;
                }
                continue;
            }
            // 大括号
            if(kuohaoArray[i].equals("}")){
                if(stack.isEmpty()){
                    isTrue=0;
                    break;
                }
                String pop = stack.pop();
                if(!pop.equals("{")){
                    isTrue=0;
                    break;
                }
                continue;
            }
            stack.push(kuohaoArray[i]);
            max= Math.max(max,stack.size());
        }
        if(isTrue==0||!stack.isEmpty()){
            System.out.println(0);
        }else {
            System.out.println(max);
        }

    }
}
