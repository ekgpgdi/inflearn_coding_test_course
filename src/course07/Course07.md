# DFS와 BFS

## DFS (Depth-First Search) - 깊이 우선 탐색

### 정의
DFS는 그래프나 트리의 모든 노드를 탐색하는 알고리즘으로, 자식 노드를 우선적으로 탐색한 뒤, 형제 노드로 이동하는 방식입니다. 주로 재귀를 이용하여 구현되며, 경로를 구하거나 경우의 수를 찾는 문제에서 유용합니다.

- **구현**: 재귀
- **사용되는 상황**:
   - 경우의 수 문제 (예: 경로의 수, 모든 가능한 경우 탐색)
   - 경로 탐색 문제 (예: 미로 찾기)
- **특징**:
   - 깊이를 우선적으로 탐색
   - 모든 노드를 깊게 탐색 후, 형제 노드로 이동

### 구현

```java
Node root;

// DFS 개념
public void DFS(Node root) {
    if (root == null) return;
    else {
        // 전위 순회 System.out.print(root.data);
        DFS(root.lt);  // 왼쪽 자식 노드 탐색
        // 중위 순회 System.out.print(root.data);
        DFS(root.rt);  // 오른쪽 자식 노드 탐색
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
```
- 재귀적 탐색: DFS는 현재 노드를 방문한 후 자식 노드를 재귀적으로 방문하는 방식으로 깊이를 우선적으로 탐색합니다.
- 순회 방식
  - 전위 순회 : 현재 노드 탐색 후 자식 노드 탐색
  - 중위 순회 : 왼쪽 자식 노드 탐색 후 현재 노드 탐색 후 오른쪽 자식 노드 탐색
  - 후위 순회 : 자식 노드 탐색 후 현재 노드 탐색

---

## BFS (Breadth-First Search) - 너비 우선 탐색

### 정의
BFS는 그래프나 트리에서 인접한 노드부터 차례대로 탐색하는 알고리즘입니다. 큐를 사용하여 구현되며, 최단 거리 문제나 레벨 단위로 탐색해야 하는 문제에서 유용합니다.

- **구현**: 큐 (Queue)
- **사용되는 상황**:
   - 최단 거리 문제 (예: 최단 경로 탐색)
   - 레벨 단위로 탐색 (예: 트리/그래프의 레벨별 탐색)
- **특징**:
   - 너비를 우선적으로 탐색
   - 인접한 노드부터 차례대로 탐색

### 구현

```java
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
```
- 큐를 사용한 탐색: BFS는 큐(Queue)를 사용하여 탐색을 진행합니다. 현재 레벨에 있는 모든 노드를 탐색한 후, 그 다음 레벨의 노드를 큐에 넣고 순차적으로 탐색합니다.
- 최단 거리 탐색: BFS는 레벨별로 탐색하기 때문에 최단 경로를 구하는 데 유용합니다. 예를 들어, 두 노드 간의 최단 경로를 구할 때 BFS를 사용하면 됩니다.

---
## DFS, BFS 차이점 요약

| 특성         | DFS (깊이 우선 탐색)              | BFS (너비 우선 탐색)              |
|--------------|---------------------------------|---------------------------------|
| 탐색 방식    | 깊이를 우선적으로 탐색            | 너비를 우선적으로 탐색            |
| 구현 방법    | 재귀적 구현                       | 큐(Queue) 사용                    |
| 사용 예시    | 경우의 수, 경로 탐색               | 최단 거리, 레벨별 탐색            |

---
# 그래프와 인접 행렬

그래프는 노드와 간선으로 이루어진 자료 구조로, 이를 표현하는 방법으로 **인접 행렬**과 **인접 리스트**가 있습니다. 각각의 특징과 구현 방법을 설명합니다.

## 1. 무방향 그래프 (Undirected Graph)

- **설명**: 두 노드 `a`와 `b`가 연결되어 있을 때, 간선은 방향이 없습니다. 즉, `a - b`일 경우, `a`에서 `b`로 가는 경로와 `b`에서 `a`로 가는 경로가 모두 존재합니다.
- **인접 행렬 설정**:  
  `graph[a][b] = 1`  
  `graph[b][a] = 1`

## 2. 방향 그래프 (Directed Graph)

- **설명**: 두 노드 `a`와 `b`가 연결되어 있을 때, 간선에 방향이 존재합니다. 즉, `a -> b`일 경우, `a`에서 `b`로 가는 경로만 존재합니다.
- **인접 행렬 설정**:  
  `graph[a][b] = 1`

## 3. 가중치 방향 그래프 (Weighted Directed Graph)

- **설명**: 두 노드 `a`와 `b`가 연결되어 있을 때, 간선에 가중치가 존재합니다. 즉, `a -> b`로 가는 경로의 가중치가 `n`일 경우, 이 정보를 인접 행렬에 저장합니다.
- **인접 행렬 설정**:  
  `graph[a][b] = n`

## 4. 인접 행렬

인접 행렬은 2차원 배열을 이용해 그래프를 표현합니다. 각 요소는 두 노드 간의 연결 상태를 나타냅니다. 예를 들어, `graph[i][j] = 1`은 `i`와 `j`가 연결되어 있다는 의미입니다.

### 인접 행렬 코드 예시 (DFS 구현)

```java
static int n, m, answer = 0;
static int[][] graph;
static int[] ch; // 한 번 지나간 노드는 다시 가지 않기 위해서 체크

public void DFS(int v) {
    if (v == n) answer++;
    else {
        for (int i = 0; i <= n; i++) {
            if (graph[v][i] == 1 && ch[i] == 0) {
                ch[i] = 1;
                DFS(i);
                ch[i] = 0;
            }
        }
    }
}

public static void main(String[] args) {
    Course12 T = new Course12();
    Scanner in = new Scanner(System.in);
    n = in.nextInt();
    m = in.nextInt();
    graph = new int[n + 1][n + 1];
    ch = new int[n + 1];

    // 간선 정보 입력
    for (int i = 0; i < m; i++) {
        int a = in.nextInt();
        int b = in.nextInt();
        graph[a][b] = 1;
    }

    ch[1] = 1;
    T.DFS(1);
    System.out.println(answer);
}
```

## 5. 인접 리스트
인접 리스트는 각 노드에 연결된 노드들을 리스트로 저장하는 방식입니다. 노드에 연결된 다른 노드들의 정보를 동적으로 관리할 수 있어, 인접 행렬에 비해 메모리 사용이 효율적입니다.

### 인접 리스트 코드 예시 (DFS 구현)

```java
static int n, m, answer = 0;
static ArrayList<ArrayList<Integer>> graph;
static int[] ch;

public void DFS(int v) {
    if (v == n) answer++;
    else {
        for (int nv : graph.get(v)) {
            if (ch[nv] == 0) {
                ch[nv] = 1;
                DFS(nv);
                ch[nv] = 0;
            }
        }
    }
}

public static void main(String[] args) {
    Course13 T = new Course13();
    Scanner in = new Scanner(System.in);
    n = in.nextInt();
    m = in.nextInt();

    // 인접 리스트 초기화
    graph = new ArrayList<ArrayList<Integer>>();
    for (int i = 0; i <= n; i++) {
        graph.add(new ArrayList<Integer>());
    }

    ch = new int[n + 1];

    // 간선 정보 입력
    for (int i = 0; i < m; i++) {
        int a = in.nextInt();
        int b = in.nextInt();
        graph.get(a).add(b);
    }

    ch[1] = 1;
    T.DFS(1);
    System.out.print(answer);
}
```


 