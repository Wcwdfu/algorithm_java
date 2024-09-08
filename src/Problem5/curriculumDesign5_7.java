package Problem5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//교육과정 설계

public class curriculumDesign5_7 {
    public String solution(String s1, String s2) {
        Queue<Character> q=new LinkedList<>();
        for (Character c : s1.toCharArray()) {
            q.offer(c);
        }
//        int index=0;
//        while (!q.isEmpty()) {
//            if(q.contains(s2.charAt(index))){
//                if(q.poll()!=s2.charAt(index))return "NO";
//            }
//            index++;
//        }

        for (char c : s2.toCharArray()) {
            if(q.contains(c)){
                if(c!=q.poll())return "NO";
            }
        }
        if(!q.isEmpty())return "NO";

        return "YES";
    }

    public static void main(String[] args) {
        curriculumDesign5_7 T = new curriculumDesign5_7();
        Scanner kb = new Scanner(System.in);
        String s1 = kb.next();
        String s2 = kb.next();
        System.out.println(T.solution(s1,s2));
    }
}
