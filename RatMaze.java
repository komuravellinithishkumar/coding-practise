public class RatMaze {

    public static void solve(int i , int j , int a[][]  , int n,int visited[][] , ArrayList<String> ans , String move ; int[] di , int[] dj ){
        if(i == n-1 && j == n-1){
            ans.add(move);
            return;
        }
        String direction = "DLRU";
        for(int ind = 0 ; ind < 4 ; ind++){
            int nexti = i+di[ind];
            int nextj = j+dj[ind];
            if(nexti >= 0 && nextj >=0 && nexti < n && nextj < n && visited[nexti][nextj]==0 && a[nexti][nextj]==1){
                visited[nexti][nextj]=1;
                solve(nexti, nextj, a, n, visited, ans , move+direction.charAt(ind),di,dj);
                visited[nexti][nextj]=0;
            }
        }
    }

    public static ArrayList<String> findpath(int[][] m, int n) {
        int[][] visited = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                visited[i][j] = 0;
            }
        }
        int[] di = { +1, 0, 0, -1 };
        int[] dj = { 0, -1, 1, 0 };
        ArrayList<String> ans = new ArrayList<>();
        if (m[0][0] == 1) {
            solve(0, 0, m, n, visited, ans, "", di, dj);
        }
    }

    public static void main(String args[]) {
        RatMaze rz = new RatMaze();
        int n = 4;
        int[][] a = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 1, 1, 0, 0 }, { 0, 1, 1, 1 } };
        ArrayList<String> result = rz.findpath(a, n);
        if (res.size() > 0) {
            for (int i = 0; i < res.size(); i++)
                System.out.print(res.get(i) + " ");
            System.out.println();
        } else {
            System.out.println(-1);
        }
    }
}