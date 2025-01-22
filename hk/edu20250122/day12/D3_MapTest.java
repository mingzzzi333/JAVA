package hk.edu20250122.day12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class D3_MapTest {

	public static void main(String[] args) {
		
		//저장하는 형태 - =K:v, K:v, K:v, K:v
		// 			--> js에서 json형식 : {k:V, k:v, k:v}
		Map<String, String> map = new HashMap< >();
		map.put("하나", "한경"); //key값은 중복되면 안된다.
		map.put("둘", "닷컴");
		map.put("셋", "IT");
		
		System.out.println(map.get("하나")+map.get("둘"));
		
		Set<String> setKeyMap=map.keySet(); //key값들을 Set으로 반환
		Iterator<String> iterKeyMap=setKeyMap.iterator();
		while(iterKeyMap.hasNext()) { //값 존재 확인하기
			String str = iterKeyMap.next(); // 값 가져오기
			System.out.println(map.get(str));
		}
		
		//k : ["1", "2",...] map 안에 list객체를 넣을 수 있다.
		Map<String,List<String>> map2 =new HashMap<String, List<String>>();
	}
}
