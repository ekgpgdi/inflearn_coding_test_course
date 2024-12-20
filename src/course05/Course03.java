package course05;

import java.util.*;
import java.util.Scanner;

public class Course03 {
  public int solution(int[][] dataSet, int[] move) {
    Stack<Integer> stack = new Stack<>();
    int answer = 0;

    for(int i : move) {
      int line = i - 1;
      for(int j = 0; j < dataSet.length; j++) {
        if(dataSet[j][line] > 0) {
          if(!stack.isEmpty() && stack.peek() == dataSet[j][line]) {
            stack.pop();
            answer += 2;
          } else {
            stack.push(dataSet[j][line]);
          }

          dataSet[j][line] = 0;
          break;
        }
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    Course03 T = new Course03();
    Scanner in = new Scanner(System.in);
    // 배열 크기
    int n = in.nextInt();
    int[][] dataSet = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        dataSet[i][j] = in.nextInt();
      }
    }

    int moveCount = in.nextInt();
    int[] move = new int[moveCount];

    for (int i = 0; i < moveCount; i++) {
      move[i] = in.nextInt();
    }

    System.out.println(T.solution(dataSet, move));
  }
}
