import java.util.Scanner;
public class Watermelon
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        if (a > 2 && a % 2 == 0){
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
}

