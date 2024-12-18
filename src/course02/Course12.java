package course02;

import java.util.Scanner;
import java.util.*;

public class Course12 {

  public int solution(int[][] dataSet) {
    List<String> dataList = new ArrayList<>();

    for (int x = 0; x < dataSet.length; x++) {
      List<String> tmp = new ArrayList<>();
      for (int i = 0; i < dataSet[x].length; i++) {
        int mento = dataSet[x][i];
        for (int j = i + 1; j < dataSet[x].length; j++) {
          tmp.add(mento + "," + dataSet[x][j]);
        }
      }

      if (dataList.size() == 0) {
        dataList.addAll(tmp);
      } else {
        dataList.retainAll(tmp);
      }
    }

    return dataList.size();
  }

  public static void main(String[] args) {
    Course12 T = new Course12();
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int r = in.nextInt();
    int[][] dataSet = new int[r][n];

    for (int i = 0; i < r; i++) {
      for (int j = 0; j < n; j++) {
        dataSet[i][j] = in.nextInt();
      }
    }

    System.out.print(T.solution(dataSet));
  }
}
