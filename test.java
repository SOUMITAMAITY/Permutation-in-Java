public class test {

    public static int findpath(int x,int y,int m,int n){
        if(x==m-1 || y==n-1){
            return 1;
        }

        int right = findpath(x+1, y, m, n);
        int down = findpath(x, y+1, m, n);
        return right+down;
    }

    public static void main(String[] args) {
        System.out.println(findpath(0, 0, 3, 3));
    }
}