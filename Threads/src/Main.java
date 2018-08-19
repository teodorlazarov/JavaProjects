public class Main {
    public static void main(String[] args) {
        /*WithClassThread sr = new WithClassThread("Thread 1");
        WithClassThread sr2 = new WithClassThread("Thread 2");
        sr.setPriority(Thread.MAX_PRIORITY);
        sr2.setPriority(Thread.MIN_PRIORITY);
        sr.start();
        sr2.start();*/

        RunnableThread run_thread = new RunnableThread(1);
        Thread thread1 = new Thread(run_thread, "Thread 1");
        RunnableThread run_thread2 = new RunnableThread(2);
        //Thread thread2 = new Thread(run_thread2, "Thread 2");
        thread1.start();
        //thread2.start();
        run_thread2.start();
    }
}
