import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Course08Edge implements Comparable<Course08Edge> {
    public int vex;
    public int cost;

    Course08Edge(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Course08Edge ob) {
        return this.cost - ob.cost;
    }
}

public class Course08 {
    /*
        최소스패닝트리 : 프림, PriorityQueue
        모든 도시를 서로 연결하면서 최소의 유지비용이 들도록 선택
     */

    public static void main(String[] args) {
        Course08 T = new Course08();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        ArrayList<ArrayList<Course08Edge>> graph = new ArrayList<ArrayList<Course08Edge>>();

        for (int i = 0; i <= n; i++) graph.add(new ArrayList<Course08Edge>());
        int[] ch = new int[n + 1];

        for (int i = 1; i <= m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            graph.get(a).add(new Course08Edge(b, c));
            graph.get(b).add(new Course08Edge(a, c));
        }

        int answer = 0;

        PriorityQueue<Course08Edge> pQ = new PriorityQueue<>();
        pQ.offer(new Course08Edge(1, 0));

        while(!pQ.isEmpty()) {
            Course08Edge tmp = pQ.poll();
            int ev = tmp.vex;

            if(ch[ev] == 0) {
                ch[ev] = 1;
                answer += tmp.cost;

                for(Course08Edge ob : graph.get(ev)) {
                    if(ch[ob.vex] == 0) pQ.offer(new Course08Edge(ob.vex, ob.cost));
                }
            }
        }

        System.out.println(answer);
    }
}
