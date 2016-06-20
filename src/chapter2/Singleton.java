package chapter2;

public class Singleton {
	public static void main(String[] args) {
		Foo f = Foo.INSTANCE;
		//System.out.println(f.print());
		f.print();
	}
}

enum Foo{
	INSTANCE;
	public Foo getInstance(){
		return INSTANCE;
	}
	public void print(){
		System.out.println("hello foo!");
		
	}
}