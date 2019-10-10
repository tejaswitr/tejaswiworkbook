package Demo;

import java.util.HashMap;
import java.util.LinkedHashMap;

//1.How to Print duplicate characters from String
public class DuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="maheee";
int count=0;
int n=s.length();
for(int i=0;i<=n-1;i++)
{
	for(int j=i+1;j<=n-1;j++)
		{
		
		if(s.charAt(i)==s.charAt(j))
		{
			count++;
			
		}
		
		}
	System.out.println(s.charAt(i)+"present"+count);
		}

	}
	





}
