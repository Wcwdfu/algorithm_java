package Problem3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//공통원소 구하기(교집합)
public class findCommonElements3_2 {
    public ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2) {
        ArrayList<Integer> answer= new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0,j=0;
        while(i<n&&j<m){
            if(arr1[i]==arr2[j]){
                answer.add(arr1[i++]);
                j++;
            }else if(arr1[i]<arr2[j])i++;
            else j++;
        }

        return answer;
    }

    public static void main(String[] args) {
        findCommonElements3_2 T = new findCommonElements3_2();
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
