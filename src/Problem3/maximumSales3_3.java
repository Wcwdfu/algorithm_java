package Problem3;
//최대매출 sliding window알고리즘
import java.util.Scanner;

public class maximumSales3_3 {
//    public int solution(int n, int k, int[] arr) {
//        int answer=0;
//        int i=k;
//        int sum=0;
//        for (i = 0; i < k; i++) {
//            sum+=arr[i];
//        }
//        int tmp=sum;
//
//        for (int j = 0; j < n-k; j++) {
//         sum-=arr[j];
//         sum+=arr[j+k];
//         answer=Math.max(answer,sum);
//        }
//        answer=Math.max(answer,tmp);
//        return answer;
//    }

    public int solution(int n, int k, int[] arr) {
        int answer=0,sum=0;
        for (int i = 0; i < k; i++) sum+=arr[i];
        answer=sum;
        for (int i = k; i <n ; i++) {
            sum+=(arr[i]-arr[i-k]);
            answer=Math.max(answer,sum);
        }



        return answer;
    }

    public static void main(String[] args) {
        maximumSales3_3 T = new maximumSales3_3();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n,k,arr));
    }
}
