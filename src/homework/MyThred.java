package homework;

public class MyThred extends Thread {


//
    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            if (i % 21 == 0&& Homework.intContain3(i)) {
                Homework.incrementCounter();
            }
        }
    }
}
