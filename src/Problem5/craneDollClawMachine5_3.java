package Problem5;

import java.util.Scanner;
import java.util.Stack;

public class craneDollClawMachine5_3 {
    public int solution(int n, int[][] arr, int m, int[] arr2) {
        int answer=0,picked=0;
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < m; i++) { //선택된 라인을 계쏙 돔)
            picked=arr2[i]-1;
            System.out.println("선택된값: "+picked);
            for (int j = 0; j <n; j++) { //크레인 내려감
                if(arr[j][picked]!=0){
                    if(!stack.isEmpty()&&stack.peek()==arr[j][picked]){
                        System.out.println("2개라서 사라진값:"+arr[j][picked]); //1,3 나와야함
                        stack.pop();
                        answer+=2;
                    }else{
                        stack.push(arr[j][picked]);
                        System.out.println("넣어준값: "+arr[j][picked]);
                    }
                    arr[j][picked]=0;
                    break;
                }
            }
        }

        return answer;
    }

//    public int solution(int[][] arr, int[] arr2) {
//         int answer=0;
//         Stack<Integer> stack=new Stack<>();
//        for (int pos : arr2) {
//            for (int i = 0; i < arr.length; i++) { //크레인이 내려가는것
//                if(arr[i][pos-1]!=0){
//                    int tmp=arr[i][pos-1]; //인형번호를 넣음
//                    arr[i][pos-1]=0; //그 자리를 0으로 채워줌
//                    if(!stack.isEmpty() && tmp==stack.peek()){
//                        answer+=2;
//                        stack.pop();
//                    }else stack.push(tmp);
//                    break;
//                }
//            }
//        }
//        return answer;
//    }


    public static void main(String[] args) {
        craneDollClawMachine5_3 T = new craneDollClawMachine5_3();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][]arr=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]=kb.nextInt();
            }
        }
        int m=kb.nextInt();
        int[]arr2=new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i]=kb.nextInt();
        }
//        System.out.println(T.solution(arr,arr2));
        System.out.println(T.solution(n,arr,m,arr2));
    }
}
