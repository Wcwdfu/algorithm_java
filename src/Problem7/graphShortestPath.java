package Problem7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//그래프 최단거리(BFS)
//그래프에서 1번 정점에서 각 정점으로 가는 최소 이동 간선수를 출력하세요.

//레벨로 한건 숙제로 해볼것
//배열로 하는것도 2차원에선 쓰기떄문에 알아야함

public class graphShortestPath {
    static int n, m; //n:도착해야하는 노드번호 , m:입력될 간선 수
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch, dis;


    public void BFS(int v) {
        Queue<Integer> Q=new LinkedList<>();
        ch[v]=1;
        dis[v]=0;
        Q.offer(v);
        while (!Q.isEmpty()) {
            int cv=Q.poll();
            for (Integer nv : graph.get(cv)) {
                if (ch[nv] == 0) {
                    ch[nv]=1;
                    Q.offer(nv);
                    dis[nv]=dis[cv]+1;
                }
            }
        }
    }


    public static void main(String[] args) {
        graphShortestPath T = new graphShortestPath();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();

        graph=new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <=n; i++) {
            graph.add(new ArrayList<Integer>()); //0번부터 만들어지지만 1번부터 접근할것
        }

        ch=new int[n+1];
        dis=new int[n+1];
        for (int i = 0; i <m; i++) {
            int a=kb.nextInt();
            int b=kb.nextInt();
            graph.get(a).add(b); //get 0 하면 첫번쨰, 1 하면 두번쨰 꺼 접근
        }
        T.BFS(1);
        for (int i = 2; i <= n; i++) {
            System.out.println(i+" : "+dis[i]);
        }
    }
}
