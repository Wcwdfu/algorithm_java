package Problem4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
//4-3 매출액의 종류

public class typeOfSales4_3 {
    //    public ArrayList<Integer> solution(int n, int m, int[] arr) {
//        ArrayList<Integer> answer=new ArrayList<>();
//        HashMap<Integer, Integer> map = new HashMap<>();
//        int lt=0;
//        for (int rt = 0; rt < n; rt++) {
//            map.put(arr[rt],map.getOrDefault(arr[rt],0)+1);
//            if(rt-lt>m-1){
//                map.put(arr[lt],map.get(arr[lt])-1);
//                if(map.get(arr[lt])==0){
//                    map.remove(arr[lt]);
//                }
//                lt++;
//            }
//            if(rt-lt==m-1){
//                answer.add(map.size());
//            }
//        }
//
//        return answer;
//    }
    //강의풀이
    public ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer=new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k-1; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int lt=0;
        for (int rt = k-1; rt < n; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt],0)+1);
            answer.add(map.size());
            map.put(arr[lt],map.get(arr[lt])-1);
            if(map.get(arr[lt])==0)map.remove(arr[lt]);
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        typeOfSales4_3 T = new typeOfSales4_3();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
        System.out.println(T.solution(n,m,arr));
    }
}
