package org.Ex14;

public class Multithreading {
    // 1. Напишите программу, в которой запускается 10 потоков и каждый из них выводит числа от 0 до 100.

    public static void tenThreads()  {
        class MyThread extends Thread{
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    System.out.println(Thread.currentThread().getName()+" print "+ i);
                }

            }
        }
        for (int i = 0; i < 10; i++) {
            MyThread myThread = new MyThread();
            myThread.start();
            try {
                myThread.join();
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }
    }

    // 2. Выведете состояние потока перед его запуском, после запуска и во время выполнения.
    public static void getThreadInfo() {
        Object someObject = new Object();
        Thread myThread = new Thread() {
            @Override
            public void run() {
                System.out.println(currentThread().getState() + " " + currentThread().getName());
                try {
                    synchronized (someObject) {
                        someObject.notifyAll();
                        someObject.wait(3000);

                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        };
        System.out.println(myThread.getState() + " " + myThread.getName());
        synchronized (someObject) {
            myThread.start();
            try {
                someObject.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(myThread.getState() + " " + myThread.getName());

        }
        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.getMessage();
        }
        System.out.println(myThread.getState() + " " + myThread.getName());
    }

    // 3. Напишите программу, в которой запускается 100 потоков, каждый из которых
    //вызывает метод increment() 1000 раз.
    //После того, как потоки завершат работу count должен быть равен 100000 при  каждом запуске программы .
    //Если обнаружилась проблема, предложите ее решение.
    class Counter {

        int count = 0;


            public void increment () {

                    count = count + 1;

        }

        public int getCount() {
                  return count;
                }
    }

    public void hundredThreadsCounter(){
        Counter counter = new Counter();

            class ThreadBuilder extends Thread {
            @Override
            public void run() {

                    for (int i = 0; i < 1000; i++) {
                        counter.increment();
                    }

            }
        };

        for (int i = 0; i < 100; i++) {
            ThreadBuilder thread = new ThreadBuilder();

                thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println(counter.getCount());
    }

    // 4. Напишите программу, в которой создаются два потока, каждый из которых выводит
    //по очереди на консоль своё имя.
    //Начать можно с написания своего класс-потока, который выводит в бесконечном
    //цикле свое имя. Потом придется добавить синхронизацию с помощью wait() и
    //notify().
    public static void twoThreads(){
        Object lock = new Object();
        class ThreadBuild extends Thread {
            @Override
            public void run() {
                 while (true){
                     synchronized (lock) {
                         lock.notify();
                         try {
                             lock.wait();
                         } catch (InterruptedException e) {
                             e.printStackTrace();
                         }
                         System.out.println(currentThread().getName());
                         try {
                             Thread.sleep(1000);
                         } catch (InterruptedException e) {
                             e.printStackTrace();
                         }
                     }
                 }
            }
        }

        ThreadBuild thread1 = new ThreadBuild();
        thread1.start();
        ThreadBuild thread2 = new ThreadBuild();
        thread2.start();




    }




}
