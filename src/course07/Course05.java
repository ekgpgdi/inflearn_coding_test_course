package course07;

public class Course05 {
    Node root;

    // DFS 개념
    public void DFS(Node root) {
        if (root == null) return;
        else {
            // 전위 순회 System.out.print(root.data);
            DFS(root.lt);
            // 중위 순회 System.out.print(root.data);
            DFS(root.rt);
            // 후위 순회 System.out.print(root.data);
        }
    }

    public static void main(String[] args) {
        Course05 tree = new Course05();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);

//         1
//       2  3
//      4 5 6 7
//      DFS : 1 2 4 5 3 6 7
    }
}
