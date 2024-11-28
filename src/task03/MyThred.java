package task03;

import task02.Task02;

public class MyThred extends Thread {

    @Override
    public void run() {
      for (int i = 0; i < 1000000; i++) {
         Task03.incrementCounter();
      }
        System.out.println(Thread.currentThread().getName()+" end!");
    }
}
