package Problem7;

import java.util.Scanner;

//그래프와 인접행렬 무방향,방향 그래프
//경로탐색(인접 행렬) (1번에서 5번 정점으로 가는 가지 수)
//노드수가 많아지면 매우 비효율적인 방법

//경로탐색(인접리스트)
public class routeNav1 {
    static int n, m, answer=0; //n:도착해야하는 노드번호 , m:입력될 간선 수
    static int[][] graph;
    static int[] ch;


    public void DFS_row(int v) {
        if(v==n) answer++;
        else{
            for (int i = 0; i < n; i++) {
                if(graph[v][i]==1&&ch[i]==0){
                    ch[i]=1;
                    DFS_row(i);
                    ch[i]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        routeNav1 T = new routeNav1();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        graph=new int[n+1][n+1];
        ch=new int[n+1];
        for (int i = 0; i <=n; i++) {
            int a=kb.nextInt();
            int b=kb.nextInt();
            graph[a][b]=1;
        }
        ch[1]=1;
        T.DFS_row(1);
        System.out.println(answer);
    }
}
