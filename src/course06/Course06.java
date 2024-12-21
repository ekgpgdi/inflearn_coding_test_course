package course06;

import java.util.Scanner;

public class Course06 {
  /*  9
  120 125 152 130 135 135 143 127 160*/

  private int[] solution(int[] dataSet) {
    int[] answer = new int[2];

    for (int i = 1; i < dataSet.length - 1; i++) {
      if (dataSet[i + 1] < dataSet[i]) {
        for (int j = i + 2; j < dataSet.length - 1; j++) {
          if (dataSet[j] < dataSet[j - 1] && dataSet[j] < dataSet[j + 1]) {
            answer[0] = i + 1;
            answer[1] = j + 1;
            return answer;
          }
        }
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    Course06 T = new Course06();
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int[] dataSet = new int[size];
    for (int i = 0; i < size; i++) {
      dataSet[i] = in.nextInt();
    }

    for (int i : T.solution(dataSet)) {
      System.out.print(i + " ");
    }
  }
}
