package task03;

public class Task03 {
    private static int count = 0;

    public static  synchronized void  incrementCounter(){
        count++;
    }
    public static void main(String[] args) {

        MyThred myThred = new MyThred();
        MyThred myThred1 = new MyThred();
    myThred1.start();
    myThred.start();



        for (int i = 0; i < 1000000; i++) {
          incrementCounter();

        }

        try {
            myThred.join();
            myThred1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(count);
    }
}
