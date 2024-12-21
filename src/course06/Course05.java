package course06;

import java.util.Scanner;
import java.util.*;

public class Course05 {
  private String solution(int[] dataSet) {
    String answer = "U";
    Arrays.sort(dataSet);

    for (int i = 0; i < dataSet.length - 1; i++) {
      if (dataSet[i] == dataSet[i + 1]) {
        return "D";
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    Course05 T = new Course05();
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int[] dataSet = new int[size];
    for (int i = 0; i < size; i++) {
      dataSet[i] = in.nextInt();
    }

    System.out.println(T.solution(dataSet));
  }
}
