public class Ticketing {
    public static void main(String[] args) {
        new ThreadTest().start();
        new ThreadTest().start();
        new ThreadTest().start();
        new ThreadTest().start();
    }
}

class ThreadTest extends Thread {
    private int ticket = 100;

    public void run() {
        while (true) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + " 卖了第 " + ticket-- + " 张票");
            } else {
                break;
            }
        }
    }

}
