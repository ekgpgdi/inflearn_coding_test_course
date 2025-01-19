# 알고리즘 정리

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