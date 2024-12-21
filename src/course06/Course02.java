package course06;

import java.util.Scanner;

public class Course02 {
  //  버블정렬
  private int[] solution(int[] dataSet) {
    for (int i = 0; i < dataSet.length; i++) {
      for (int j = 0; j < dataSet.length - i - 1; j++) {
        if (dataSet[j] > dataSet[j + 1]) {
          int tmp = dataSet[j];
          dataSet[j] = dataSet[j + 1];
          dataSet[j + 1] = tmp;
        }
      }
    }

    return dataSet;
  }

  public static void main(String[] args) {
    Course02 T = new Course02();
    Scanner in = new Scanner(System.in);
    int count = in.nextInt();
    int[] dataSet = new int[count];
    for (int i = 0; i < count; i++) {
      dataSet[i] = in.nextInt();
    }
    for (int i : T.solution(dataSet)) {
      System.out.print(i + " ");
    }
  }
}
