package Problem5;

import java.util.Scanner;
import java.util.Stack;

public class cutIronBar5_5 {
    //쇠막대기 자르기
    public int solution(String str) {
        int answer=0,index=0;
        Stack<Character> stack=new Stack<>();

        for (Character c : str.toCharArray()) {
            if(c=='(')stack.push(c);
            else{
                stack.pop();
                if(str.charAt(index-1)=='('){
                    answer+=stack.size();
                }else if (str.charAt(index-1)==')'){
                    answer++;
                }
            }
            index++;
        }

        return answer;
    }

    public static void main(String[] args) {
        cutIronBar5_5 T = new cutIronBar5_5();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();

        System.out.println(T.solution(str));
    }
}
