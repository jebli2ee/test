package hellorest;

public class Hello implements IHello {
	
	//hyhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh
	@Override
	public String sayHello(String name) {
		return "Hello: " + name;
	}
}