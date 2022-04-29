package testpackage1;

public class ComparisonOperators {

	public static void main(String[] args) {
		
		int v1 = 1;
		int v2 = 2;
		
		if(v1 == v2) {
			System.out.println("values are equal");
		}
		
		if(v1 != v2) {
			System.out.println("values are not equal");
		}
		
		if(v1 > v2) {
			System.out.println("value 1 is greater than v2");
		}
		
		if(v1 < v2) {
			System.out.println("value 1 is less than v2");
		}

		if(v1 >= v2) {
			System.out.println("value 1 is greater than or equal to v2");
		}
		
		if(v1 <= v2) {
			System.out.println("value 1 is less than or equal than v2");
		}
	}

}
