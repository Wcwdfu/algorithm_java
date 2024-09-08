package Problem6;

import java.util.Scanner;
//Least Recently Used

public class leastRecentlyUsed6_4 {
    public int[] solution(int n, int[] arr) {
        int[] c=new int[n];
        for (int i : arr) {
            int pos=-1;
            for (int j = 0; j < n; j++) { // 이 부분이 참이면 hit인것
                if(i==c[j]) pos=j;
            }
            if(pos==-1){ // miss처리
                for (int j = n-1; j >= 1; j--) {
                    c[j]=c[j-1];
                }
            }else{ //hit 처리
                for (int j = pos; j >= 1; j--) {
                    c[j]=c[j-1];
                }
            }
            c[0]=i; //맨앞에 일 번호 넣어줌
        }
        return c;
    }

    public static void main(String[] args) {
        leastRecentlyUsed6_4 T = new leastRecentlyUsed6_4();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr=new int[m];
        for (int i = 0; i < m; i++) {
            arr[i]=kb.nextInt();
        }
        for (int i : T.solution(n,arr)) {
            System.out.print(i+" ");
        }
    }
}
