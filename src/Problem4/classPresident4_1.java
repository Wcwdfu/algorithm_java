package Problem4;

import java.util.HashMap;
import java.util.Scanner;

//학급 회장
public class classPresident4_1 {
    public char solution(int n, String s) {
        char answer=' ';
        HashMap<Character, Integer> map=new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c,0)+1);
        }
        int max=Integer.MIN_VALUE;
        for (char c : map.keySet()) {
            if(map.get(c)>max){
                max=map.get(c);
                answer=c;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        classPresident4_1 T=new classPresident4_1();
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        String str=kb.next();
        System.out.println(T.solution(n,str));
    }
}
