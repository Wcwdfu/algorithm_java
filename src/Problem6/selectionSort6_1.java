package Problem6;

import java.util.Scanner;

public class selectionSort6_1 {
    public int[] solution(int n, int[] arr){
        for (int i = 0; i < n - 1; i++) {
            int idx=i;
            for (int j = i+1; j <n ; j++) {
                if(arr[j]<arr[idx]) idx=j;

            }
            int tmp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=tmp;
        }

        return arr;
    }

    public static void main(String[] args) {
        selectionSort6_1 T = new selectionSort6_1();
        Scanner kb = new Scanner(System.in);
        int n= kb.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=kb.nextInt();
        }
        for (int i : T.solution(n,arr)) {
            System.out.print(i+" ");
        }
    }
}
