import java.util.*;
import java.util.Map.Entry;


public class prac {
	/*public static Integer[] sort(List<Integer> list){
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(Integer i : list){
			if(map.keySet().contains(i)){
				map.put(i, map.get(i)+1);
			}else{
				map.put(i, 1);
			}
		}
		Integer[] arr=new Integer[map.size()];
		for(Integer i : map.keySet()){
			arr
		}
		
	}*/
	public static void  main(String[] args){
		//List<Integer> list=new ArrayList<Integer>();
		/*Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt()){
			list.add(sc.nextInt());
		}*/
		String a=",.dsf,.";
		a=a.replaceAll("^[,\\.]*|[,\\.]*$","");
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put(null,7);
		map.put(null,8);
		List<Entry<String,Integer>> list=new ArrayList<Entry<String,Integer>>();
		Set<Entry<String,Integer>> set=map.entrySet();
		list.addAll(set);
		System.out.println(map.get(null));
	}
}
