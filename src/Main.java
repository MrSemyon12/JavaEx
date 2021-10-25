import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<MyThread> threads = new ArrayList<>();

        for (int i = 0; i < 3; i++){
            MyThread thread = new MyThread();
            threads.add(thread);
        }

        for (MyThread current: threads) {
            current.start();
        }

    }
}

class MyThread extends Thread{

    public int eaten = 0;

    @Override
    public void run() {
        Random random = new Random();

        while (true) {
            int i = random.nextInt(1, 5);
            while (i > 0)
            {
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

    public void eat(){
        synchronized (this)
        {
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
}