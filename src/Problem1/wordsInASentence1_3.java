package Problem1;

import java.util.Scanner;

public class wordsInASentence1_3 {
    public String solution(String str){
        String answer="";
        int max=Integer.MIN_VALUE, pos;
        //indexof와 substring 이용해서 풀기
        while((pos=str.indexOf(' '))!=-1){
            String tmp=str.substring(0,pos);
            int len=tmp.length();
            if(len>max){
                max=len;
                answer=tmp;
            }
            if(str.length()>max)answer=str;
            str=str.substring(pos+1);
        }

        //일반적인풀이
//        String[] s=str.split(" ");
//        for (String string : s) {
//            int len=string.length();
//            if(len>max){
//                max=len;
//                answer=string;
//            }
//        }
        return answer;
    }
    public static void main(String[] args) {
        wordsInASentence1_3 T=new wordsInASentence1_3();
        Scanner kb=new Scanner(System.in);
        String str=kb.nextLine();
        System.out.println(T.solution(str));
    }
}
