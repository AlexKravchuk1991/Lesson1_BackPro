package task_01;

public class Task01 {
    public static void main(String[] args) {


        MyThred1 myThred1 = new MyThred1();
        MyThred2 myThred2 = new MyThred2();
        Thread thread = new Thread(myThred2);
//        myThred1.run();
//        myThred2.run();


        myThred1.start();
        thread.setDaemon(true);
        thread.start();

        for (int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + " - "+i);


            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
