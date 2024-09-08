package Problem7;
//이진수 출력
public class binaryNum7_2 {
    public void DFS(int n) {
        if(n==0) return;
        else{
            DFS(n/2);
            System.out.print(n%2);
        }
    }

    public static void main(String[] args) {
        binaryNum7_2 T=new binaryNum7_2();
        T.DFS(11);
    }
}
