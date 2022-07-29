package constructors;

public class Main {

	public static void main(String[] args) {
		WithoutLombok withoutLombok = new WithoutLombok(12, "Without Lombok", 25.689);
		System.out.println(withoutLombok.getMyInt());
		System.out.println(withoutLombok.getMyString());
		System.out.println(withoutLombok.getMyDouble());
		
		WithLombok withLombok = new WithLombok(12, "Without Lombok", 25.689);
		WithLombok withLombok2 = new WithLombok();
		System.out.println(withLombok.getMyInt());
		System.out.println(withLombok.getMyString());
		System.out.println(withLombok.getMyDouble());
	}

}
