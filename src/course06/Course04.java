package course06;

import java.util.Scanner;

public class Course04 {
  private int[] solution(int size, int[] dataSet) {
    int[] answer = new int[size];

    for (int i : dataSet) {
      int index = size - 1;
      for (int j = 0; j < size; j++) {
        if (i == answer[j]) {
          index = j;
        }
      }
      for (int j = index; j > 0; j--) {
        answer[j] = answer[j - 1];
      }
      answer[0] = i;
    }
    return answer;
  }

  public static void main(String[] args) {
    Course04 T = new Course04();
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int count = in.nextInt();
    int[] dataSet = new int[count];
    for (int i = 0; i < count; i++) {
      dataSet[i] = in.nextInt();
    }
    for (int i : T.solution(size, dataSet)) {
      System.out.print(i + " ");
    }
  }
}
