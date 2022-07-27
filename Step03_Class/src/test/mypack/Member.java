package test.mypack;
/*
 * Member 객체에 회원의 번호, 이름, 주소를 담고 싶다면
 * 클래스를 어떻게 설계를 해야할까?
 * 
 * 저장소가(필드)가 3ro 필요하다
 * 필드의 type은 int, String, String 이 적당할 것 같다.
 * 필드에 값은 나중에 new Member() 한 이후에 담을 예정
 */
public class Member {
	public	int num;
	public String name;
	public String addr;

	//메소드
	public void showInfo() {
		//this는 객체 자신의 참조값을 가르키는 예약어
		System.out.println("번호:"+this.num+"이름:"+this.name+"주소:"+this.addr);
	}
}