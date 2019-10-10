package Demo;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class NonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String value=sc.nextLine();
char[] values1 = value.toCharArray();
System.out.println(value);
int count=0;
LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character,Integer>();
for(char values2:values1)
{

if(!map.containsKey(values2))
{
	map.put(values2,1);
}
else
{
	int v=map.get(values2);
	v++;
	map.put(values2, v);
	
}

	}
//System.out.println(map);
Set<Character> a = map.keySet();
for(char b:a)
{
	if(map.get(b)==1)
	{
		System.out.println(b);
	}
}
////for(Object map1:map)

}
}
