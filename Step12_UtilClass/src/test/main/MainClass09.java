package test.main;

import java.util.HashMap;
import java.util.Scanner;

public class MainClass09 {
	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<>(); //key의 제너릭(거의 String 고정임)이랑 value의 제너릭(Object)을 입력해줘야함
		dic.put("house", "집");
		dic.put("phone", "전화기");
		dic.put("car", "자동차");
		dic.put("pencil", "연필");
		dic.put("eraser", "지우개");
		
		/*
		 * 검색할 단어를 입력하세요 : house
		 * house의 뜻은 집입니다.
		 * 
		 * 검색할 단어를 입력하세요 : gura
		 * gura는 목록에 없습니다.
		 */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print
		("검색할 단어를 입력하세요 : ");
		String word = sc.nextLine();
		
		if(dic.get(word) != null) {
			System.out.println(word + " 의 뜻은 "+dic.get(word) +"입니다");
		} else {
			System.out.println(word +" 는 목록에 없습니다.");
		}
		
		// 만일 HashMap 객체가 입력한 word를 key 값으로 가지고 있다면
		if(dic.containsKey(word)) {
			System.out.println(word + "의 뜻은 "+dic.get(word) +"입니다");
		} else {
			System.out.println(word +" 는 목록에 없습니다.");
			
		}
	}
}
