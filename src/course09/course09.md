# Greedy Algorithm

## Greedy Algorithm이란

:각 단계에서 **현재 상황에서 최선의 선택** 을 하는 방식으로 문제를 해결하는 알고리즘입니다. <br/>
이러한 선택이 전체 문제에 대한 최적의 해를 보장하는 문제에서 효과적으로 사용할 수 있습니다.

### Greedy Algorithm이 잘 동작하는 예시

1. **동전 교환 문제**: 주어진 동전들로 특정 금액을 만들 때, 각 단계에서 가장 큰 동전부터 사용하는 방식입니다.
2. **활동 선택 문제**: 여러 활동 중에서 겹치지 않게 가능한 활동을 최대한 선택하는 문제로, 종료 시간이 가장 빠른 활동부터 선택하는 방식입니다.

---
## Comparable 기반 정렬
Java에서는 **Comparable 인터페이스를 구현**하여 객체의 정렬 기준을 정의할 수 있습니다. <br/>
**compareTo 메서드를 오버라이드**하여 정렬 로직을 지정합니다.

```java
class Person implements Comparable<Person> {
    public int height;
    public int weight;

    public Person(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Person o) {
        return o.height - this.height;
    }
}
```
📌  compareTo는 **음수**를 반환할 때 현재 객체가 **앞**에 오도록 동작합니다. <br/>

* 내림차순 정렬: `o.height - this.height`
* 오름차순 정렬: `this.height - o.height`
* 다중 정렬: 첫 번째 기준이 같으면 두 번째 기준을 비교하여 정렬
```java 
    @Override
    public int compareTo(Person o) {
        // 1. 키 내림차순 정렬
        int result = o.height - this.height;
    
        // 2. 키가 같으면 몸무게 오름차순 정렬
        if (result == 0) {
            result = this.weight - o.weight;
        }
        return result;
    }
 ```
---
## Priority Queue
`Priority Queue` (우선순위 큐)는 일반적인 큐와 유사하지만, 큐의 **각 원소가 우선순위**를 가지고 있고, 원소가 큐에서 나오는 순서는 우선순위에 따라 결정되는 자료구조입니다. <br/>
우선순위가 **높은 원소부터 먼저 처리**됩니다.

### 활용
- 작업 스케줄링
- 다익스트라 알고리즘
- 허프만 코드 생성
- 이벤트 드리븐 시뮬레이션

### 특징
- **삽입**: 원소를 큐에 삽입할 때, 해당 원소의 우선순위도 함께 지정됩니다.
- **삭제**: 큐에서 원소를 삭제할 때, 가장 높은 우선순위를 가진 원소가 먼저 삭제됩니다.
- **우선순위**: 우선순위는 숫자 값으로 나타내며, 숫자가 낮을수록 높은 우선순위를 가질 수 있습니다. (일반적으로 작은 값일수록 높은 우선순위를 의미)

### 코드 
```java
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // 우선순위 큐 생성 (기본적으로 최소 힙)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 우선순위 큐 생성 (최대 힙)
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // 큐에 원소 삽입
        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(1);

        // 큐에서 원소 추출 (가장 작은 값부터 출력)
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
```
---
## 다익스트라 알고리즘 
: 다익스트라는 단일 출발점에서 다른 모든 노드까지의 최단 경로를 구하는 알고리즘 <br/>
<br/>

**간선의 가중치가 음수가 아니어야 함** <br/>
: 다익스트라 알고리즘은 간선의 가중치가 음수일 경우, 최단 경로를 제대로 계산할 수 없습니다. <br/>
`음수 가중치가 있는 경우 벨만-포드 알고리즘을 사용해야 합니다.`<br/>
<br/>
**시간복잡도**: **O(E log V)**
* E : 간선의 개수 
* V : 노드의 개수 

### 알고리즘 설명
1. dis 배열 초기화:
   * dis 배열은 각 노드에 대한 최소 비용을 저장합니다.
   * 시작 노드는 0으로 초기화하고, 나머지 노드는 Integer.MAX_VALUE로 초기화합니다.
2. 첫 번째 노드에서 인접한 노드로의 가중치 업데이트:
   * 첫 번째 노드에서 뻗어나가는 가중치들을 dis 배열에 반영합니다.
3. 최소값 찾기:
   * dis 배열에서 아직 확정되지 않은 노드들 중에서 최소값을 선택합니다. 이 값을 통해 해당 노드를 확정합니다.
4. 확정된 노드에서 다시 출발:
   * 확정된 노드를 시작으로 인접한 노드들로 이동하면서 최단 경로를 갱신해 나갑니다.

### 코드 예시
```java
// 1. Edge 클래스 정의: 정점과 비용을 나타내는 클래스입니다.
class Edge implements Comparable<Edge> {
    public int vex; // 정점
    public int cost; // 비용

    Edge(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }

    // 2. compareTo 메소드: 우선순위 큐에서 사용될 비교 기준을 제공합니다.
    @Override
    public int compareTo(Edge ob) {
        return this.cost - ob.cost;  // 비용이 더 적은 것이 우선순위가 높습니다.
    }
}

// 3. 다익스트라 알고리즘을 구현하는 클래스
public class Course05 {
    static int n, m;  // n: 노드 개수, m: 간선 개수
    static ArrayList<ArrayList<Edge>> graph;  // 그래프의 인접 리스트
    static int[] dis;  // 다익스트라 결과를 담을 배열

    public void solution(int v) {
        // 4. 우선순위 큐 초기화
        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        pQ.offer(new Edge(v, 0));  // 시작 노드를 큐에 추가
        dis[v] = 0;  // 시작 노드의 최소 비용은 0

        // 5. 큐에서 가장 작은 비용을 가진 노드를 하나씩 꺼내 처리
        while (!pQ.isEmpty()) {
            Edge tmp = pQ.poll();  // 큐에서 가장 작은 비용을 가진 노드를 꺼냄
            int now = tmp.vex;     // 현재 노드
            int nowCost = tmp.cost; // 현재까지의 비용

            // 6. 이미 최단 경로가 확정된 노드는 스킵
            if (nowCost > dis[now]) continue;

            // 7. 인접한 노드들의 비용을 갱신
            for (Edge ob : graph.get(now)) {
                // 8. 더 작은 비용이 있으면 갱신하고 큐에 추가
                if (dis[ob.vex] > nowCost + ob.cost) {
                    dis[ob.vex] = nowCost + ob.cost;
                    pQ.offer(new Edge(ob.vex, nowCost + ob.cost));  // 큐에 추가
                }
            }
        }
    }

    public static void main(String[] args) {
        Course05 T = new Course05();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();  // 노드의 수
        m = in.nextInt();  // 간선의 수

        // 9. 그래프 초기화
        graph = new ArrayList<ArrayList<Edge>>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Edge>());
        }

        // 10. 간선 정보 입력
        dis = new int[n + 1];
        Arrays.fill(dis, Integer.MAX_VALUE);  // dis 배열을 무한대로 초기화

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            graph.get(a).add(new Edge(b, c));  // a에서 b로 가는 비용 c
        }

        T.solution(1);  // 1번 노드를 시작점으로 다익스트라 알고리즘 실행

        // 11. 결과 출력
        for (int i = 2; i <= n; i++) {
            if (dis[i] != Integer.MAX_VALUE) 
                System.out.println(i + " : " + dis[i]);  // 최단 거리 출력
            else 
                System.out.println(i + " : impossible");  // 도달 불가능한 경우
        }
    }
}

```
1. Edge 클래스 정의: 그래프에서 간선 정보를 나타내는 클래스입니다. vex는 목적지 정점, cost는 간선의 비용을 의미합니다.
2. compareTo 메소드: Edge 객체의 비용을 기준으로 우선순위를 결정합니다. 큐에서 작은 비용의 노드를 우선 처리할 수 있게 합니다.
3. 다익스트라 알고리즘 구현: solution 메소드에서 다익스트라 알고리즘을 구현합니다.
4. 우선순위 큐 초기화: 시작 노드를 우선순위 큐에 넣고, dis 배열을 초기화합니다.
5. 큐에서 가장 작은 비용을 가진 노드를 처리: 큐에서 비용이 가장 작은 노드를 꺼내어 처리합니다.
6. 최단 경로가 확정된 노드 스킵: 이미 확정된 노드는 다시 처리할 필요가 없으므로 스킵합니다.
7. 인접 노드들의 비용을 갱신: 현재 노드와 인접한 노드들의 경로 비용을 갱신합니다.
8. 더 작은 비용이 있으면 갱신하고 큐에 추가: 현재 노드를 통해 더 작은 비용으로 도달할 수 있으면 해당 노드를 큐에 추가합니다.
9. 그래프 초기화: 그래프를 인접 리스트로 초기화합니다.
10. 간선 정보 입력: 간선 정보를 입력받고, 그래프에 추가합니다.
11. 결과 출력: 다익스트라 알고리즘을 실행한 후, 각 노드에 대한 최단 경로를 출력합니다.

---
## Union&Find 알고리즘
: 여러 개의 원소가 있을 때 <br/>
* 같은 그룹(집합)에 속해 있는지 판별하거나
* 두 그룹을 합치는 연산을 수행하는 알고리즘이다.
  * 이 알고리즘은 대표적으로 그래프에서 사이클 판별, **최소 신장 트리(MST)** 를 찾는 데 사용된다.

### 📌 동작 과정
1. unf 배열을 생성하여 초기값을 자기 자신으로 설정 (unf[i] = i)
2. Union(a, b) 연산을 수행하며 두 개의 집합을 합침
3. 특정 두 원소가 같은 집합에 속해 있는지 확인 (Find(a) == Find(b))
4. 결과 출력 (같은 집합이면 "YES", 아니면 "NO")

### 코드 예시
```java
// 서로소 집합 Disjoint-Set -> Union&Find 알고리즘
    static int[] unf;

    // Find : 집합 번호를 Return
    public int Find(int v) {
        if (v == unf[v]) return v;
        else return unf[v] = Find(unf[v]); // 같은 집합의 경우 모두 같은 집합 번호 수로 맞춰줌
    }

    public void Union(int a, int b) {
        int fa = Find(a);
        int fb = Find(b);
        if (fa != fb) unf[fa] = fb; // 동일한 집합 번호로 맞춰줌 : 압축
    }

    public static void main(String[] args) {
        Course06 T = new Course06();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        unf = new int[n + 1];
        for (int i = 1; i <= n; i++) unf[i] = i;
        for (int i = 1; i <= m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            T.Union(a, b);
        }
        int a = in.nextInt();
        int b = in.nextInt();
        int fa = T.Find(a);
        int fb = T.Find(b);

        if(fa == fb) System.out.println("YES");
        else System.out.println("NO");
    }
```

#### Find 연산
* 특정 원소가 속한 집합(루트 노드)을 찾는 연산
* 경로 압축(Path Compression) 기법을 적용하여 성능을 최적화함
```java
public int Find(int v) {
    if (v == unf[v]) return v; // 자기 자신이 루트면 반환
    else return unf[v] = Find(unf[v]); // 경로 압축 적용
}
```

#### Union 연산
* 두 개의 집합을 하나로 합치는 연산
* Find 연산을 이용해 각 집합의 대표(루트)를 찾은 후, 한쪽을 다른 쪽에 연결
```java
public void Union(int a, int b) {
    int fa = Find(a); // a의 루트 찾기
    int fb = Find(b); // b의 루트 찾기
    if (fa != fb) unf[fa] = fb; // 두 집합이 다르면 하나로 합치기
}
```

### 초기 세팅
```java
public static void main(String[] args) {
    Course06 T = new Course06();
    Scanner in = new Scanner(System.in);

    int n = in.nextInt(); // 노드 개수
    int m = in.nextInt(); // Union 연산 횟수

    unf = new int[n + 1]; // 1-based index 사용
    for (int i = 1; i <= n; i++) unf[i] = i; // 초기화: 자기 자신이 대표

    // m번의 Union 연산 수행
    for (int i = 1; i <= m; i++) {
        int a = in.nextInt();
        int b = in.nextInt();
        T.Union(a, b);
    }

    int a = in.nextInt();
    int b = in.nextInt();
    
    // Find 연산을 이용해 같은 집합인지 확인
    int fa = T.Find(a);
    int fb = T.Find(b);

    if(fa == fb) System.out.println("YES"); // 같은 집합이면 YES
    else System.out.println("NO"); // 아니면 NO
}
```

--- 
## 최소 스패닝 트리 (Minimum Spanning Tree, MST)
: 모든 도시를 서로 연결하면서 최소의 유지비용이 들도록 선택하는 방법

### 크루스칼 알고리즘 : Union & Find 사용

```java
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
    // ... (입력 처리) ...

    unf = new int[n + 1];
    ArrayList<Course07Edge> arr = new ArrayList<>();

    for (int i = 1; i <= n; i++) unf[i] = i;
    for (int i = 1; i <= m; i++) {
        // ... (간선 정보 입력) ...
        arr.add(new Course07Edge(a, b, c));
    }

    Collections.sort(arr); // 간선 비용 기준 오름차순 정렬

    int answer = 0;
    int count = 0;

    for (Course07Edge edge : arr) {
        int fv1 = Find(edge.v1);
        int fv2 = Find(edge.v2);

        if (fv1 != fv2) { // 두 정점이 같은 집합에 속하지 않으면
            answer += edge.cost; // 비용 추가
            Union(edge.v1, edge.v2); // 두 정점을 같은 집합으로 합침
            count++;

            if (count == n - 1) break; // 모든 정점이 연결되면 종료
        }
    }

    System.out.println(answer);
}
```
1. 간선 정렬: 간선들을 비용을 기준으로 오름차순 정렬합니다.
2. 집합 확인: 정렬된 간선들을 순회하며 각 간선의 두 정점이 같은 집합에 속하는지 확인합니다. - Find
3. MST 구성: 두 정점이 다른 집합에 속하면 해당 간선을 MST에 포함시키고, 두 정점을 같은 집합으로 합칩니다. - Union
4. 종료 조건: 모든 정점이 하나의 집합으로 합쳐지면(n-1개의 간선이 선택되면) 종료합니다.

### 프림 알고리즘 : PriorityQueue 사용

```java
public static void main(String[] args) {
    // ... (입력 처리) ...

    ArrayList<ArrayList<Course08Edge>> graph = new ArrayList<>();
    for (int i = 0; i <= n; i++) graph.add(new ArrayList<Course08Edge>());
    int[] ch = new int[n + 1];

    for (int i = 1; i <= m; i++) {
        // ... (간선 정보 입력 및 인접 리스트 구성) ...
        graph.get(a).add(new Course08Edge(b, c));
        graph.get(b).add(new Course08Edge(a, c));
    }

     int answer = 0;
     PriorityQueue<Course08Edge> pQ = new PriorityQueue<>();
     pQ.offer(new Course08Edge(1, 0)); // 시작 정점을 우선순위 큐에 삽입

     while (!pQ.isEmpty()) {
        Course08Edge edge = pQ.poll();
        int v = edge.vex;

        if (ch[v] == 0) { // 방문하지 않은 정점이면
           ch[v] = 1; // 방문 처리
           answer += edge.cost; // 비용 추가
   
           for (Course08Edge nextEdge : graph.get(v)) {
              if (ch[nextEdge.vex] == 0) { // 다음 정점이 방문하지 않았다면
                  // pQ.offer(nextEdge); // 우선순위 큐에 삽입
              }
           }
        }
     }
     System.out.println(answer);
}
```

1. 인접 리스트 구성: 그래프의 인접 리스트를 생성합니다.
2. 시작 정점 선택: 시작 정점을 선택하고 우선순위 큐에 삽입합니다.
3. MST 확장: 우선순위 큐에서 비용이 가장 작은 간선을 꺼내어 연결된 정점을 방문합니다.
4. 방문 처리: 방문하지 않은 정점이면 방문 처리하고, 해당 정점에서 갈 수 있는 다른 정점들을 우선순위 큐에 삽입합니다.
5. 종료 조건: 우선순위 큐가 빌 때까지 반복합니다.