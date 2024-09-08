package Problem3;

import java.util.ArrayList;
import java.util.Scanner;

//두 배열 합치기 two pointers algorithm
public class combineTwoArray3_1 { //퀵정렬 : O(nlogn) ->말고 On으로 짜라
    public ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                answer.add(arr1[i++]);
            } else {
                answer.add(arr2[j++]);
            }
        }
        while(i<n)answer.add(arr1[i++]);
        while(j<m)answer.add(arr2[j++]);
        return answer;
    }

    public static void main(String[] args) {
        combineTwoArray3_1 T = new combineTwoArray3_1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = kb.nextInt();
        }
        for (Integer i : T.solution(n, m, arr1, arr2)) {
            System.out.print(i + " ");
        }
    }
}
