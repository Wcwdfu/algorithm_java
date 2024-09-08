package Problem5;

import java.util.Scanner;
import java.util.Stack;

//후위식 연산
public class postfix5_4 {
    public int solution(String str) {
        int answer=0;
        Stack<Integer> stack=new Stack<>();
        for (char c : str.toCharArray()) {
            if(Character.isDigit(c)) {
//                int num=Character.getNumericValue(c);
//                stack.push(num);
                stack.push(c-48); //이렇게 해줘도 됨
            }else{
                int n1 = stack.pop();
                int n2 = stack.pop();
                int result=0;
                switch (c){
                    case'+':
                        result= n2+n1;break;
                    case'-':result= n2-n1;break;
                    case'*':result= n2*n1;break;
                    case'/':result= n2/n1;break;
                }
                stack.push(result);
            }
        }
        answer=stack.pop();

        return answer;
    }

    public static void main(String[] args) {
        postfix5_4 T = new postfix5_4();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(T.solution(str));
    }
}
