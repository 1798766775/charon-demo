package cn.seven.test;

/**
 * ClassName:    Test
 * Package:    cn.seven.test
 * Description:当两个线程竞争同一资源时，如果对资源的访问顺序敏感，就称存在竞态条件。导致竞态条件发生的代码区称作临界区。
 *             下例中add()方法就是一个临界区,它会产生竞态条件。在临界区中使用适当的同步就可以避免竞态条件。
 * Datetime:    2020/5/10   23:18
 *
 * @Author: charon
 */
public class Test extends Thread{

    protected long count = 0;

    @Override
    public void run() {
        add(1);
    }

    public void add(long value){
        System.out.println(Thread.currentThread().getName()+"读取count的值"+this.count);
        this.count = this.count + value;
        System.out.println(Thread.currentThread().getName()+"输出count的值"+this.count);
    }

    public static void main(String[] args) {
        Test test = new Test();
        Thread thread1 = new Thread(test);
        Thread thread2 = new Thread(test);
        Thread thread3 = new Thread(test);
        Thread thread4 = new Thread(test);
        Thread thread5 = new Thread(test);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }

}
