package Problem7;

import java.util.LinkedList;
import java.util.Queue;

//Tree 말단 노드까지의 가장 짧은 경로
// 1) DFS 풀이 2) BFS 풀이 (원래 정석 풀이)
public class shortestPathToEndNode7_9 {
    Node root;

    public int DFS(int L, Node root) {
        if(root.lt==null&&root.rt==null) return L;
        else return Math.min(DFS(L+1,root.lt),DFS(L+1,root.rt));
    }

    public int BFS(Node root) {
        Queue<Node> Q=new LinkedList<>();
        Q.offer(root);
        int L=0;
        while (!Q.isEmpty()) {
            int len=Q.size();
            for (int i = 0; i < len; i++) {
                Node cur=Q.poll();
                if(cur.lt==null&&cur.rt==null) return L;
                if(cur.lt!=null) Q.offer(cur.lt);
                if(cur.rt!=null) Q.offer(cur.rt);
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        shortestPathToEndNode7_9 tree=new shortestPathToEndNode7_9();
        tree.root=new Node(1);
        tree.root.lt=new Node(2);
        tree.root.rt=new Node(3);
        tree.root.lt.lt=new Node(4);
        tree.root.lt.rt=new Node(5);
        tree.root.rt.lt=new Node(6);
        tree.root.rt.rt=new Node(7);
        System.out.println(tree.DFS(0,tree.root));
        System.out.println(tree.BFS(tree.root));
    }
}
