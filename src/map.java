import java.util.*;
public class map {
	public static void main(String[] args){
		Map map=new HashMap();
		map.put(new Integer(1), "a");
		map.put(new Integer(1), "b");
		System.out.print(map);
	}
}
