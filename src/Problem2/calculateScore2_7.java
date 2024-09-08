package Problem2;

import java.util.Scanner;

public class calculateScore2_7 {

    public int solution(int n,int[] arr){
        int total=0;
        int score=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==1){
                score++;
            }else{
                score=0;
            }
            total+=score;
        }

        return total;
    }


    public static void main(String[] args) {
        calculateScore2_7 T = new calculateScore2_7();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=kb.nextInt();
        }

        System.out.println(T.solution(n,arr));
    }
}
