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
