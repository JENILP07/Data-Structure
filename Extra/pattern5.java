import java.util.*;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[2*n-1][2*n-1];
        set(1 , n-1 , n-1, arr);
        for (int i = 0 ; i < arr.length ; i++){
            for ( int j = 0 ; j < arr.length ; j++ ){
              System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
    public static void set(int n ,  int i ,int  j , int[][] arr){
          if(i < 0){
            return;
          }    
          for(int x =0 ; x < arr.length ; x++){
            for(int y = 0 ; y < arr.length ; y++){
                if(x == i || x == j || y == i || y == j ){
                    
                        arr[x][y] = n;
                }
            }
          }

          set(n+1 , i-1 , j+1 , arr);
    }
}
