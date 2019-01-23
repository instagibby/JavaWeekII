package model;

public class StayOrGo {

	public static Object ShouldI(int i) {
		// TODO Auto-generated method stub
		if (i == 0) {
			return "Go";
		} else if (i == 1){
			return "Stay";
		} else {
			return null;
		}
		
	}

}
