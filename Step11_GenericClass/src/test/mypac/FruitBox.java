package test.mypac;
/*
 *	T는 type 파라미터이다
 *
 *	T를 포괄 클래스(Generic 클래스) 라고 한다.
 *
 *	T는 하나의 대상만이 아니는 여러 개의 타입을 담을 때 사용하고 클래스를 사용하는 시점에 정하면 된다.
 */
public class FruitBox<T> {
	// 필드(사과를 담고 싶으면)
	private T item;
	// 필드에 값을 넣는 메소드
	public void setItem(T item) {
		this.item = item;
	}
	// 필드에 저장된 값을 리턴하는 메소드
	public T getItem() {
		return item;
	}
}
