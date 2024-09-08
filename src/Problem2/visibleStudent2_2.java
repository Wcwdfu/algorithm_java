package Problem2;

import java.util.Scanner;

public class visibleStudent2_2 {
    public int solution(int n,int[] arr){
        int answer=1;
        int tall=arr[0];
        for (int i = 1; i < n; i++) {
//            if(arr[i]>arr[i-1]&&arr[i]>tall){
//                answer++;
//            }else{
//                if(tall<arr[i]){
//                    tall=arr[i-1];
//                }
//            }
            if(arr[i]>tall){
                answer++;
                tall=arr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        visibleStudent2_2 T = new visibleStudent2_2();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=kb.nextInt();
        }
        System.out.println(T.solution(n,arr));
    }
}
