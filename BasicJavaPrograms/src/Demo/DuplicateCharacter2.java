package Demo;

import java.util.LinkedHashMap;

public class DuplicateCharacter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s1= {"m","a","h","e","e"};
		LinkedHashMap<String,Integer> hash=new LinkedHashMap<String,Integer>();
		for(String s2:s1)
		{
			if(!hash.containsKey(s2))
			{
				hash.put(s2, 1);
			}
			else
			{
			int v	=hash.get(s2);
			v++;
			hash.put(s2, v);
			}
		}
		System.out.println(hash);
	}

}
