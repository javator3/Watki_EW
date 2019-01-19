package com.Watki;

class Runner implements Runnable{

    @Override
    public void run() {
        for(int i=0; i<5; i++){
            System.out.println("Hello: "+i+" thread: "+Thread.currentThread().getName());

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}





public class Main {

    public static void main(String[] args) {

//        Thread thread=new Thread(new Runner());// new runner przekazany do watku to wywolanie polimorficzne
//        Thread thread1=new Thread(new Runner());
//        thread.start();
//        thread1.start();
//        RunnerExample runnerExample=new RunnerExample();
//        RunnerExample runnerExample1=new RunnerExample();
//        runnerExample.start();
//        runnerExample1.start();
//
//        RunnerExample runnerExample2=new RunnerExample();
//        RunnerExample runnerExample3=new RunnerExample();
//        runnerExample2.start();
//        runnerExample3.start();

        Podwajanie podwajanie=new Podwajanie();
        Podwajanie podwajanie2=new Podwajanie();
        //podwajanie.run();
        //podwajanie2.run();

        Thread thread=new Thread(new Runnable() {//klasa anonimowa
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    System.out.println("Hello: "+i+" thread: "+Thread.currentThread().getName());
                }
            }
        });
        thread.start();

    }
}
