import java.util.LinkedList;
import java.util.Queue;
public class GraphMatrix {
    int vertexes;
    int[][] matrix;

    GraphMatrix(int vertexes) {
        this.vertexes = vertexes;
        matrix = new int[vertexes + 1][vertexes + 1];
    }

    public void matrix(int source, int boundary) {
        this.matrix[source][boundary] = 1;
        this.matrix[boundary][source] = 1;

    }

    public void show() {
        for (int i = 1; i < this.vertexes + 1; i++) {

            System.out.printf("vertex" +i +'\n');

            // cleSystem.out.println(matrix[i]);

            for (int j = 1; j < this.vertexes + 1; j++) {
                if(this.matrix[i][j]==1){
                    System.out.print(j+" ");

                }
            }
        }  
    }

    public void bfss(int source){
        // System.out.println(source);
        int[] visited = new int[vertexes+1];
        Queue <Integer> q = new LinkedList<>();
        visited[source]=1;
        q.add(source);
        // System.out.println(q);
        bfs(visited, q);
        for(int i=1;i< vertexes+1;i++){
            if(visited[i]==0){
                visited[i]=1;
                q.add(i);
                this.bfs(visited, q);
            }
        }
        
    }
    public void bfs(int[] visited,Queue<Integer> q){
        while(!q.isEmpty()){
            int vertex = q.poll();
            System.out.println(vertex);
            // System.out.println(vertex);
            int[] neighbour = this.matrix[vertex];
            for (int i=1;i<neighbour.length;i++){
            // System.out.println(neighbour[i]);
            if(neighbour[i]==1){
                if(visited[i]==0){
                    visited[i]=1;
                    q.add(i);
                    // System.out.println(q);
                }
            }
            }
        }
        



    }
    


   
    public static void main(String args[]) {
        GraphMatrix G = new GraphMatrix(6);
        // System.out.println(sizeof(matrix));
        G.matrix(2, 4);
        G.matrix(1,3);
        G.matrix(5,2);
        G.matrix(3,5);
        G.matrix(4,5);
        G.matrix(4,6);
        G.matrix(5,6);
        // G.show();
        G.bfss(2);
      

    }

}
