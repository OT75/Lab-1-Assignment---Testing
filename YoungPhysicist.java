 import java.util.*;
 public class YoungPhysicist
 {
         public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         int x = input.nextInt();
         int[][] array = new int[x][3];
         int a=0, b=0, c=0;
         for(int i=0; i<x; i++)
            for(int j=0; j<3; j++)
                array[i][j] = input.nextInt();
            for(int i=0; i<a; i++){
         a += array[i][0];
         b += array[i][1];
         c += array[i][2];
         }
         if(a==0 && b==0 && c==0)
         System.out.println("YES");
         else
         System.out.println("NO");
         }
         }