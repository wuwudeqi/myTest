import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        TreeMap<Integer,String> map = new TreeMap<>();
        for(int i=0;i<count;i++){
            // 全部转化为M单位
            String storage = in.next();
            String[] storageArray =storage.split("");
            int lastTemp=0;
            int number=0;
            for(int j=0;j<storage.length();j++){
                String checkNum = storageArray[j];
                if(checkNum.equals("M")){
                    number+=Integer.parseInt(storage.substring(lastTemp,j));
                    lastTemp=j+1;
                }
                if(checkNum.equals("G")){
                    number+=Integer.parseInt(storage.substring(lastTemp,j))*1024;
                    lastTemp=j+1;
                }
                if(checkNum.equals("T")){
                    number+=Integer.parseInt(storage.substring(lastTemp,j))*1024*1024;
                    lastTemp=j+1;
                }
            }
            if(map.get(number)!=null){
                number=number+1;
            }
            map.put(number,storage);
        }
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getValue());
        }
    }
}
