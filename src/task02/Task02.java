package task02;

public class Task02 {
    static int count = 0;

    public static void main(String[] args) {


        MyThred thred1 = new MyThred();
        MyThred thred2 = new MyThred();
        thred1.start();
        thred2.start();


        for (int i = 0; i < 1000000; i++) {
            count++;

        }

        try {
            thred1.join();
            thred2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(count);
    }
}
