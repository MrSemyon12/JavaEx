package Task11or12;
import java.util.Random;

public class MyThread extends Thread {

    public int eaten = 0;
    public Bowl bowl = null;

    @Override
    public void run() {
        Random random = new Random();

        while (true) {
            int i = random.nextInt(1, 5);
            while (i > 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " спит");
                i--;
            }
            eat();
        }
    }

    public void eat() {
        synchronized (this.bowl){
            Random random = new Random();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.eaten += random.nextInt(50, 300);
            System.out.println(Thread.currentThread().getName() + " съел " + this.eaten + "г риса");
        }
    }

    public void connectBowl(Bowl bowl){
        this.bowl = bowl;
    }
}
