package Problem5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//응급실
class Person{
    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}
public class EmergencyRoom5_8 {
    public int solution(int n, int m, int[] arr) {
        int answer=1;
        Queue<Person> q=new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.offer(new Person(i,arr[i]));
        }
        while (!q.isEmpty()) {
            Person tmp=q.poll();
            for (Person person : q) {
                if (person.priority > tmp.priority) {
                    q.offer(tmp);
                    tmp=null;
                    break;
                }
            }
            if (tmp != null) {
                if(tmp.id==m) return answer;
                else answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        EmergencyRoom5_8 T = new EmergencyRoom5_8();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=kb.nextInt();
        }
        System.out.println(T.solution(n,m,arr));

    }
}
