package cyleng.me.demo;

public class ThreadCommunication {
    public static void main(String[] args){
        final Object something = new Object();
        // Create thread 1
        Thread thread1 = new Thread(new Runnable(){
            @Override
            public void run (){
                synchronized (something){
                    try{
                        System.out.println("This is Thread 1!");
                        System.out.println("Switch thread 1 to wait");
                        something.wait();
                        System.out.print("Stop waiting");
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        });
        // Create thread 2
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (something){
                    System.out.println("This is Thread 2!");
                    System.out.println("Notify Thread 1");
                    something.notify();
                    System.out.println("Thread 2 notified Thread 1");
                }
            }
        });
        // Start both thread1 and thread2
        thread1.start();
        thread2.start();
    }
}