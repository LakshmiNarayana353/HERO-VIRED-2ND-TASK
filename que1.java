import java.util.Scanner;
import java.util.ArrayList;
public class que1 {
    public static void main(String args[])
    {
        ArrayList<Integer> set=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        int x[];
        int n;
        int a=0;
        n = sc.nextInt();
        x = new int[n];
        for(int i=0;i<n;i++)
        {
            x[i] = sc.nextInt();
        }
        sc.close();
        for(int i=0;i<n;i++)
        {
            a=a+x[i];
            set.add(a);
        }
        System.out.println(set);

    }
}