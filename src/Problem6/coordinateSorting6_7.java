package Problem6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//좌표 정렬
class Point implements Comparable<Point> {
    public int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point point) {
        if(this.x==point.x) return this.y-point.y;
        else return this.x-point.x;
    }
}

public class coordinateSorting6_7 {

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Point> arr=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x=kb.nextInt();
            int y=kb.nextInt();
            arr.add(new Point(x,y));
        }
        Collections.sort(arr);
        for (Point point : arr) {
            System.out.println(point.x+" "+point.y);
        }
    }
}
