import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        //ThreadPoolExecutor threadPoolExecutor=new ThreadPoolExecutor();
        Task task = new Task();
        Future<Integer> result = executor.submit(task);
        //executor.shutdown();
        Future<String[]> future=executor.submit(new StringTask());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        System.err.println(executor.isShutdown());
        System.out.println("主线程在执行任务");

        try {
            String[] strings=future.get();
            System.err.println(strings[0]);
            System.out.println("task运行结果"+result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        executor.shutdown();
        System.err.println(executor.isShutdown());
        System.out.println("所有任务执行完毕");
    }
}
class Task implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("子线程在进行计算");
        //Thread.sleep(3000);
        int sum = 0;
        for(int i=0;i<100;i++)
            sum += i;
        return sum;
    }
}

class StringTask implements Callable<String[]>{
    @Override
    public String[] call() throws Exception {
        return new String[]{"y","j"};
    }
}