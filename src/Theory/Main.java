package Theory;

public class Main {
	public static void main(String[] args) {
		EnumExample c1 = EnumExample.RED;
		
		System.out.println("Red Enum Name: " + c1.name());
		System.out.println("Red Enum Value: " + c1.getValue());
		
		for(EnumExample color: EnumExample.values()) {
			System.out.println("Enum value: " + color.getValue());
		}
	}

}
