package Problem1;

import java.util.Scanner;

public class shortestTextDistance1_10 {

    public int[] solution(String s,char t){
        int[] answer=new int[s.length()];
        int p=1000;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==t){
                p=0;
            }else{
                p++;
            }
            answer[i]=p;
        }
        p=1000;

        for (int i = s.length()-1; i >=0 ; i--) {
            if(s.charAt(i)==t){
                p=0;
            }else{
                p++;
                answer[i]=Math.min(answer[i],p);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        shortestTextDistance1_10 T=new shortestTextDistance1_10();
        Scanner kb=new Scanner(System.in);
        String str=kb.next();
        char c=kb.next().charAt(0);
        for (int i : T.solution(str, c)) {
            System.out.printf(i+" ");
        }
    }
}
