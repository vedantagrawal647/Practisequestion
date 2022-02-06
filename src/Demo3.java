import java.util.Scanner;

/*
. Enter a string from user and store each character of a string in different nodes of a linked list
 and print the values
Input :  neeraj
Output :  n e e r a j
 */

class Node
{
    char data;
    Node next;

    Node(char data)
    {
        this.data=data;
    }

}
class SinglyLinkedList
{
    Node head;

    public void createlist(Node newnode)
    {
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }

    public void displaylist()
    {
        if(head==null)
        {
            System.out.println("empty linked list");
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                System.out.print( temp.data + " ");
                temp=temp.next;
            }
            System.out.println(temp.data);
        }
    }
}
public class Demo3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        SinglyLinkedList obj=new SinglyLinkedList();
        for(int i=0;i<str.length();i++)
        {
            obj.createlist(new Node(str.charAt(i)));
        }
        obj.displaylist();
    }
}
