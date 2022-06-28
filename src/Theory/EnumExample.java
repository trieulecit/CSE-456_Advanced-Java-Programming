package Theory;

// Exercises on http://wiki.juneday.se/mediawiki/index.php/Java:Language_-_Enums_-_Exercises#Source_code

enum EnumExample {
	RED("red"), GREEN("green"), BLUE("blue");
	private String value;
	
	EnumExample(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
//	EnumExample c1 = EnumExample.RED;
//	
//	System.out.println("Red Enum Name: " + c1.name());
//	System.out.println("Red Enum Value: " + c1.getValue());
//	
//	for(EnumExample color: EnumExample.values()) {
//		System.out.println("Enum value: " + color.getValue());
//	}
}

// Question 1 first attempt

// Create a public enum Weekday with constants for MONDAY, TUESDAY,... until SUNDAY.
//enum Weekday {
//	MONDAY("Hello, today is Monday"),
//	TUESDAY("Hello, today is Tuesday"),
//	WEDNESDAY("Hello, today is Wednesday"),
//	THURSDAY("Hello, today is Thursday"),
//	FRIDAY("Hello, today is Friday"),
//	SATURDAY("Hello, today is Saturday"),
//	SUNDAY("Hello, today is Sunday");
//	
//	private String greetings;
//	//Enum constructor
//	Weekday(String greetings) {
//		this.greetings = greetings;
//	}
//	
//	//The enum should have an instance method boolean isWeekDay() and an instance method boolean isHoliday().
//	public boolean isWeekDay() {
//		return this != Weekday.SATURDAY && this != Weekday.SUNDAY;
//	}	
//	public boolean isHoliday() {
//		return !isWeekDay();
//	}
//	
//	public String getGreetings() {
//		return greetings;
//	}
//}

enum Weekday {
	  MONDAY,
	  TUESDAY,
	  WEDNESDAY,
	  THURSDAY,
	  FRIDAY,
	  SATURDAY,
	  SUNDAY;

	  public boolean isWeekday() {
	    return this != SATURDAY && this != SUNDAY;
	  }

	  public boolean isHoliday() {
	    return !isWeekday();
	  }
}

// Question 1 and 2 debugger
//public static void main(String[] args) {
//	for (Weekday day : Weekday.values()) {
//		testDay(day);
//		whichIsGreater(day);
//	}
//}
//
//private static void whichIsGreater(Weekday day) {
//	Weekday sat = Weekday.SATURDAY;
//	int result = day.compareTo(sat);
//	System.out.print(day + " is ");
//	if (result < 0) {
//		System.out.println("less than (before) " + sat);
//	} else if (result == 0) {
//		System.out.println("the same as " + sat);
//	} else {
//		System.out.println("greater than (after) " + sat);
//	}
//}
//
//private static void testDay(Weekday day) {
//	System.out.print("It's " + day);
//	if (day.isWeekday()) {
//		System.out.println(" Go to work.");
//	} else {
//		System.out.println(" Stay home and play with your cat.");
//	}
//}

