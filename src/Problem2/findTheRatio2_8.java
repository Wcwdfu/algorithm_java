package Problem2;

import java.util.Scanner;

public class findTheRatio2_8 {

    public int[] solution(int n,int[] arr){
        int[] answer=new int[n];
        for (int i = 0; i < n; i++) {
            answer[i]++;
            for (int j = 0; j < n; j++) {
                if(arr[i]<arr[j]) answer[i]++;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        findTheRatio2_8 T = new findTheRatio2_8();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=kb.nextInt();
        }

        for (int x : T.solution(n, arr)) {
            System.out.print(x+" ");
        }
    }
}
