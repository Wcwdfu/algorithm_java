package Problem1;

import java.util.Scanner;

public class caseConversion1_2 {
    public String solution(String str){
        String answer="";
        for (char x : str.toCharArray()) {
            //아스키넘버 대문자는 65~90 소문자는 97~122 대-소 =32 차이남
            if(x>=97&&x<=122) answer+=(char)(x-32);
            else answer+=(char)(x+32);
            //일반적인 방법
//            if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
//            else answer+=Character.toLowerCase(x);
        }
        return answer;
    }
    public static void main(String[] args) {
        caseConversion1_2 T=new caseConversion1_2();
        Scanner kb=new Scanner(System.in);
        String str=kb.next();
        System.out.println(T.solution(str));

    }
}
