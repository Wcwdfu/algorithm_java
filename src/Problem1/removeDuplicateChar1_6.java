package Problem1;

import java.util.Scanner;

public class removeDuplicateChar1_6 {
    public String solution(String str){
        String answer="";
        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i))==i) answer+=str.charAt(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        removeDuplicateChar1_6 T=new removeDuplicateChar1_6();
        Scanner kb=new Scanner(System.in);
        String str=kb.next();
        System.out.println(T.solution(str));
    }
}
