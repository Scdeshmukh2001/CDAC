public class Pattern6{ 
public static void main(String[] args) { 
for (int i = 1; i <= 7; i += 2) 
{ 
for (int j = 1; j <= i; j++) 
{
System.out.print("*");
}
System.out.println();
}
for (int i = 5; i >= 1; i -= 2) 
{ 
for (int j = 1; j <= i; j++) 
{
System.out.print("*");
}
System.out.println();
}
}
}