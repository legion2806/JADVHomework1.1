public class Main {

    public static void main(String[] args) {

        ThreadGroup mainGroup = new ThreadGroup("threadGroup");

        final Thread thread1 = new Thread(mainGroup, new MyThread("поток 1"));
        final Thread thread2 = new Thread(mainGroup, new MyThread("поток 2"));
        final Thread thread3 = new Thread(mainGroup, new MyThread("поток 3"));
        final Thread thread4 = new Thread(mainGroup, new MyThread("поток 4"));

        System.out.println("Создаю потоки...");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            Thread.sleep(15000);
        } catch (InterruptedException ett) {

        }
        System.out.println("\nЗавершаю все потоки:");
        mainGroup.interrupt();

    }
}