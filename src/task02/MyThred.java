package task02;

public class MyThred extends Thread {

    @Override
    public void run() {
      for (int i = 0; i < 1000000; i++) {
          Task02.count++;
      }
        System.out.println(Thread.currentThread().getName()+" end!");
    }
}
