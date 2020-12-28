import java.util.*;
import java.io.*;

class Main {
  public static int arr[][];
  public static int arr2[][];
  public static int result[][];
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;
    st = new StringTokenizer(br.readLine()," ");
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    arr = new int[N][M];

    for(int i=0;i<N;i++){
      st = new StringTokenizer(br.readLine()," ");
      for(int j=0;j<M;j++){
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    st = new StringTokenizer(br.readLine()," ");
    M = Integer.parseInt(st.nextToken());
    int L = Integer.parseInt(st.nextToken());
    arr2 = new int[M][L];

    for(int i=0;i<M;i++){
      st = new StringTokenizer(br.readLine()," ");
      for(int j=0;j<L;j++){
        arr2[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    result = new int[N][L];
    for(int i=0;i<N;i++){
      for(int j=0;j<L;j++){
        for(int k=0;k<M;k++){
          result[i][j] += arr[i][k] * arr2[k][j];
        }
      }
    }

    for(int i=0;i<N;i++){
      for(int j=0;j<L;j++){
        sb.append(result[i][j]+" ");
      }
      sb.append("\n");
    }
    System.out.print(sb);
  }
}