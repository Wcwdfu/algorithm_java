package Problem1;

import java.util.ArrayList;
import java.util.Scanner;

public class flipWords1_4 {
    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer=new ArrayList<>();
        for (String string : str) {
            char[] c=string.toCharArray();
            int lt=0,rt=string.length()-1;
            while(lt<rt){
                char tmp=c[lt];
                c[lt]=c[rt];
                c[rt]=tmp;
                lt++;
                rt--;
            }
            String tmp=String.valueOf(c); //c라는 문자배열을 string화 시켜줌
        }

        //stringbuilder통해 해결
//        for (String s : str) {
//            String tmp=new StringBuilder(s).reverse().toString();
//            answer.add(tmp);
//        }

        return answer;
    }

    public static void main(String[] args) {
        flipWords1_4 T=new flipWords1_4();
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        String[] str=new String[n];
        for (int i = 0; i < n; i++) {
            str[i]=kb.next();
        }
        for (String s : T.solution(n,str)) {
            System.out.println(s);
        }
    }
}
