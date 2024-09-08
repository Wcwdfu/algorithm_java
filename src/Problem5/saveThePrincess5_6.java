package Problem5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//공주 구하기

public class saveThePrincess5_6 {
    public int solution(int n, int m) {
        int answer=0;
        Queue<Integer>q=new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }
        while(!q.isEmpty()){
            for (int i = 1; i < m; i++) {
                q.offer(q.poll());
            }
            answer=q.poll();

        }

        return answer;
    }

    public static void main(String[] args) {
        saveThePrincess5_6 T = new saveThePrincess5_6();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        System.out.println(T.solution(n,m));
    }
}
