package course06;

import java.util.Scanner;

public class Course01 {
  //  선택정렬
  private int[] solution(int[] dataSet) {
    for (int i = 0; i < dataSet.length; i++) {
      int index = i;
      int min = dataSet[i];
      for (int j = i; j < dataSet.length; j++) {
        if (min > dataSet[j]) {
          index = j;
          min = dataSet[j];
        }
      }

      int tmp = dataSet[i];
      dataSet[i] = dataSet[index];
      dataSet[index] = tmp;
    }

    return dataSet;
  }

  public static void main(String[] args) {
    Course01 T = new Course01();
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
