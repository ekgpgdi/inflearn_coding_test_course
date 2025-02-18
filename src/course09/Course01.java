package course09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Person implements Comparable<Person> {
    public int height;
    public int weight;

    public Person(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Person o) {
        return o.height - this.height;
    }
}

public class Course01 {

    public int solution(ArrayList<Person> personList) {
        int answer = personList.size();
        int max = 0;
        Collections.sort(personList);

        for (Person person : personList) {
            if (max > person.weight) answer--;

            max = Math.max(max, person.weight);
        }

        return answer;
    }

    public static void main(String[] args) {
        Course01 T = new Course01();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Person> personList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int height = in.nextInt();
            int weight = in.nextInt();

            personList.add(new Person(height, weight));
        }
        System.out.print(T.solution(personList));
    }
}
