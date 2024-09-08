package Problem7;
//부분집합구하기(DFS)
//            1
//    2(o)         2(x)
//  3(o)  3(x)  3(o)  3(x)
//
// (1,2,3),(1,2),(1,3),(1),(2,3),(2),(3)
public class findSubSet7_6 {
    static int n;
    static int[] ch;

    public void DFS(int L) {
        if (L == n + 1) { //종착점에 왔을때
            String tmp="";
            for (int i = 0; i <= n; i++) {
                if(ch[i]==1) tmp+=(i+" ");
            }
            if(tmp.length()>0) System.out.println(tmp);
        } else { // 종착점에 오지 않았을때
            ch[L]=1;
            DFS(L+1); //왼쪽으로 뻗는다 (사용한다(o))
            ch[L]=0;
            DFS(L+1); //오른쪽으로 뻗는다 (사용하지 않는다(x))
        }
    }

    public static void main(String[] args) {
        findSubSet7_6 T=new findSubSet7_6();
        n=3;
        ch=new int[n+1];
        T.DFS(1);
    }
}
