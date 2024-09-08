package Problem6;

import java.util.Arrays;
import java.util.Scanner;

//마구간 정하기
public class settingUpAStable6_10 {
    public int count(int[] arr, int mid) {
        int p=0,count=1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[p] >= mid) {
                p=i;
                count++;
            }
        }
        return count;
    }
    public int solution(int n, int m, int[] arr) {
        int answer=0;
        Arrays.sort(arr);
        int lt=arr[0];
        int rt=arr[n-1];
        while (lt <= rt) {
            int mid=(lt+rt)/2;
            if (count(arr, mid) >= m) {
                answer=mid;
                lt=mid+1;
            }else rt=mid-1;
        }

        return answer;
    }

    public static void main(String[] args) {
        settingUpAStable6_10 T = new settingUpAStable6_10();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) arr[i]=kb.nextInt();
        System.out.println(T.solution(n,m,arr));
    }
}
