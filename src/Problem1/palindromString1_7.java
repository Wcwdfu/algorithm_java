package Problem1;

import java.util.Scanner;

public class palindromString1_7 {
    public String solution(String str){
        String answer="NO"; //일반풀이 일땐 YES로 바꿈
        //StringBuilder사용
        String tmp=new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)) answer="YES";

        //일반풀이
//        str=str.toUpperCase();
//        int len=str.length();
//        for (int i = 0; i < len/2; i++) {
//            if(str.charAt(i)!=str.charAt(len-i-1)) return "NO";
//        }

        return answer;
    }

    public static void main(String[] args) {
        palindromString1_7 T=new palindromString1_7();
        Scanner kb=new Scanner(System.in);
        String str=kb.next();
        System.out.println(T.solution(str));
    }
}
