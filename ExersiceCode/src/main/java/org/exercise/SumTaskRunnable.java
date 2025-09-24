package org.exercise;

public class SumTaskRunnable implements Runnable {
    private int start,end;

    public SumTaskRunnable(int start, int end){
        this.start = start;
        this.end = end;
    }

    @Override
    public void run(){
        int sum = 0;
        for (int i = start; i<= end;i++){
            sum += i;
        }
        System.out.println("Sum from  " + start + " to  " + end + " = "+ sum + " | Thread:  " + Thread.currentThread().getName() );
    }

}
class ThreadExample{
    public static void main(String[] args) {
        Thread t1 = new Thread(new SumTaskRunnable(1,100));
        Thread t2 = new Thread(new SumTaskRunnable(101,200));
        Thread t3 = new Thread(new SumTaskRunnable(201,300));

        t1.start();
        t2.start();
        t3.start();
    }
}
