package Problem1;

import java.util.Scanner;

public class stringCompression1_11 {
    public String solution(String str){
        String answer="";
        str=str+" ";
        int cnt=1;
        char c=str.charAt(0);
        for (int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i+1)==c){
                cnt++;
            }else{
                answer+=c;
                if(cnt!=1){
                    answer+=cnt;
                }
                c=str.charAt(i+1);
                cnt=1;
            }
        }

//        for (int i = 0; i < str.length() - 1; i++) {
//            if(str.charAt(i)== str.charAt(i+1))cnt++;
//            else{
//                answer+= str.charAt(i);
//                if(cnt>1)answer+=String.valueOf(cnt);
//                cnt=1;
//            }
//        }


        return answer;
    }

    public static void main(String[] args) {
        stringCompression1_11 T=new stringCompression1_11();
        Scanner kb=new Scanner(System.in);
        String str=kb.next();
        System.out.println(T.solution(str));
    }
}
