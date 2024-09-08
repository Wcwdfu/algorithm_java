package Problem6;

import java.util.Scanner;
//장난꾸러기
public class p6_6 {
    public int[] solution(int n, int[] arr) {
        int[] answer= new int[2];
        for (int i = 0; i < n-1; i++) {
            if(arr[i]>arr[i+1] && answer[0]==0){
                answer[0]=i+1;
            }else if(arr[i]<arr[i+1] && answer[0]!=0){
                answer[1]=i+1;
            }
        }

        return answer;
    }

    //강의풀이
//    public ArrayList<Integer> solution(int n, int[] arr) {
//        ArrayList<Integer> answer= new ArrayList<>();
//        int[] tmp=arr.clone();
//        Arrays.sort(tmp);
//        for (int i = 0; i < n; i++) {
//            if(arr[i]!=tmp[i]) answer.add(i+1);
//        }
//        return answer;
//    }

    public static void main(String[] args) {
        p6_6 T = new p6_6();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=kb.nextInt();
        }
        for (int i : T.solution(n,arr)) {
            System.out.print(i+" ");
        }
    }
}
