package Problem1;

import java.util.Scanner;

public class extreactOnlyNumber1_9 {
    public int solution(String s){
        int answer=0;
        for (char x : s.toCharArray()) {
//            if(x>=48 && x<=57) answer=answer*10+(x-48);  아스키코드 알때
            if(Character.isDigit(x)) answer+=x;
        }

        return answer;
    }

    public static void main(String[] args) {
        extreactOnlyNumber1_9 T=new extreactOnlyNumber1_9();
        Scanner kb=new Scanner(System.in);
        String str=kb.next();
        System.out.println(T.solution(str));
    }
}
