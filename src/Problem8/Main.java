package Problem8;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node lt,rt;

    public Node(int data) {
        this.data = data;
        this.lt = null;
        this.rt = null;
    }
}
public class Main {
    Node root;

    public void DFS(Node root) {
        if(root==null)return;
        else{
            System.out.println();
            DFS(root.lt);
            DFS(root.rt);
        }
    }
    public void BFS(Node root) {
        Queue<Node> Q=new LinkedList<>();
        Q.offer(root);
        int L=0;
        while (!Q.isEmpty()) {
            System.out.print(L+" : ");
            int len=Q.size();
            for (int i = 0; i < len; i++) {
                Node cur=Q.poll();
                System.out.print(cur.data+" ");
                if(cur.lt!=null)Q.offer(cur.lt);
                if(cur.rt!=null)Q.offer(cur.rt);
            }
            L++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Main tree=new Main();
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
