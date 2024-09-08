package Problem5;

import java.util.Scanner;
import java.util.Stack;

public class correctParentheses5_1 {
    public String solution(String str) {
        String answer="YES";
        Stack<Character> stack=new Stack<>();
        for (Character c : str.toCharArray()) {
            if(c=='(')stack.push(c);
            else{
                if(stack.isEmpty())return "NO";
                stack.pop();
            }
        }
        if(!stack.isEmpty())return "NO";
        return answer;
    }

    public static void main(String[] args) {
        correctParentheses5_1 T = new correctParentheses5_1();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
