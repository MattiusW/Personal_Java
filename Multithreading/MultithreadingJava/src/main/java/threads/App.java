package threads;

public class App {

    public static void main(String[] args){

        System.out.println("Main thread app: " + Thread.currentThread().getName());

        Thread thread = new MyThread("My Thread-1");
        Thread secondThread = new MyThread("My Thread-2");

        thread.start();
        secondThread.start();

    }

}
