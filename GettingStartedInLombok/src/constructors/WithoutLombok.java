package constructors;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class WithoutLombok {
	private int myInt;
	private String myString;
	private double myDouble;
	
	public WithoutLombok() {
		
	}
	
	public WithoutLombok(int myInt, String myString, double myDouble) {
		this.myInt = myInt;
		this.myString = myString;
		this.myDouble = myDouble;
	}
}
