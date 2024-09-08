package Problem2;

import java.util.Scanner;

public class rockScissorsPapers2_3 {//1:가위, 2:바위, 3:보
    public String solution(int n,int[] a,int[] b){
        String answer = "";
        for (int i = 0; i < n; i++) {
            if(a[i]==b[i]){
                answer+="D";
            }else if((a[i]==1&&b[i]==3)||(a[i]==2&&b[i]==1)||(a[i]==3&&b[i]==2)){
                answer+="A";
            }else{
                answer+="B";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        rockScissorsPapers2_3 T = new rockScissorsPapers2_3();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] A=new int[n];
        int[] B=new int[n];
        for (int i = 0; i < n; i++) {
            A[i]=kb.nextInt();
        }
        for (int i = 0; i < n; i++) {
            B[i]=kb.nextInt();
        }
        for (char x : T.solution(n,A,B).toCharArray()) {
            System.out.println(x);
        }
    }
}
