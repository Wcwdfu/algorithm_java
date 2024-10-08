package Problem7;
//피보나치(메모이제이션)

public class fiboMemoization7_4 {
    static int[] fibo;
    public int DFS(int n) {
        if(fibo[n]>0) return fibo[n];
        if(n==1) return fibo[n]=1;
        else if(n==2) return fibo[n]=1;
        else return fibo[n]=DFS(n-2)+DFS(n-1);
    }

    public static void main(String[] args) {
        fiboMemoization7_4 T = new fiboMemoization7_4();
        int n=55;
        fibo=new int[n+1];
        T.DFS(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(fibo[i]+" ");

        }
    }
}
