package Problem7;

import java.util.ArrayList;
import java.util.Scanner;


//경로탐색(인접리스트) 정점의 개수가 많아지면 arraylist로 해야한다.
public class routeNav2 {
    static int n, m, answer=0; //n:도착해야하는 노드번호 , m:입력될 간선 수
    static int[] ch;
    static ArrayList<ArrayList<Integer>> graph;

    public void DFS(int v) {
        if(v==n) answer++;
        else{
            for (int nv : graph.get(v)) { //v번 arraylist 를 뜻함
                if(ch[nv]==0){
                    ch[nv]=1;
                    DFS(nv);
                    ch[nv]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        routeNav2 T = new routeNav2();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();

        graph=new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <=n; i++) {
            graph.add(new ArrayList<Integer>()); //0번부터 만들어지지만 1번부터 접근할것
        }

        ch=new int[n+1];
        for (int i = 0; i <=n; i++) {
            int a=kb.nextInt();
            int b=kb.nextInt();
            graph.get(a).add(b); //get 0 하면 첫번쨰, 1 하면 두번쨰 꺼 접근
        }
        ch[1]=1;
        T.DFS(1);
        System.out.println(answer);
    }
}
