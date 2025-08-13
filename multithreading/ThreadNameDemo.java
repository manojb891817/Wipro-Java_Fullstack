public class ThreadNameDemo{
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1 " + Thread.currentThread().getName());});
        t1.setName("Scooby");

        Thread t2 = new Thread(() -> {
            System.out.println("Thread 2 " + Thread.currentThread().getName());});
        t2.setName("Shaggy");

        t1.start();
        t2.start();
    }
}