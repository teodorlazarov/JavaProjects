public class RunnableThread implements Runnable {

    private int index;

    public RunnableThread(int index) {
        this.index = index;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 50; i++) {
            try {
                System.out.printf("Thread #%-5d says %5d\n", index, i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void start(){
        Thread thread = new Thread(this);
        thread.start();
    }
}
