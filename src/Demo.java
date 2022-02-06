/*
Q. The Olympic results are given in a table, where each row represents a country, and columns
represent gold, silver, and bronze medals. For example, the element r[0][0] is the number of gold
medals earned by the 0-th country. Write a method that takes the table as an input, and returns a
 new array which lists the total number of medals for each country. For example, if we start with
  the table
     2   0   1
     3   2   0
     0   0   2
in which the 0-th country earned 2 + 0 + 1 = 3 medals, the 1-st country earned 3 + 2 + 0 = 5 medals,
 and the 2nd country earned 0 + 0 + 2 = 2 medals, your method should return an array with values

 */

import java.util.Scanner;

class Test {
    int arr[][];
   int row_size ,col_size;
   int arrnew[];
    Test()
    {
        Scanner s=new Scanner(System.in);
        row_size=s.nextInt();
        col_size=s.nextInt();
        arr=new int[row_size][col_size];
        for(int i=0;i<row_size;i++)
        {
            for(int j=0;j<col_size;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }
        arrnew=new int[row_size];
    }

    public int[] sum()
    {
        for(int i=0;i<row_size;i++)
        {
            int c=0;
            for(int j=0;j<col_size;j++)
            {
                c=c+arr[i][j];
            }
            arrnew[i]=c;
        }
        return arrnew;
    }

}

public class Demo {
    public static void main(String[] args) {
        Test obj=new Test();
        int[] arr=obj.sum();
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}


