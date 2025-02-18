# DFS와 BFS 활용 (부분집합, 순열)

## 1. 부분집합 구하기
각 원소마다 사용했다/안 했다를 재귀로 탐색하면 됨.
* 시간 복잡도: O(2^N) (모든 부분집합을 탐색)
* 활용 예시: 부분집합을 활용한 문제(예: 특정 합을 만드는 부분집합 찾기)

```java 
public void DFS(int L, int sum, int[] arr) {
    if (L == arr.length) {
        System.out.println(sum);
    } else {
        DFS(L + 1, sum + arr[L], arr); // 현재 원소를 선택한 경우
        DFS(L + 1, sum, arr); // 현재 원소를 선택하지 않은 경우 
    }
}
```

변수 설명
* L: 현재 탐색 중인 원소의 인덱스
* sum: 현재까지 선택한 원소들의 합
* arr: 주어진 원소 배열

---

## 2. 중복 순열 구하기
중복 순열: 같은 숫자를 여러 번 선택할 수 있는 순열.
* 시간 복잡도: O(N^M) (M개의 자리를 N개의 원소로 채움)
* 활용 예시: 중복 허용 비밀번호, 주사위 던지기 등

```java 
public void DFS(int L) {
    if (L == pm.length) {
        for (int x : pm) System.out.print(x + " ");
        System.out.println();
    } else {
        for (int i = 1; i <= a; i++) {
            pm[L] = i;
            DFS(L + 1);
        }
    }
}
```

변수 설명
* L: 현재 선택한 원소의 개수
* pm: 현재까지 선택된 원소들의 배열
* a: 선택 가능한 숫자의 범위

--- 

## 3. 순열 구하기
순열: 서로 다른 n개의 숫자에서 m개를 순서 있게 선택하는 경우의 수.
* 시간 복잡도: O(N!) (모든 순열을 생성)
* 활용 예시: 순열을 활용한 문제(예: 경로 탐색, DFS 백트래킹 문제)

```java
public void DFS(int index, int m, int[] arr, int[] pm, boolean[] ch) {
    if (index == m) {
        for (int i = 0; i < index; i++) {
            System.out.print(pm[i] + " ");
        }
        System.out.println();
    } else {
        for (int i = 0; i < arr.length; i++) {
            if (!ch[i]) {
                pm[index] = arr[i];
                ch[i] = true;
                DFS(index + 1, m, arr, pm, ch);
                ch[i] = false;
            }
        }
    }
}
```

* ch 배열을 사용하여 중복 방지.
* 재귀 호출 전에 사용 여부를 표시하고, 호출 후 해제해야 함.
* 백트래킹을 활용하여 불필요한 탐색을 줄일 수 있음.
  
변수 설명
* index: 현재 선택한 원소의 개수
* m: 선택해야 하는 원소의 개수
* arr: 주어진 원소 배열
* pm: 현재까지 선택한 순열을 저장하는 배열
* ch: 각 원소의 사용 여부를 체크하는 배열

---

## 4. 조합 수 구하기
조합 공식: n! / (n-r)!  * r <br/>
또는, 재귀적으로 nCr = n-1Cr-1 + n-1Cr

* 시간 복잡도: O(N * R) (메모이제이션 활용 시)
* 활용 예시: 경우의 수 계산, 팀 조합 등
* 메모이제이션을 활용하여 계산된 값을 저장하면 중복 연산을 방지할 수 있음.

```java 
public int DFS(int n, int m) {
    if (arr[n][m] != 0) return arr[n][m];
    if (m == 0 || n == m) return 1;
    return arr[n][m] = DFS(n - 1, m - 1) + DFS(n - 1, m);
}
```

변수 설명
* n: 전체 원소 개수
* m: 선택할 원소 개수
* arr: 이미 계산된 조합 값을 저장하는 배열 (메모이제이션용)
  * nCr 에 대한 값을 n행 r 열에 저장해두고 사용

---

## 5. 조합 구하기

🧩 조합 (Combination)
* 정의: 서로 다른 n개의 숫자에서 m개를 순서 없이 선택하는 경우의 수. 
* 🔍 활용 예시 : 팀 구성, 로또 번호 선택 등

### 🛠️ 코드 구현 (DFS)
```java
public void DFS(int L, int s) {
    if (L == m) {
        for (int x : combi) System.out.print(x + " ");
        System.out.println();
    } else {
        for (int i = s; i <= n; i++) {
            combi[L] = i;
            DFS(L + 1, i + 1);
        }
    }
}
```
* L: 지금까지 선택한 개수
* m: 목표로 하는 선택 개수
* s, i: 현재 탐색 중인 인덱스
---
## 6. 도착점까지 갈 수 있는 경우의 수

### 🚶‍♂️ 문제 설명

7x7 격자판에서 (0,0) → (6,6)으로 이동하는 경우의 수를 구한다.

### 💡 풀이 방식 (DFS)

방향 설정: 상, 하, 좌, 우 <br/>
```java
static int[] dx = {-1, 0, 1, 0};
static int[] dy = {0, 1, 0, -1};
```
조건 검사: 격자 범위와 방문 여부

### 🛠️ 코드 구현 (DFS)
```java
public void DFS(int x, int y) {
    if (x == 6 && y == 6) answer++;
    else {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < 7 && ny >= 0 && ny < 7 && arr[nx][ny] == 0) {
                arr[nx][ny] = 1;
                DFS(nx, ny);
                arr[nx][ny] = 0;
            }
        }
    }
}

// 초기 호출
T.DFS(0, 0);
```

* DFS 탐색: (0,0) → (6,6) 경로 탐색
* arr[nx][ny]: 방문 여부 체크 및 복구
* answer: 경우의 수 누적
---
## 7. 도착점까지 최단거리

### 🛣️ 문제 설명

7x7 격자판에서 (0,0) → (6,6)으로 이동하는 최단 거리를 구한다.

### 💡 풀이 방식 (BFS)

BFS 사용: 최단 거리 탐색은 Queue 기반 <br/>

거리 배열(dis): 각 위치까지의 이동 거리 저장

### 🛠️ 코드 구현 (BFS)
```java
// 방향 배열 설정
static int[] dx = {-1, 0, 1, 0};
static int[] dy = {0, 1, 0, -1};
static int[][] arr = new int[7][7];
static int[][] dis = new int[7][7];

public void BFS(int x, int y) {
    Queue<Point> Q = new LinkedList<>();
    Q.offer(new Point(x, y));
    arr[x][y] = 1;

    while (!Q.isEmpty()) {
        Point tmp = Q.poll();
        for (int i = 0; i < 4; i++) {
            int nx = tmp.x + dx[i];
            int ny = tmp.y + dy[i];

            if (nx >= 0 && nx < 7 && ny >= 0 && ny < 7 && arr[nx][ny] == 0) {
                arr[nx][ny] = 1;
                Q.offer(new Point(nx, ny));
                dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
            }
        }
    }
}
```

* BFS 탐색: 인접 노드(상,하,좌,우) 탐색
* dis 배열: 시작점 → 현재 위치까지의 거리 저장
  * 이전 거리에서 + 1 을 진행 
  * `dis[nx][ny] = dis[tmp.x][tmp.y] + 1;`
* arr 배열: 방문 여부 체크