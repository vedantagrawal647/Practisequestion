/*
Q. Print an array that contains the exact same number as the given array, but rearrange so that
 all the even numbers come before all the odd numbers. Other than that, the numbers can be in any
  order. You may modify and print the given array, or make a new array.
Rearrange ([3,3,2]) -> [2,3,3]
Rearrange(0,1,0,1,1,]) -> [0,0,1,1,1]
 */
import java.util.LinkedList;
import java.util.Scanner;

class Test2
{
    int arr[],arrnew[];
    int size;
    LinkedList<Integer> l1;
    LinkedList<Integer> l2;
    Test2()
    {
        Scanner s=new Scanner(System.in);
        size=s.nextInt();

        arr=new int[size];
        arrnew=new int[size];

        l1=new LinkedList<>();
        l2=new LinkedList<>();

        for(int i=0;i<size;i++)
        {
            arr[i]=s.nextInt();

        }

    }

    public int[] result()
    {
        for(int i=0;i<size;i++)
        {
            if(arr[i]%2==0)
            {
                l1.add(arr[i]);
            }
            else
            {
                l2.add(arr[i]);
            }
        }
        for(int i=0;i<size;i++)
        {
            if(i<l1.size())
            {
                arrnew[i]=l1.get(i);
            }
            else
            {
                arrnew[i]=l2.get(i-l1.size());
            }

        }
        return arrnew;
    }
}
public class Demo2 {
    public static void main(String[] args) {
        Test2 obj=new Test2();
        int[] a=obj.result();
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}