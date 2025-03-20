package oop.labor05.Point;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Point> points=new ArrayList<>();
        System.out.println("Meret:"+points.size());

        for(int i=0;i<10;i++) {
            points.add(new Point(i,i));
        }

        for(Point v:points) {
            System.out.println(v);
        }

        for(Point p:points){
            System.out.printf("%.2f\n",p.distanceFromOrigin());
        }

    }
}
