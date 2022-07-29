package getter_setter;

public class Main {

	public static void main(String[] args) {
		WithoutLombok withoutLombok = new WithoutLombok();
		withoutLombok.setMyInt(12);
		withoutLombok.setMyString("This is without Lombok.");
		System.out.println(withoutLombok.getMyInt());
		System.out.println(withoutLombok.getMyString());
		
		WithLombok withLombok = new WithLombok();
		withLombok.setMyInt(25);
		withLombok.setMyString("This is with Lombok.");
		System.out.println(withLombok.getMyInt());
		System.out.println(withLombok.getMyString());
	}

}
