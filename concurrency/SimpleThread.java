public class SimpleThread {
    public static class TestThread extends Thread {
        public void run() {
            String name = Thread.currentThread().getName();
            System.out.println("Thread running... " + name);
            System.out.println("Thread done");
        }
    }
    public static class TestRunnable implements Runnable {
        @Override
        public void run() {
            String name = Thread.currentThread().getName();
            System.out.println("Runnable class running... " + name);
            System.out.println("Runnable done");
        }
    }
    public static void main(String [] args) {
        Runnable runnable = new Runnable(){
            @Override
            public void run() {
                String name = Thread.currentThread().getName();
                System.out.println("Runnable class2 running... " + name);
                System.out.println("Runnable 2 done");
            }
        };
        Runnable run_lambda = () -> {
            String name = Thread.currentThread().getName();
            System.out.println("Runnable lambda running... " + name);
            System.out.println("Runnable lambda done");
        };
        TestThread t = new TestThread();
        t.start();
        Thread t2 = new Thread(new TestRunnable());
        t2.start();
        Thread t3 = new Thread( runnable );
        t3.start();
        Thread t4 = new Thread( run_lambda );
        t4.start();
    }

}
