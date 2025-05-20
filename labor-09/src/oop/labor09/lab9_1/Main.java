package oop.labor09.lab9_1;

public class Main {
    public static void main(String[] args) {
        IQueue q1=new ArrayListQueue(5);
        for (int i=0;i<10;++i){
            q1.enQueue(i);
            q1.printQueue();
        }

        while(!q1.isEmpty()){
            q1.deQueue();
            q1.printQueue();
        }

        IQueue q2 = new ArrayListQueue(5);
        IQueue q3 = new ArrayListQueue(10);
        for( int i=0; i<5; ++i){
            q2.enQueue( i );
            q3.enQueue( i );
        }
        System.out.println( q2.equals( q3 ));

    }

}
