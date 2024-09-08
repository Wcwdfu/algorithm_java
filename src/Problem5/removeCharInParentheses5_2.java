package Problem5;
import java.util.Scanner;
import java.util.Stack;
//괄호 안 문자제거

public class removeCharInParentheses5_2 {
    public String solution(String str) {
        String answer="";
        Stack<Character> stack=new Stack<>();
        for (Character c : str.toCharArray()) {
            if(c==')') {
                while(stack.pop()!='(');
            }else stack.push(c);
        }
        for (int i = 0; i < stack.size(); i++) {
            answer+=stack.get(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        removeCharInParentheses5_2 T = new removeCharInParentheses5_2();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}