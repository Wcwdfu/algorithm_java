package Problem7;
//부분집합구하기(DFS)
public class findSubSet7_6 {
    static int n;
    static int[] ch;

    public void DFS(int L) {
        if (L == n + 1) {
            String tmp="";
            for (int i = 0; i <= n; i++) {
                if(ch[i]==1) tmp+=(i+" ");
            }
            if(tmp.length()>0) System.out.println(tmp);
        } else {
            ch[L]=1;
            DFS(L+1);
            ch[L]=0;
            DFS(L+1);
        }
    }

    public static void main(String[] args) {
        findSubSet7_6 T=new findSubSet7_6();
        n=3;
        ch=new int[n+1];
        T.DFS(1);
    }
}
