package task_01;

public class MyThred2 implements Runnable {

    @Override
    public void run() {
        for (int i = 10000; i < 10010; i++){
            System.out.println(Thread.currentThread().getName() + " - "+i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

}}
