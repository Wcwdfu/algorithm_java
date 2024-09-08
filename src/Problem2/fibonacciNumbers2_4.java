package Problem2;

import java.util.Scanner;

public class fibonacciNumbers2_4 {
    public int[] solution(int n){
        int[] answer=new int[n];
        answer[0]=1;
        answer[1]=1;
        for (int i = 2; i < n; i++) {
            answer[i]=answer[i-1]+answer[i-2];
        }

        return answer;
    }

    //다른 풀이
//    public void solution(int n){
//        int a=1,b=1,c;
//        System.out.print(a+" "+b+" ");
//        for (int i = 2; i < n; i++) {
//            c=a+b;
//            System.out.println(c+" ");
//            a=b;
//            b=c;
//        }
//    }

    public static void main(String[] args) {
        fibonacciNumbers2_4 T = new fibonacciNumbers2_4();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        for (int x : T.solution(n)) {
            System.out.print(x+" ");
        }
    }
}
