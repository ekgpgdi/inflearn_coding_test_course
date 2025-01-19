package course06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point> {
    public int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x == o.x) return this.y - o.y;
        else return this.x - o.x;
    }
}

public class Course07 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Point> pointList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            pointList.add(new Point(x, y));
        }

        Collections.sort(pointList);

        for (Point p : pointList) System.out.println(p.x + " " + p.y);
    }
}
