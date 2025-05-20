package oop.labor09.lab9_1;

import java.util.ArrayList;

public class ArrayListQueue implements  IQueue{
    private final int capacity;
    private ArrayList<Object> items;

    public ArrayListQueue(int capacity) {
        this.capacity = capacity;
        items=new ArrayList<>(capacity);
    }


    @Override
    public boolean isEmpty() {
        return this.items.isEmpty();
    }

    @Override
    public boolean isFull() {
        return this.items.size()==capacity;
    }

    @Override
    public void enQueue(Object o) {
        if(isFull()){
            System.out.println("Tele a sor!");
            return;
        }
        items.add(o);
    }

    @Override
    public Object deQueue() {
        if(isEmpty()){
            System.out.println("Ures a sor!");
            return null;
        }
        return this.items.removeFirst();
    }

    @Override
    public void printQueue() {
        System.out.print("[");
        for(Object o:this.items){
            System.out.print(o+" ");
        }
        System.out.println("]");
    }

    @Override
    public boolean equals(Object o){
        if(o==null || !(o instanceof ArrayListQueue)){
            return false;
        }
        ArrayListQueue q=(ArrayListQueue)o;
        if(q.items.size()!=this.items.size()){
            return false;
        }
        for(int i=0;i<this.items.size();++i){
            if(!this.items.get(i).equals(q.items.get(i))){
                return false;
            }
        }
        return true;
    }
}
