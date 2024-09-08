package Problem2;

import java.util.Scanner;

public class temporaryClassLeader2_11 {
    public int solution(int n, int[][] arr){
        int answer=0, max=Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int cnt=0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= 5; k++) {
                    if(arr[i][k]==arr[j][k]){ //어짜피 모든학생이 1번씩 더 카운팅되서 배제할필요x
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt>max){
                max=cnt;
                answer=i;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        temporaryClassLeader2_11 T=new temporaryClassLeader2_11();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[][] arr=new int[n+1][6];
        // i는 학생번호 k는 학년수
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                arr[i][j]=kb.nextInt();
            }
        }
        System.out.println(T.solution(n,arr));
    }
}
