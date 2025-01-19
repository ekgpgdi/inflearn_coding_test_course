# `Stack`과 `Queue` - 주요 특징 및 메소드 

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
