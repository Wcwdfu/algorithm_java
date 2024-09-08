package Problem4;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;
//k번째 큰 수

public class kthLargestNumber4_5 {
    public int solution(int n, int m, int[] arr) {
        int answer=-1;
        TreeSet<Integer> Tset=new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    Tset.add(arr[i]+arr[j]+arr[k]);
                }
            }
        }
        int cnt=0;
        for (Integer i : Tset) {
            cnt++;
            if(cnt==m) return i;
        }
        return answer;
    }



    public static void main(String[] args) {
        kthLargestNumber4_5 T = new kthLargestNumber4_5();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=kb.nextInt();
        }
        System.out.println(T.solution(n,m,arr));
    }
}
