package ee.ut.cs.advancedjava2017.java8streams.lesson.lambdas;

public class ThreadDemo {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(i);
                }
            }
        });
        thread.start();
    }
}
