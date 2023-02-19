import java.util.Scanner;
import java.util.LinkedList;
import java.util.Collections;
public class que2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> a = new LinkedList<>();
        LinkedList<Integer> b = new LinkedList<>();
        a.add(20);
        a.add(40);
        a.add(50);
        a.add(10);
        a.add(30);
        b.add(70);
        b.add(50);
        b.add(60);
        b.add(90);
        b.add(80);
        System.out.println(a);
        System.out.println(b);
        a.addAll(1, b);
        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);
        sc.close();
    }
}