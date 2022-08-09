package pac1;

public interface Interfac {
	
	 int i = 10;
	 int s = 20;
	 int f = 30;
	

	

	//public abstract void astractMethod();

	public  static void staticMethod() {
		System.out.println("Static method" + i + " "+ s + " " + f);
	}

	 abstract void instanceMethod(); 
	
	
	public default void defaultMethod() {
		System.out.println("Default 1 Method");
	}
	
	

	public static void main(String[] args) {

	}
	
	
	

}
