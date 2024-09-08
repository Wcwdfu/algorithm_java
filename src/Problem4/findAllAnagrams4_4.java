package Problem4;

import java.util.HashMap;
import java.util.Scanner;
//4-4 모든 아나그램 찾기

public class findAllAnagrams4_4 {
    public int solution(String s1, String s2) {
        int answer=0,l=s2.length();
        HashMap<Character,Integer>map=new HashMap<>();
        HashMap<Character,Integer>pmap=new HashMap<>();
        for (int i = 0; i < l; i++) {
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
        }
        for (int i = 0; i < l; i++) {
            pmap.put(s2.charAt(i),pmap.getOrDefault(s2.charAt(i),0)+1);
        }

        if(map.equals(pmap))answer++;
        int lt=0;
        //l=s2.length()-1로 하고 아래에 answer++ 을 2번쨰로 올리면 위에 answer++하는 코드 제거가능.
        for (int rt = l; rt < s1.length(); rt++) {
            map.put(s1.charAt(rt),map.getOrDefault(s1.charAt(rt),0)+1);
            map.put(s1.charAt(lt),map.get(s1.charAt(lt))-1);
            if(map.get(s1.charAt(lt))==0)map.remove(s1.charAt(lt));
            if(map.equals(pmap))answer++;
            lt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        findAllAnagrams4_4 T = new findAllAnagrams4_4();
        Scanner kb = new Scanner(System.in);
        String s1=kb.next();
        String s2=kb.next();
        System.out.println(T.solution(s1,s2));
    }
}
