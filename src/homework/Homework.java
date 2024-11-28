package homework;

public class Homework {
    static int counter = 0;
    static int counter2 = 0;

    public static synchronized void incrementCounter() {
        counter2++;
    }
    public static boolean intContain3(int number){
        return String.valueOf(number).contains("3");
    }
    public static void main(String[] args) {

    for (int i = 0; i < 2_000_000; i++) {
        if (i % 21 == 0 && intContain3(i)) {
            counter++;
        }
    }
        System.out.println("резульльтат работы однопоточно - "+ counter);

    MyThred myThred = new MyThred();
    myThred.start();

    for (int i = 1_000_001; i < 2_000_000; i++) {
        if (i % 21 == 0 && intContain3(i)) {
            incrementCounter();
        }
    }

        try {
            myThred.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("результат работы 2-х потоков: "+ counter2);
    }
}
