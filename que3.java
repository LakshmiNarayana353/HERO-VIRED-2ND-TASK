import java.util.LinkedList;
public class que3
{
    public static void main(String[] args) 
    {
        LinkedList<Integer> num = new LinkedList<Integer>();
        num.add(1);
        num.add(4);
        num.add(5);
        num.add(4);
        num.add(1);
        num.add(2);
        num.add(5);
        num.add(3);
        num.add(4);
        num.add(1);
        num.add(2);
        num.add(3);
        
        LinkedList<Integer> uniqueNumbers = new LinkedList<Integer>();
        for(Integer a: num)
        {
            if(!uniqueNumbers.contains(a))
                uniqueNumbers.add(a);
        }
        System.out.println(uniqueNumbers);
    }
}