public class WithClassThread extends Thread {

    public WithClassThread(String name){
        this.setName(name);
    }

    @Override
    public void run(){
        for (int i = 0; i <= 50; i++) {
            try {
                System.out.printf("%-13s says %5d\n", this.getName(), i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
