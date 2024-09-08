package Problem1;

import java.util.Scanner;

public class validPalindrom1_8 {
    public String solution(String s){
        String answer="NO";
        s=s.toUpperCase().replaceAll("[^A-Z]", "");
        System.out.println(s);
        String tmp=new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)) answer="YES";

        return answer;
    }

    public static void main(String[] args) {
        validPalindrom1_8 T=new validPalindrom1_8();
        Scanner kb=new Scanner(System.in);
        String str=kb.nextLine();
        System.out.println(T.solution(str));
    }
}
