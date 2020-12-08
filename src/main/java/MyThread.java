public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(2500);
                System.out.println("Я " + Thread.currentThread().getName() + ". Всем привет!");
            }
        } catch (InterruptedException err) {

        } finally {
            System.out.printf("%s завершён\n", getName());
        }
    }
}