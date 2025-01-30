package course07;

import java.util.LinkedList;
import java.util.Queue;

public class Course07 {
    Node root;

    // BFS 개념
    public void BFS(Node root) {
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);

        while (!Q.isEmpty()) {
            int len = Q.size();

            for (int i = 0; i < len; i++) {
                Node cur = Q.poll();
                System.out.print(cur.data + " ");
                if (cur.lt != null) Q.offer(cur.lt);
                if (cur.rt != null) Q.offer(cur.rt);
            }
        }
    }

    public static void main(String[] args) {
        Course07 tree = new Course07();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.BFS(tree.root);

//         1
//       2  3
//      4 5 6 7
//      BFS : 1 2 3 4 5 6 7
    }
}
