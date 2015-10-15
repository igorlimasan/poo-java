import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Anagrama {

	public static boolean saoAnagrama(String string, String string2) {
		string2=string2.toLowerCase();
		string=string.toLowerCase();
		int qtde=0;
		
		List<Character>lista=new ArrayList<Character>();
		List<Character>lista2=new ArrayList<Character>();
		for(char c:string.replace(" ", "").toCharArray())
		{
			lista.add(c);
		}
		for(char c:string2.replace(" ", "").toCharArray())
		{
			lista2.add(c);
		}
		return lista.containsAll(lista2) && lista.size()==lista2.size();
		
		
		
	}
	

}
