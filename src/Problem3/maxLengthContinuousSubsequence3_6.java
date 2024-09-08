package Problem3;

import java.util.Scanner;

public class maxLengthContinuousSubsequence3_6 {
    public int solution(int n,int k,int[] arr) {
        int answer=0,cnt=0,lt=0,tmp=0;
        for (int rt = 0; rt < n; rt++) {
            if(arr[rt]==0)cnt++;
            while(cnt>k){
                lt++;
                if(arr[lt]==0){
                    cnt--;
                }

            }
            tmp=rt-lt+1; //tmp를 지우고 rt-lt+1을 넣을 수도 있다.
            answer=Math.max(tmp,answer);
        }
        return answer;
    }

    public static void main(String[] args) {
        maxLengthContinuousSubsequence3_6 T = new maxLengthContinuousSubsequence3_6();
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
