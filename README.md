# 알고리즘 학습 정리

## 목차
1. [Course01: 문자열 및 문자 관련 함수](#Course01.-문자열-및-문자-관련-함수)
   1. [String 관련 함수](#String-관련-함수)
   2. [Character 관련 함수](#Character-관련-함수)
   3. [StringBuilder 관련 함수](#StringBuilder-관련-함수)
   4. [Integer 관련 함수](#Integer-관련-함수)
   5. [추가로 유용한 String 관련 함수](#추가로-유용한-String-관련-함수)
2. [Course02: 알고리즘 정리](#Course02.-알고리즘-정리)
   1. [에라토스네스 체 알고리즘 : 소수 개수 / 출력](#1.-에라토스네스-체-알고리즘--소수-개수-출력)
3. [Course03: 슬라이딩 윈도우와 투 포인터 알고리즘 (Sliding Window & Two Pointer Algorithm)](#Course03.-슬라이딩-윈도우와-투-포인터-알고리즘-(Sliding-Window-&-Two-Pointer-Algorithm))
   1. [슬라이딩 윈도우](#슬라이딩-윈도우)
   2. [투 포인터](#투-포인터)
4. [Course04: HashMap과 TreeSet](#Course04.-HashMap과-TreeSet)
   1. [HashMap](#1.-HashMap)
   2. [TreeSet](#2.-TreeSet)
   3. [HashMap과 TreeSet의 차이점](#HashMap과-TreeSet의-차이점)
5. [Course05: Stack과 Queue](#Course05.-Stack과-Queue) 
   1. [Stack](#1.-Stack)
   2. [Queue](#2.-Queue)
6. [Course06: 알고리즘 정리](#Course06.-알고리즘-정리)
   1. [선택 정렬 (Selection Sort)](#1.-선택-정렬-(Selection-Sort))
   2. [버블 정렬 (Bubble Sort)](#2.-버블-정렬-(Bubble-Sort))
   3. [삽입 정렬 (Insertion Sort)](#3.-삽입-정렬-(Insertion-Sort))
   4. [LRU (Least Recently Used)](#4.-LRU-(Least-Recently-Used))
   5. [이분 검색 (Binary Search)](#5.-이분-검색-(Binary-Search))
   6. [결정 알고리즘](#6.-결정-알고리즘)
7. [Course07: DFS와 BFS](#Course07.-DFS와-BFS)
   1. [DFS (Depth-First Search) - 깊이 우선 탐색](#DFS-(Depth-First-Search)-깊이-우선-탐색)
   2. [BFS (Breadth-First Search) - 너비 우선 탐색](#BFS-(Breadth-First-Search)-너비-우선-탐색)
   3. [그래프와 인접 행렬](#그래프와-인접-행렬)
      1. [1. 무방향 그래프 (Undirected Graph)](#1.-무방향-그래프-(Undirected-Graph))
      2. [2. 방향 그래프 (Directed Graph)](#2.-방향-그래프-(Directed-Graph))
      3. [3. 가중치 방향 그래프 (Weighted Directed Graph)](#3.-가중치-방향-그래프-(Weighted-Directed-Graph))
      4. [4. 인접 행렬](#4.-인접-행렬)
      5. [5. 인접 리스트](#5.-인접-리스트)

<hr style="border: 0; height: 2px; background: linear-gradient(to right, #f06, #4a90e2);" />

# Course01. 문자열 및 문자 관련 함수

## String 관련 함수

### 1. 문자열 대문자 변환
- **사용법**: `{문자열 변수명}.toUpperCase();`
- **설명**: 문자열을 대문자로 변환합니다.

### 2. 문자열 → 문자 배열
- **사용법**: `{문자열 변수명}.toCharArray();`
- **설명**: 문자열을 문자(char) 배열로 변환합니다.

### 3. 문자열 내 특정 문자 인덱스 추출
- **사용법**: `{문자열 변수명}.indexOf({특정 문자});`
- **설명**: 문자열에서 특정 문자가 처음 등장하는 인덱스를 반환합니다.

#### 3-1. 가장 마지막 인덱스 추출
- **사용법**: `{문자열 변수명}.lastIndexOf({특정 문자});`
- **설명**: 문자열에서 특정 문자가 마지막으로 등장하는 인덱스를 반환합니다.

### 4. 시작 인덱스부터 끝 인덱스 - 1 까지 문자열 분리
- **사용법**: `{문자열 변수명}.substring(시작 인덱스, 끝 인덱스);`
- **설명**: 지정된 시작 인덱스부터 끝 인덱스 직전까지의 부분 문자열을 반환합니다.

### 5. 시작 인덱스부터 끝까지 문자열 분리
- **사용법**: `{문자열 변수명}.substring(시작 인덱스);`
- **설명**: 지정된 시작 인덱스부터 끝까지의 부분 문자열을 반환합니다.

### 6. 특정 인덱스 문자 추출
- **사용법**: `{문자열 변수명}.charAt(인덱스);`
- **설명**: 문자열에서 지정된 인덱스에 해당하는 문자를 반환합니다.

### 7. 정규식 패턴을 이용한 문자열 바꾸기
- **사용법**: `{문자열 변수명}.replaceAll(패턴, 바꿀 문자);`
- **설명**: 정규식을 사용하여 문자열 내 패턴을 찾아 다른 문자열로 교체합니다.

#### 7-1. 문자열 내 알파벳만 추출
- **사용법**: `{문자열 변수명}.replaceAll("[^A-Za-z]", "");`
- **설명**: 문자열에서 알파벳 문자만 남기고 나머지는 제거합니다.

### 8. 정수형 변환
- **사용법**: `Integer.parseInt({문자열 변수명});`
- **설명**: 문자열을 정수로 변환합니다.

---

## Character 관련 함수

### 1. 문자 대문자 변환
- **사용법**: `Character.toUpperCase({문자 변수명});`
- **설명**: 문자를 대문자로 변환합니다.

### 2. 문자 소문자 변환
- **사용법**: `Character.toLowerCase({문자 변수명});`
- **설명**: 문자를 소문자로 변환합니다.

### 3. char[] → String
- **사용법**: `String.valueOf({char 배열});`
- **설명**: 문자 배열을 문자열로 변환합니다.

### 4. 알파벳 체크
- **사용법**: `Character.isAlphabetic({문자 변수명});`
- **설명**: 문자가 알파벳인지 여부를 확인합니다.

### 5. 숫자 체크
- **사용법**: `Character.isDigit({문자 변수명});`
- **설명**: 문자가 숫자인지 확인합니다.

#### 아스키 코드로 숫자 체크 (48 ~ 57)
- **설명**: 아스키 코드 값이 48(0)부터 57(9)까지에 해당하는 문자는 숫자입니다.

### 6. 정수형 변환 (문자 → 아스키 코드)
- **사용법**: `(int) {문자 변수명};`
- **설명**: 문자를 해당하는 아스키 코드 값으로 변환합니다.

---

## StringBuilder 관련 함수

### 1. 문자열 뒤집기
- **사용법**: `new StringBuilder({문자열 변수명}).reverse().toString();`
- **설명**: 문자열을 뒤집습니다.

---

## Integer 관련 함수

### 1. 2진수 → 10진수
- **사용법**: `Integer.parseInt({2진수 변수명}, 2);`
- **설명**: 2진수 문자열을 10진수로 변환합니다.

---

## 추가로 유용한 String 관련 함수

### 1. 문자열 비교
- **사용법**: `{문자열 변수명}.equals({비교할 문자열});`
- **설명**: 두 문자열이 동일한지 비교합니다. 대소문자를 구분합니다.

#### 1-1. 대소문자 구분 없이 문자열 비교
- **사용법**: `{문자열 변수명}.equalsIgnoreCase({비교할 문자열});`
- **설명**: 대소문자를 구분하지 않고 두 문자열을 비교합니다.

### 2. 문자열 포함 여부 확인
- **사용법**: `{문자열 변수명}.contains({특정 문자열});`
- **설명**: 문자열 내에 특정 문자열이 포함되어 있는지 확인합니다.

### 3. 문자열 시작/끝 확인
- **사용법**:
  - 시작: `{문자열 변수명}.startsWith({특정 문자열});`
  - 끝: `{문자열 변수명}.endsWith({특정 문자열});`
- **설명**: 문자열이 특정 문자열로 시작하거나 끝나는지 확인합니다.

### 4. 문자열 길이
- **사용법**: `{문자열 변수명}.length();`
- **설명**: 문자열의 길이를 반환합니다.

### 5. 문자열 자르기 (공백 제거)
- **사용법**: `{문자열 변수명}.trim();`
- **설명**: 문자열 양쪽의 공백을 제거합니다.

<hr style="border: 0; height: 2px; background: linear-gradient(to right, #f06, #4a90e2);" />


# Course02. 알고리즘 정리

## 1. 에라토스네스 체 알고리즘 : 소수 개수 출력

에라토스네스 체 알고리즘은 주어진 수까지의 소수를 구하는 효율적인 방법입니다. 이 알고리즘은 소수인지 아닌지에 대한 정보를 담은 체크 배열을 사용합니다.

### 알고리즘 설명

주어진 수 `n`에 대해 2부터 `n`까지의 숫자를 검사하면서, 소수인 숫자는 체크 배열을 통해 소수임을 표시합니다. 소수가 아닌 숫자는 그 배수들을 체크 배열에 표시하여, 이후 소수가 아닌 숫자들을 걸러낼 수 있습니다.

### 코드 구현

```java
int[] checkList = new int[n + 1];  // 체크 배열 초기화

int answer = 0;  // 소수의 개수

for (int i = 2; i <= n; i++) {
    // i가 아직 체크되지 않았다면 소수
    if (checkList[i] == 0) {
        answer++;  // 소수 개수 증가
    }
    // i의 배수들을 모두 체크
    for (int j = i; j <= n; j += i) {
        checkList[j] = 1;  // 배수들은 소수가 아님
    }
}
```

### 동작 과정
1. checkList[i] == 0인 경우, i는 소수로 판단하고 소수 개수를 증가시킵니다.
2. i의 배수들은 모두 소수가 아니므로, 그 배수들에 대해 checkList[j] = 1을 실행하여 해당 숫자들을 소수가 아님으로 표시합니다.
3. n까지 반복하면서 최종적으로 소수의 개수를 구합니다.
---
## 2. 자연수 뒤집기
자연수를 뒤집는 과정은 주어진 자연수 x에서 각 자리 숫자를 추출하고, 이를 뒤집은 값으로 조합하는 방식입니다. x를 10으로 나누면서 각 자리를 하나씩 처리합니다.

### 코드 구현
```java
int tmp = 0;  // 뒤집은 값을 저장할 변수
int t = 0;    // 각 자릿수를 저장할 변수

while (x > 0) {
    t = x % 10;         // x의 일의 자리를 구함
    tmp = tmp * 10 + t; // tmp에 자릿수를 추가
    x = x / 10;         // x에서 일의 자리를 제거
}
```
### 동작 과정
1. x % 10을 사용하여 x의 일의 자리를 t에 저장합니다.
2. tmp = tmp * 10 + t로 tmp에 t를 뒤집은 자리수대로 추가합니다.
3. x = x / 10으로 x에서 가장 낮은 자리를 제거하여 다시 반복합니다.
4. x가 0이 될 때까지 반복하여, tmp에는 x의 자리를 뒤집은 값이 저장됩니다.


<hr style="border: 0; height: 2px; background: linear-gradient(to right, #f06, #4a90e2);" />

# Course03. 슬라이딩 윈도우와 투 포인터 알고리즘 (Sliding Window & Two Pointer Algorithm)

슬라이딩 윈도우와 투 포인터 알고리즘은 **배열이나 리스트**에서 **연속된 부분 배열** 또는 **부분 문자열**을 효율적으로 처리하기 위한 알고리즘 기법입니다. 두 알고리즘은 모두 **포인터**를 사용하여 **범위를 탐색**하는 방식입니다. 슬라이딩 윈도우는 **고정된 크기**의 윈도우를, 투 포인터는 **가변적인 크기**의 윈도우를 사용합니다.

## 기본 아이디어

### 슬라이딩 윈도우
- 주어진 문제에 대해 **고정된 크기**의 윈도우를 사용하여 **배열이나 문자열**을 탐색합니다.
- 윈도우의 크기는 처음에 고정되며, 이를 **슬라이딩**하면서 결과를 계산합니다.
- 주로 **연속된 부분 배열**이나 **부분 문자열**을 다룰 때 사용됩니다.

### 투 포인터
- 두 개의 포인터(`lt`, `rt`)를 사용하여 **배열이나 문자열**의 부분을 탐색합니다.
- **윈도우 크기**는 **동적으로** 조정되며, 조건을 만족하는 구간을 찾을 때 사용됩니다.
- `lt`는 윈도우의 **시작**을, `rt`는 **끝**을 나타내며, 두 포인터를 활용해 범위를 조절합니다.

## 두 알고리즘의 차이점

| 알고리즘          | 슬라이딩 윈도우                                   | 투 포인터                                      |
|-------------------|--------------------------------------------------|------------------------------------------------|
| **윈도우 크기**    | 고정된 크기                                       | 가변적인 크기                                  |
| **포인터**         | 하나의 포인터를 이동시키며 범위를 확장 (또는 축소) | 두 개의 포인터를 사용하여 동적으로 범위 조정   |
| **주요 용도**      | 고정 크기의 부분 배열을 처리할 때               | 부분 배열 크기를 조정하며 조건을 만족하는 경우 |

---

## 슬라이딩 윈도우 예시: 연속된 k개의 숫자 합 구하기

배열에서 연속된 `k`개의 숫자 합을 구하는 문제는 **슬라이딩 윈도우**로 해결할 수 있습니다. 윈도우 크기는 `k`로 고정되며, 윈도우를 오른쪽으로 한 칸씩 슬라이딩합니다.

### 코드 구현

```java
public int maxSum(int[] arr, int k) {
    int n = arr.length;
    int maxSum = 0;
    int windowSum = 0;

    // 첫 번째 윈도우를 계산
    for (int i = 0; i < k; i++) {
        windowSum += arr[i];
    }
    maxSum = windowSum;

    // 슬라이딩 윈도우로 나머지 부분 계산
    for (int i = k; i < n; i++) {
        windowSum = windowSum - arr[i - k] + arr[i];
        maxSum = Math.max(maxSum, windowSum);
    }

    return maxSum;
}
```

### 동작 설명
1. 처음에는 배열의 첫 번째 k개의 값을 더하여 첫 번째 윈도우의 합을 구합니다.
2. 이후 윈도우를 오른쪽으로 한 칸씩 슬라이딩하면서 windowSum을 갱신합니다.
  * 슬라이딩할 때, 이전 윈도우의 첫 번째 값을 빼고 새로운 값을 더하여 윈도우의 합을 계산합니다.
3. maxSum을 계산하면서 최댓값을 찾습니다.

---

## 투 포인터 예시: 연속된 부분 배열의 합이 k인 경우
투 포인터를 사용하여 연속된 부분 배열의 합이 k인 경우의 수를 구하는 문제를 해결할 수 있습니다. 이때 윈도우의 크기는 동적으로 조정됩니다.

### 코드 구현
```java 
public int solution(int[] dataSet, int k) {
    int answer = 0;
    int sum = 0;
    int lt = 0;  // 왼쪽 포인터

    // rt는 오른쪽 포인터로 배열을 끝까지 순회합니다.
    for (int rt = 0; rt < dataSet.length; rt++) {
        sum += dataSet[rt];  // rt가 가리키는 값을 더함
        
        // sum이 k일 때, 카운트를 증가시킴
        if (sum == k) {
            answer++;
        }

        // sum이 k 이상일 때, lt를 증가시켜 윈도우 크기를 축소
        while (sum >= k) {
            sum -= dataSet[lt++];  // lt를 이동시키며 sum을 축소

            if (sum == k) {
                answer++;
            }
        }
    }

    return answer;  // 결과 반환
}
```

### 동작 설명
1. rt 포인터는 배열을 끝까지 순회하면서 부분 배열의 합 sum을 갱신합니다.
2. sum == k일 때마다 answer를 증가시킵니다.
3. sum이 k 이상이 되면, lt 포인터를 이동시켜 부분 배열의 크기를 축소하면서 sum을 갱신합니다. 이때 sum == k가 될 경우 추가적으로 answer를 증가시킵니다.

---

## 요약

- **슬라이딩 윈도우**: 고정된 크기 윈도우를 사용하여 연속된 부분 배열의 합 등을 구할 때 유용합니다.
- **투 포인터**: 두 포인터(`lt`, `rt`)를 사용하여 윈도우의 크기를 동적으로 조정하면서 문제를 해결하는 방식입니다. 윈도우 크기를 자유롭게 변경하며 범위를 탐색할 수 있습니다.

<hr style="border: 0; height: 2px; background: linear-gradient(to right, #f06, #4a90e2);" />


# Course04. HashMap과 TreeSet

자바에서 자주 사용되는 자료구조인 **`HashMap`**과 **`TreeSet`**은 각각 **키-값 쌍**과 **정렬된 집합**을 다루는 자료구조입니다. 두 자료구조는 사용 목적과 동작 방식에서 차이가 있으며, 적절한 상황에서 각각 유용하게 사용됩니다.

## 1. HashMap

### 특징
- 키-값 쌍 (Key-Value Pair)으로 데이터를 저장하는 자료구조입니다.
- 키는 **고유**해야 하며, 값은 중복될 수 있습니다.
- **순서가 보장되지 않습니다**. (입력 순서와 출력 순서가 다를 수 있음)
- 내부적으로 **해시 테이블**을 사용하여 효율적인 검색과 삽입을 지원합니다.

### 주요 사용 사례
- **키를 이용한 값 조회**: 주어진 키에 해당하는 값을 빠르게 찾고 싶을 때.
- **중복 값 방지**: 키가 중복되면 새로운 값으로 덮어쓰여서 유일한 키-값 쌍을 유지해야 할 때.
- **빠른 삽입 및 삭제**: O(1) 시간 복잡도로 삽입과 삭제를 처리할 수 있습니다.

### 주요 메소드

- **`put(K key, V value)`**  
  키와 값을 매핑하여 저장합니다. 만약 이미 존재하는 키라면 기존 값을 덮어씁니다.
  ```java
  map.put("apple", 1);
  ```

- **`get(Object key)`**  
  주어진 키에 해당하는 값을 반환합니다. 키가 없으면 null을 반환합니다.
  ```java
  int value = map.get("apple"); // 1
  ```

- **`containsKey(Object key)`**  
  주어진 키가 맵에 존재하는지 확인합니다.
  ```java
  boolean hasKey = map.containsKey("apple"); // true
  ```

- **`remove(Object key)`**  
  주어진 키에 해당하는 키-값 쌍을 제거합니다.
  ```java
  map.remove("apple");
  ```

- **`keySet()`**  
  맵에 저장된 모든 키를 반환합니다. (Set 형태)
  ```java
  Set<String> keys = map.keySet();
  ```

- **`values()`**  
  맵에 저장된 모든 값을 반환합니다. (Collection 형태)
  ```java
  Collection<Integer> values = map.values();
  ```

- **`size()`**  
  맵에 저장된 항목의 개수를 반환합니다.
  ```java
  int size = map.size();
  ```

- **`clear()`**  
  모든 항목을 제거합니다.
  ```java
  map.clear();
  ```

---
## 2. TreeSet

### 특징
- **정렬된** 집합(Set) 자료구조입니다.
- 중복된 값을 허용하지 않습니다.
- 내부적으로 이진 검색 트리 (Red-Black Tree)를 사용하여 데이터를 정렬하고 관리합니다.
- 자동으로 **오름차순**으로 정렬됩니다. (내림차순으로 정렬하려면 Comparator를 사용할 수 있음)

### 주요 사용 사례
- **중복 없는 정렬된 집합**을 다룰 때 사용합니다.
- 값이 정렬된 상태로 유지되어야 할 때 유용합니다.
- 범위 검색: 특정 범위에 속한 값들을 쉽게 찾을 수 있습니다.

### 주요 메소드

- **`add(E e)`**  
  집합에 요소를 추가합니다. 중복된 요소는 추가되지 않습니다.
  ```java
  set.add(5); 
  ```

- **`contains(Object o)`**  
  주어진 값이 집합에 존재하는지 확인합니다.
  ```java
  boolean exists = set.contains(5);
  ```

- **`remove(Object o)`**  
  주어진 값을 집합에서 제거합니다.
  ```java
  set.remove(5);
  ```

- **`size()`**  
  집합에 있는 요소의 개수를 반환합니다.
  ```java
  int size = set.size();
  ```

- **`first()`**  
  집합에서 가장 작은 값을 반환합니다.
  ```java
  Integer first = set.first(); // 최소값
  ```

- **`last()`**  
  집합에서 가장 큰 값을 반환합니다.
  ```java
  Integer last = set.last(); // 최대값 
  ```

- **`headSet(E toElement)`**  
  주어진 값보다 작은 값을 포함하는 집합을 반환합니다.
  ```java
  Set<Integer> head = set.headSet(5); // 5보다 작은 값들
  ```

- **`tailSet(E fromElement)`**  
  주어진 값보다 큰 값을 포함하는 집합을 반환합니다.
  ```java
  Set<Integer> tail = set.tailSet(5); // 5보다 큰 값들
  ```

- **`clear()`**  
  집합의 모든 요소를 제거합니다.
  ```java
  set.clear();
  ```

---
## HashMap과 TreeSet의 차이점
| 특징               | HashMap                             | TreeSet                                |
|--------------------|-------------------------------------|----------------------------------------|
| **내부 구조**       | 해시 테이블 (Hashing)               | 이진 검색 트리 (Red-Black Tree)        |
| **정렬 여부**       | 정렬되지 않음 (삽입 순서 유지되지 않음) | 자동으로 오름차순 정렬됨               |
| **중복 허용 여부**  | 키 중복은 허용하지 않지만 값은 중복 가능 | 중복된 값을 허용하지 않음              |
| **주요 용도**       | 키-값 쌍으로 데이터 저장            | 정렬된 집합을 다루며 중복을 제거하고 정렬 |
| **주요 메소드**     | `put()`, `get()`, `containsKey()` 등  | `add()`, `remove()`, `first()`, `last()` 등 |



### 설명

1. **HashMap**은 **키-값** 쌍을 처리하는 자료구조로, 빠른 검색과 삽입/삭제를 지원합니다. 주로 키를 이용해 값을 빠르게 찾거나, 값에 대한 중복을 허용해야 할 때 유용합니다.

2. **TreeSet**은 **정렬된 집합**을 다룰 때 사용되며, 중복을 허용하지 않으면서 **정렬된 순서**로 데이터를 처리합니다. 범위 검색이나 자동으로 정렬된 데이터를 다룰 때 매우 유용합니다.

<hr style="border: 0; height: 2px; background: linear-gradient(to right, #f06, #4a90e2);" />


# Course05. Stack과 Queue

자바에서 자주 사용되는 자료구조인 **`Stack`**과 **`Queue`**는 각각 **후입선출(LIFO)** 과 **선입선출(FIFO)** 방식으로 데이터를 처리하는 자료구조입니다. <br/>
두 자료구조는 데이터 처리 순서와 동작 방식에서 차이가 있으며, 다양한 상황에서 유용하게 활용됩니다.

---

## 1. Stack

### 특징
- **후입선출(LIFO, Last In First Out)**: 가장 마지막에 추가된 데이터가 가장 먼저 처리됩니다.
- **동기화 지원**: `Vector`를 기반으로 구현되어 동기화된 메소드를 제공합니다.
- **재귀적 문제 해결**: 함수 호출 스택, 수식 계산 등에 사용됩니다.

### 주요 메소드

- **`push(E item)`**  
  스택의 맨 위에 데이터를 추가합니다.
  ```java
  Stack<Integer> stack = new Stack<>();
  stack.push(10);
  stack.push(20);

- **`pop()`**  
  스택의 맨 위 데이터를 제거하고 반환합니다. 스택이 비어 있으면 EmptyStackException을 발생시킵니다.
  ```java
  int top = stack.pop(); // 20

- **`peek()`**  
  스택의 맨 위 데이터를 반환하되, 제거하지는 않습니다.
  ```java
  int top = stack.peek(); // 10

- **`isEmpty()`**  
  스택이 비어 있는지 확인합니다.
  ```java
  boolean empty = stack.isEmpty(); // false

- **`search(Object o)`**  
  스택에서 객체의 위치를 반환합니다. (1부터 시작하며, 맨 위가 1) 없으면 -1을 반환합니다.
  ```java
  int position = stack.search(10); // 1

---

## 2. Queue

### 특징
- **선입선출(FIFO, First In First Out)** : 먼저 추가된 데이터가 가장 먼저 처리됩니다.
- **인터페이스 기반**: Queue는 인터페이스이며, 일반적으로 LinkedList나 PriorityQueue를 통해 구현됩니다.
- **다양한 큐 종류**: 우선순위 큐, 이중 끝 큐 등 다양한 변형이 존재합니다.

### 주요 메소드

- **`add(E e)`**  
  큐의 끝에 데이터를 추가합니다. 공간이 부족하면 예외를 발생시킵니다.
  ```java
  Queue<String> queue = new LinkedList<>();
  queue.add("apple");
  queue.add("banana");

- **`offer(E e)`**  
  큐의 끝에 데이터를 추가합니다. 공간이 부족하면 예외 대신 false를 반환합니다.
  ```java
  boolean success = queue.offer("cherry");

- **`poll()`**  
  큐의 맨 앞 데이터를 제거하고 반환합니다. 큐가 비어 있으면 null을 반환합니다.
  ```java
  String front = queue.poll(); // "apple"

- **`remove()`**  
  큐의 맨 앞 데이터를 제거하고 반환합니다. 큐가 비어 있으면 예외를 발생시킵니다.
  ```java
  String front = queue.remove(); // "banana"

- **`peek()`**  
  큐의 맨 앞 데이터를 반환하되, 제거하지는 않습니다. 큐가 비어 있으면 null을 반환합니다.
  ```java
  String front = queue.peek(); // "cherry"

- **`element()`**  
  큐의 맨 앞 데이터를 반환하되, 제거하지 않습니다. 큐가 비어 있으면 예외를 발생시킵니다.
  ```java
  String front = queue.element();

<hr style="border: 0; height: 2px; background: linear-gradient(to right, #f06, #4a90e2);" />


# Course06. 알고리즘 정리

## 1. 선택 정렬 (Selection Sort)

### 정의
배열을 반복하면서 가장 작은 값을 선택해 현재 위치와 교환하는 정렬 알고리즘입니다.

### 시간 복잡도
- **최선, 평균, 최악**: O(n²)

### 코드 및 설명
```java
for (int i = 0; i < dataSet.length; i++) {
    int index = i;
    int min = dataSet[i];
    for (int j = i; j < dataSet.length; j++) {
        if (min > dataSet[j]) { // 현재 최소값보다 작은 값을 찾음
            index = j;
            min = dataSet[j];
        }
    }
    // 가장 작은 값과 현재 위치를 교환
    int tmp = dataSet[i];
    dataSet[i] = dataSet[index];
    dataSet[index] = tmp;
}
return dataSet; 
```

- 외부 루프는 배열의 각 요소를 순회합니다.
- 내부 루프는 남은 요소들 중 가장 작은 값을 찾습니다

---

## 2. 버블 정렬 (Bubble Sort)

### 정의
인접한 두 요소를 비교하여 큰 값을 뒤로 보내는 과정을 반복하는 정렬 알고리즘입니다.

### 시간 복잡도
- **최선**: O(n) (정렬된 경우)
- **평균, 최악**: O(n²)

### 코드 및 설명
```java
for (int i = 0; i < dataSet.length; i++) {
    for (int j = 0; j < dataSet.length - i - 1; j++) {
        if (dataSet[j] > dataSet[j + 1]) { // 인접한 두 값을 비교
            // 교환
            int tmp = dataSet[j];
            dataSet[j] = dataSet[j + 1];
            dataSet[j + 1] = tmp;
        }
    }
}
return dataSet;
```

- 외부 루프는 정렬되지 않은 영역을 줄입니다.
- 내부 루프는 인접한 요소를 비교하고 교환합니다.

---

## 3. 삽입 정렬 (Insertion Sort)

### 정의
현재 위치의 값을 그보다 앞에 있는 정렬된 부분과 비교하여 적절한 위치에 삽입하는 정렬 알고리즘입니다.

### 시간 복잡도
- **최선**: O(n) (정렬된 경우)
- **평균, 최악**: O(n²)

### 코드 및 설명
```java
for (int i = 1; i < dataSet.length; i++) {
    int tmp = dataSet[i];
    int j = i - 1;
    for (; j >= 0; j--) {
        if (dataSet[j] > tmp) { // 비교하며 자리 이동
            dataSet[j + 1] = dataSet[j];
        } else break;
    }
    dataSet[j + 1] = tmp; // 적절한 위치에 삽입
}
return dataSet;
```

- 외부 루프는 정렬되지 않은 부분을 탐색합니다.
- 내부 루프는 현재 값을 정렬된 부분의 올바른 위치로 이동합니다.

--- 

## 4. LRU (Least Recently Used)

### 정의
최근에 가장 적게 사용된 데이터를 교체하는 캐싱 알고리즘입니다.

### 코드 및 설명
```java
int[] answer = new int[size];

for (int i : dataSet) {
    int index = size - 1;
    for (int j = 0; j < size; j++) {
        if (i == answer[j]) { // 데이터가 이미 존재하면 위치 저장
            index = j;
        }
    }
    for (int j = index; j > 0; j--) { // 기존 데이터 밀어내기
        answer[j] = answer[j - 1];
    }
    answer[0] = i; // 새로운 데이터를 맨 앞에 삽입
}
return answer;
```

---

## 5. 이분 검색 (Binary Search)

### 정의
정렬된 배열에서 특정 값을 찾기 위해 중간값과 비교하여 탐색 범위를 절반으로 줄이는 검색 알고리즘입니다.

### 시간 복잡도
- **최선, 평균, 최악**: O(log n)

### 코드 및 설명
```java
int answer = 0;
Arrays.sort(dataSet); // 데이터 정렬

int lt = 0;
int rt = dataSet.length - 1;

while (lt <= rt) {
    int mid = (lt + rt) / 2;
    if (dataSet[mid] == checkPoint) { // 값을 찾음
        answer = mid + 1;
        break;
    }
    if (dataSet[mid] > checkPoint) rt = mid - 1; // 탐색 범위 축소
    else lt = mid + 1;
}
return answer;
```

---

## 6. 결정 알고리즘

### 정의
이분 검색을 응용하여 특정 조건을 만족하는 값의 최적 해를 찾는 알고리즘입니다. 예를 들어, 특정 자원을 최소화하는 문제를 해결할 때 사용됩니다.

### 코드 및 설명
```java 
int answer = 0;

int lt = Arrays.stream(dataSet).max().getAsInt(); // 최소값은 가장 큰 원소
int rt = Arrays.stream(dataSet).sum(); // 최대값은 전체 합

while (lt <= rt) {
    int mid = (lt + rt) / 2;
    if (count(dataSet, mid) <= x) { // 조건 만족 여부 확인
        answer = mid; // 최적 값을 업데이트
        rt = mid - 1; // 탐색 범위 축소
    } else {
        lt = mid + 1;
    }
}
return answer;
```

<hr style="border: 0; height: 2px; background: linear-gradient(to right, #f06, #4a90e2);" />

# Course07. DFS와 BFS

## DFS (Depth First Search) 깊이 우선 탐색

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

## BFS (Breadth First Search) 너비 우선 탐색

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


 
