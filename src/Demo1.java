import java.util.Scanner;

/*
Write a recursive method for computing the sum of all the elements of an array. Start with an
algorithm in English, then translate this algorithm into code. Trace your method on the example
 of the following array with 3 elements: 2, 0, and 1.
 */
class Test1
{
    int arr[];
    int size;
    Test1()
    {
        Scanner s=new Scanner(System.in);
        size=s.nextInt();
        arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=s.nextInt();
        }

    }
    public int sum(int n)
    {
        if(n==0)
        {
            return arr[0];
        }
        return arr[n]+sum(n-1);
    }
}
public class Demo1 {
    public static void main(String[] args) {
        Test1 o1=new Test1();
        int res=o1.sum(o1.size-1);
        System.out.println(res);
    }
}
