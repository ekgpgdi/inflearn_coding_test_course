package course09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Course07Edge implements Comparable<Course07Edge> {
    public int v1;
    public int v2;
    public int cost;

    Course07Edge(int v1, int v2, int cost) {
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }

    @Override
    public int compareTo(Course07Edge ob) {
        return this.cost - ob.cost;
    }
}

public class Course07 {
    /*
        최소스패닝트리 : 크루스칼, Union&Find 활용
        모든 도시를 서로 연결하면서 최소의 유지비용이 들도록 선택
     */

    static int[] unf;

    public static int Find(int v) {
        if (v == unf[v]) return v;
        else return unf[v] = Find(unf[v]);
    }

    public static void Union(int a, int b) {
        int fa = Find(a);
        int fb = Find(b);
        if (fa != fb) unf[fa] = fb;
    }

    public static void main(String[] args) {
        Course07 T = new Course07();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        unf = new int[n + 1];

        ArrayList<Course07Edge> arr = new ArrayList<>();

        for (int i = 1; i <= n; i++) unf[i] = i;

        for (int i = 1; i <= m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            arr.add(new Course07Edge(a, b, c));
        }

        int answer = 0;
        int count = 0;
        Collections.sort(arr);

        for (Course07Edge ob : arr) {
            int fv1 = Find(ob.v1);
            int fv2 = Find(ob.v2);

            if (fv1 != fv2) {
                answer += ob.cost;
                Union(ob.v1, ob.v2);
                count++;

                if (count == n - 1) break;
            }
        }

        System.out.println(answer);
    }
}
