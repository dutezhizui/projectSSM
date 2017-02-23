import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestLock {
    private ArrayList<Integer> arrayList = new ArrayList<Integer>();
    Lock lock=new ReentrantLock();
    public static void main(String[] args)  {
        final TestLock test = new TestLock();

        new Thread(){
            public void run() {
                test.insert(Thread.currentThread());

            }
        }.start();

        new Thread(){
            public void run() {
                test.insert(Thread.currentThread());
            };
        }.start();
    }

    public void insert(Thread thread) {
        //Lock lock = new ReentrantLock();    //注意这个地方
        //lock.lock();
        lock.lock();
        try {
            System.out.println(thread.getName()+"得到了锁");
            for(int i=0;i<5;i++) {
                arrayList.add(i);
            }
            for (int j=0;j<arrayList.size();j++){
                System.err.println("arrayList["+j+"]"+arrayList.get(j));
            }
        } catch (Exception e) {
            // TODO: handle exception
        }finally {
            System.out.println(thread.getName()+"释放了锁");
            lock.unlock();
        }
    }
}
