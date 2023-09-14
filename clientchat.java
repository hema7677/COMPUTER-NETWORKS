import java.io.*;//input output process
import java.net.*; //network related process
public class clientchat
{
public static void main(String a[])
{
String d; 
 InetAddress ia;
  Socket c;//interacting with client
  BufferedReader input;
  PrintStream ps;
  try 
{	
 c=new Socket(InetAddress.getLocalHost(),4444);
	 System.out.println("Connected");
while(true)
{
	System.out.println("Enter Client message");
  	 input=new BufferedReader(new InputStreamReader(System.in));
  	d=input.readLine();
   	
 	ps=new PrintStream(c.getOutputStream());

ps.println(d);
 input=new BufferedReader(new InputStreamReader(c.getInputStream()));
d=input.readLine();

 System.out.println("Server message"+d);
if(d.equalsIgnoreCase("bye"))
{
break;
}}
}
ps.close();
input.close();
c.close();
      }	
 catch(IOException i)
{
  System.out.println(i);
}}}