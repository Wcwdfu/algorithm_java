package Problem6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class checkDuplicates6_5 {
    //정렬 풀이
    public char solution(int n, int[] arr) {
        char answer='U';
        //정렬 풀이
//        Arrays.sort(arr);
//        for (int i = 0; i < n-1; i++) {
//            if(arr[i]==arr[i+1]){
//                return 'D';
//            }
//        }

        //해시맵 풀이
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i : arr) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for (Integer i : map.keySet()) {
            if(map.get(i)>=2)return 'D';
        }

        return answer;
    }

    //해시맵 풀이
    public static void main(String[] args) {
        checkDuplicates6_5 T = new checkDuplicates6_5();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=kb.nextInt();
        }
        System.out.println(T.solution(n,arr));
    }
}
