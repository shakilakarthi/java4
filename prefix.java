import java.util.*;
public class longest_prefix
{
public static void main(String ar[])throws Exception
{
Scanner sc=new Scanner(System.in);
int x,y;
x=sc.nextInt();
String a[]=new String[100];
for(int i=0;i<n;i++)
{
a[i]=sc.next();
}
String long,check;
if(a.length>0)
long=a[0];
for(int i=1;i<a.length;i++)
{
check=a[i];
for(y=0;y<Math.min(long.length(),a[i].length());y++)
{
if(long.charAt(y)!=check.charAt(y))
break;
}
long=a[i].subString(0,y);
}
System.out.println("longest prefix is:"+long);
}
}