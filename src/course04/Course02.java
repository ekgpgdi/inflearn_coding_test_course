package course04;

import java.util.HashMap;
import java.util.Scanner;

public class Course02 {
  public String solution(String str1, String str2) {
    HashMap<Character, Integer> charCount = new HashMap<>();

    for(char c : str1.toCharArray()) {
      charCount.put(c, charCount.getOrDefault(c, 0) + 1);
    }

    for(char c : str2.toCharArray()) {
      if(!charCount.containsKey(c) || charCount.get(c) == 0) return "NO";

      charCount.put(c, charCount.get(c) - 1);
    }

    return "YES";
  }

  public static void main(String[] args) {
    Course02 T = new Course02();
    Scanner in = new Scanner(System.in);
    String str1 = in.next();
    String str2 = in.next();

    System.out.println(T.solution(str1, str2));
  }
}
