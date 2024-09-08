package Problem3;
import java.util.Scanner;
//연속된 자연수의 합
public class sumOfConsecutiveNaturaNum3_5 {
    //two pointer
//    public int solution(int n) {
//        int answer=0,sum=0,lt=0;
//        int[] arr=new int[n/2+1];
//        for (int i = 0; i < n/2+1; i++) {
//            arr[i]=i+1;
//        }
//        for (int rt = 0; rt < n/2+1; rt++) {
//            sum+=arr[rt];
//            if(sum==n){answer++;}
//            while(sum>=n){
//                sum-=arr[lt++];
//                if(sum==n){answer++;}
//            }
//        }
//
//        return answer;
//    }

    // 수학적 풀이법
    public int solution(int n) {
        int answer=0,cnt=1;
        n--;
        while (n > 0) {
            cnt++;
            n-=cnt;
            if(n%cnt==0)answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        sumOfConsecutiveNaturaNum3_5 T = new sumOfConsecutiveNaturaNum3_5();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        System.out.println(T.solution(n));
    }
}
