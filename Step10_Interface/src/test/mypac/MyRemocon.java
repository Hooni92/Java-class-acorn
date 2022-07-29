package test.mypac;

public class MyRemocon implements Remocon{
	
	int num=10;

	@Override
	public void up() {
		System.out.println("볼륨을 올려요!");
	}

	@Override
	public void down() {
		System.out.println("볼륨을 내려요!");
	}
}
