package test.main;

import java.util.HashMap;
import java.util.Map;

public class MainClass10 {
	public static void main(String[] args) {
		/*
		 * 	회원정보는 숫자(int), 문자(String) 으로 구성되어 있기 때문에
		 * 	value의 generic 은 Object로 지정해야한다.
		 */
		Map<String, Object> map = new HashMap<>();
		// value의 generic 이 Object 이기 때문에 어떤 type 이든지 담을 수 있다.
		map.put("num", 1);
		map.put("name", "김구라");
		map.put("addr", "노량진");
		
		// object type으로 return되기 때문에 원래 type으로 되돌려주는 casting 작업 해주어야 함
		int num = (int)map.get("num");
		String name = (String)map.get("name");
		String addr = (String)map.get("addr");
	}
}


