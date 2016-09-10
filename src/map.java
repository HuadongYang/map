import java.util.*;
public class map {
	public static void main(String[] args){
		Map map=new HashMap();
		map.put(new Integer(1), "a");
		map.put(new Integer(1), "b");
		map.put(new Integer(2), "c");
		System.out.print(map);
	}
}
