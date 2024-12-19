package course04;

import java.util.*;
import java.util.Scanner;

public class Course03 {
  public List<Integer> solution(int[] dataSet, int size) {
    List<Integer> answerList = new ArrayList<>();
    HashMap<Integer, Integer> priceSet = new HashMap<>();

    for (int i = 0; i < size; i++) {
      priceSet.put(dataSet[i], priceSet.getOrDefault(dataSet[i], 0) + 1);
    }

    answerList.add(priceSet.size());

    for (int i = 1; i < dataSet.length - size + 1; i++) {
      if (priceSet.get(dataSet[i - 1]) == 1) priceSet.remove(dataSet[i - 1]);
      else priceSet.put(dataSet[i - 1], priceSet.get(dataSet[i - 1]) - 1);

      priceSet.put(dataSet[i + size - 1], priceSet.getOrDefault((dataSet[i + size - 1]), 0) + 1);

      answerList.add(priceSet.size());
    }

    return answerList;
  }

  public static void main(String[] args) {
    Course03 T = new Course03();
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int size = in.nextInt();

    int[] dataSet = new int[n];
    for (int i = 0; i < n; i++) {
      dataSet[i] = in.nextInt();
    }

    for (int k : T.solution(dataSet, size)) {
      System.out.print(k + " ");
    }
  }
}
