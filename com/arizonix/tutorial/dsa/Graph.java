package com.arizonix.tutorial.dsa;

public class Graph {

    int adjMatrix[][];
    Graph(int nodes){
        adjMatrix= new int[nodes][nodes];//4*4
    }

    //[[0,2],[0,1],[2,0]]
    public void addEdgesInMatrix(int edges[][], boolean isDirected){
        for(int edge[]:edges){
            int u = edge[0];
            int v = edge[1];

            //directed
            if(isDirected) {
                adjMatrix[u][v] = 1;
            }else {
                //undirected
                adjMatrix[u][v] = 1;
                adjMatrix[v][u] = 1;
            }
        }
    }

    public void printMatrix(){
        for(int i=0;i<adjMatrix.length;i++){
            System.out.print("row "+(i+1)+" -> ");
            for (int j=0; j<adjMatrix[i].length;j++){
                System.out.print(adjMatrix[i][j]+" , ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int edges[][] = {{0,2},{0,1},{1,3}};
        int nodes = 4;
        Graph graph = new Graph(nodes);
        graph.addEdgesInMatrix(edges,false);
        graph.printMatrix();
    }
}
