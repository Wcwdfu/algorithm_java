package Problem4;

import java.util.HashMap;
import java.util.Scanner;

public class anagram4_2 {
    public String solution(String s1, String s2) {
        String answer="YES";
        HashMap<Character,Integer> map=new HashMap<>();
        for (char c : s1.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for (char c : s2.toCharArray()) {
            if(!map.containsKey(c)||map.get(c)==0) return "NO";
            map.put(c,map.get(c)-1);
        }

        return answer;
    }


    public static void main(String[] args) {
        anagram4_2 T = new anagram4_2();
        Scanner kb = new Scanner(System.in);
        String s1=kb.nextLine();
        String s2=kb.nextLine();

        System.out.println(T.solution(s1,s2));
    }
}
