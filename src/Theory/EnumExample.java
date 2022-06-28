package Theory;

enum EnumExample {
	RED("red"), GREEN("green"), BLUE("blue");
	private String value;
	
	EnumExample(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
