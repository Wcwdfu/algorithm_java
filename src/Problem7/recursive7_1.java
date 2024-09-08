package Problem7;
//재귀함수
//back tracking
public class recursive7_1 {
    public void DFS(int n) {
        if (n >= 0) {
            System.out.println(n);
            DFS(n-1);
        }
    }

    public static void main(String[] args) {
        recursive7_1 T= new recursive7_1();
        T.DFS(3);
    }
}
