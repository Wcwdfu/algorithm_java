package Problem1;

import java.util.Scanner;

public class Main {
    public String solution(int n,String s){
        String answer="";
        for (int i = 0; i < n; i++) {
            String tmp=s.substring(0,7).replace('#','1').replace('*','0');
            int num=Integer.parseInt(tmp,2);
            answer+=(char)num;
            s=s.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T=new Main();
        Scanner kb=new Scanner(System.in);

        int n=kb.nextInt();
        String str=kb.next();

//        int n = kb.nextInt();
//        kb.nextLine(); // 정수 입력 후 공백 제거
//        String str = kb.nextLine();

        System.out.println(T.solution(n,str));
    }
}
