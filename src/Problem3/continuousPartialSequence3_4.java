package Problem3;

import java.util.Scanner;

public class continuousPartialSequence3_4 {
    public int solution(int n, int m, int[] arr) {
//        int answer=0,sum=0,lt=0,rt=0;
//        while(rt<n){
//            sum=0;
//            for (int i = lt; i <= rt; i++) {
//                sum+=arr[i];
//            }
//            if(sum<m){rt++;}
//            else if(sum>m){lt++;}
//            else{
//                answer++;
//                rt++;
//            }
//
//        }

        int answer=0,sum=0,lt=0;
        for (int rt = 0; rt <n ; rt++) {
            sum+=arr[rt];
            if(sum==m)answer++;
            while(sum>=m){
                sum-=arr[lt++];
                if(sum==m) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        continuousPartialSequence3_4 T = new continuousPartialSequence3_4();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n,m,arr));
    }
}
