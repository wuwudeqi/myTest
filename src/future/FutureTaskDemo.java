package future;

import java.util.ArrayList;
import java.util.concurrent.*;

public class FutureTaskDemo {

    public static void main(String[] args) {
        Callable<String> callable =
                new Callable<String>() {
                    @Override
                    public String call() throws Exception {
                        System.out.print("111");
                        return "2333";
                    }
                };
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<String> result = executor.submit(callable);
        result.cancel(true);
        System.out.println(result.isCancelled());
        ArrayList objects = new ArrayList<Integer>();
        LinkedBlockingQueue<Object> objects1 = new LinkedBlockingQueue<>();
        objects1.size();

    }
    public static class Task implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            System.out.println("子线程在进行计算");
            Thread.sleep(3000);
            int sum = 0;
            for (int i = 0; i < 100; i++)
                sum += i;
            return sum;
        }
    }
}
