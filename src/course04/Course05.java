package course04;

import java.util.*;
import java.util.Scanner;

// 3장을 뽑을 수 있는 경우의 수 중 k 번째 큰 값
public class Course05 {

  public int solution(int[] dataSet, int k) {
    TreeSet<Integer> tSet = new TreeSet<>(Collections.reverseOrder());

    for (int i = 0; i < dataSet.length; i++) {
      for (int j = i + 1; j < dataSet.length; j++) {
        for (int l = j + 1; l < dataSet.length; l++) {
          tSet.add(dataSet[i] + dataSet[j] + dataSet[l]);
        }
      }
    }

    int cnt = 1;
    for (int x : tSet) {
      if (cnt == k) return x;
      cnt++;
    }

    return -1;
  }

  public static void main(String[] args) {
    Course05 T = new Course05();
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    int[] dataSet = new int[n];

    for (int i = 0; i < n; i++) {
      dataSet[i] = in.nextInt();
    }

    System.out.println(T.solution(dataSet, k));
  }
}
