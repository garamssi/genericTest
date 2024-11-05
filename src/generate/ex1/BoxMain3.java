package generate.ex1;

public class BoxMain3 {
	public static void main(String[] args) {
		GenericBox<Integer> integerBox = new GenericBox<>();
		integerBox.set(1111);
//		integerBox.set("adad");

		Integer i = integerBox.get();

		System.out.println(i);

		GenericBox<String> stringBox = new GenericBox<>();
		stringBox.set("Hello");
		String s = stringBox.get();
		System.out.println(s);


	}
}
