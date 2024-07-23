import java.io.*;
import java.util.*;
class Bikers
{
static int S[] = new int[5];
static int i;
static int avg;
static int sum=0;
public static void main(String args[ ])
{
Scanner sc=new Scanner(System.in);
System.out.println(" Enter Speed of five Bike Racer");
Scanner input = new Scanner(System.in);
for(i=0;i<5;i++)
{
S[i]=sc.nextInt();
}
System.out.println("Speed of riders is:");
for(i=0;i<5;i++)
{
System.out.println(S[i]);
sum+=S[i];
}
avg=sum/5;
System.out.println("Average is :"+avg);
for(i=0;i<5;i++)
{
if( S[i]>avg)
System.out.println("The Speed of Qualifying Racer is"+S[i]);
}
}
}
