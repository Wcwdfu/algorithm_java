package Problem7;
// 이진트리 순회(넓이우선탐석 : 레벨탐색)
//       1 --------0
//    2     3 -----1
//  4  5  6  7 ----2
// 레벨 탐색 순회 출력 : 1 2 3 4 5 6 7

import java.util.LinkedList;
import java.util.Queue;

public class breathFirstSearch7_7 {
    Node root;

    public void BFS(Node root) {
        Queue<Node> Q=new LinkedList<>();
        Q.offer(root);
        int L=0;
        while (!Q.isEmpty()) {
            int len=Q.size();
            System.out.print(L+" : ");
            for (int i = 0; i < len; i++) {
                Node cur=Q.poll();
                System.out.print(cur.data+" ");
                if(cur.lt!=null) Q.offer(cur.lt);
                if(cur.rt!=null) Q.offer(cur.rt);
            }
            L++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        breathFirstSearch7_7 tree=new breathFirstSearch7_7();
        tree.root=new Node(1);
        tree.root.lt=new Node(2);
        tree.root.rt=new Node(3);
        tree.root.lt.lt=new Node(4);
        tree.root.lt.rt=new Node(5);
        tree.root.rt.lt=new Node(6);
        tree.root.rt.rt=new Node(7);
        tree.BFS(tree.root);
    }

}

