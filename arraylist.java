package collection;
import java.util.*;
class Arraylist
{
private int x[];
private int size;
private int index;
Arraylist(int size)
{
	this.size = size;
	index = -1;
	x = new int[this.size];
}
	
public void add(int data)
 {
	 if(index == size-1)
	{
	      int temp[] = x;
	      double s = this.size*1.5;
	      this.size = this.size+ (int)(s);
	      x = new int[this.size];
                         for(int i=0 ;i<=index;i++)
 {
	 x[i] = temp[i];
 }
	 index ++;
	x[index ++] = data;}
	else
 {
	index  ++;
	x[index] = data;
}
}
public void traverse()
{
        if(index==-1)
{
           System.out.println("Empty");
}
        else
{
           for(int i=0;i<=index;i++)
{
	System.out.println(x[i]);
              }
            }
}
    public void delete(int f)
 {
    for(int i =  0;i<=index;i++)
 {
    if(f == x[i])
 {
    int j = i;
    while(j<=index)
 {
     x[j]=x[j+1];
   }
     index--;
    }
 }
    }
}
public class Array_list 
{
  public static void main(String[] x) 
{
Arraylist l = new Arraylist(5);
 for(int i=1;i<=5;i++)
{
                    l.add(i*10);}
         	l.add(60);
      	l.traverse();
      	System.out.println("Enter the number to be deleted");
      	Scanner sc = new Scanner(System.in);
      	int f = sc.nextInt();
      	l.delete(f);
      	l.traverse();
  }
}